package com.okapiorbits.platform;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.okapiorbits.platform.science.jobs.json.*;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;

/**
 * This class provides helper methods to send and retrieve information to and from the OKAPI platform.
 * <p>
 * Use the constructor {@link #OkapiConnector(String, String)} to set your username and password. Then retrieve a token 
 * that is valid for 24 hours via {@link #getToken()}.
 * </p>
 * <p>
 * Sending a request to the backend is done using {@link #send(String, String, String)} or conveniently with
 * a builtin 'wait for processing' feature using {@link #sendAndGetRequestId(String, String, String)}. The requestId is
 * needed to retrieve the results in the form of JSON strings from the backend: {@link #getValues(String, String)}.
 * 
 * Adding something (like a satellite) to the backend can also be done via {@link #send(String, String, String)}.
 * An update (for example to a satellite configuration) can be done using {@link #update(String, String, String)}.
 * To remove an item (e.g. satellite) use {@link #delete(String, String).}
 * </p>
 * <p>
 * There are specialized methods available that allow the direct handling of {@link Satellites}, {@link Conjunctions},
 * {@link SpaceTrackCdms} and {@link ManeuverEvals}:
 * <ul>
 *     <li>{@link #addSatellite(Satellite, String)}</li>
 *     <li>{@link #updateSatellite(Satellite, String)}</li>
 *     <li>{@link #updateSatellite(String, List<Integer>, Map<String, Object>, String)}</li>
 *     <li>{@link #deleteSatellite(String, String)}</li>
 *     <li>{@link #getSatellites(String)}</li>
 *     <li>{@link #getConjunctions(String)} (String)}</li>
 *     <li>{@link #getCdms(String, String)} </li>
 *     <li>{@link #getManeuverEvals(String, String)} </li>
 * </ul>
 * </p>
 * 
 * @author Christopher Kebschull
 * @author Niels Perdijk
 * @version v2022-04
 */
public class OkapiConnector {

	private final String username;
	private final String password;
	private final String baseUrl;

	private final ObjectMapper objectMapper = new ObjectMapper();
	
	int responseCode;

	/**
	 * Handles the error messages handed over from the OKAPI and Auth0 end points.
	 * @author Niels Perdijk
	 */
	public static class OkapiPlatformException extends Exception {
		private static final long serialVersionUID = 2526489312574632854L;

		public OkapiPlatformException(String message) {
			super(message);
		}
	}

	/**
	 * Collects the credentials used to retrieve the authentication token and uses https://api.okapiorbits.com/
	 * to communicate to the OKAPI platform.
	 * @param username - your OKAPI username
	 * @param password - your OKAPI platform password
	 */
	public OkapiConnector(String username, String password) {
		this(username,password,"https://api.okapiorbits.com/");
	}

	/**
	 * Collects the credentials used to retrieve the authentication token and the URL used to communicate with the platform.
	 * @param username - your OKAPI username
	 * @param password - your OKAPI platform password
	 * @param baseUrl - the URL pointing to the OKAPI backend
	 */
	public OkapiConnector(String username, String password, String baseUrl) {
		this.username = username;
		this.password = password;
		this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
		
		// Otherwise, when we write dates into the objects they are stringified
		// as timestamps. We want simple strings.
    	this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		// Don't include fields with null values in the serialized string.
		this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    
		// This way, the mapper can read the simple string dates as Date objects
		// This is the default format
		this.resetDateFormat();
	}
	
	private void resetDateFormat() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    	df.setTimeZone(TimeZone.getTimeZone("UTC"));
    	this.objectMapper.setDateFormat(df);
	}

	/**
	 * Connect to the Auth0 identity provider and retrieve an access token needed to communicate with the OKAPI end points.
	 * @return an access token as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String getToken() throws OkapiPlatformException {
		String accessToken;
		JSONObject requestTokenPayloadJson = new JSONObject();
		requestTokenPayloadJson.put("grant_type", "password");
		requestTokenPayloadJson.put("username", this.username);
		requestTokenPayloadJson.put("password", this.password);
		requestTokenPayloadJson.put("audience", "https://api.okapiorbits.space/picard");
		requestTokenPayloadJson.put("scope", "('')");
		requestTokenPayloadJson.put("client_id", "jrk0ZTrTuApxUstXcXdu9r71IX5IeKD3");
		String requestTokenPayloadString = requestTokenPayloadJson.toString();

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://okapi-development.eu.auth0.com/oauth/token"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(requestTokenPayloadString))
				.build();

		HttpResponse<String> response = null;
		for(int timeout = 0; timeout < 3; timeout++) {
			try {
				//TimeUnit.SECONDS.sleep(5);
				response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException | InterruptedException e) {
				if(response == null && timeout < 2) {
					continue;
				}
				JSONObject error = new JSONObject();
				error.put("message", e.getMessage());
				error.put("status", "FATAL");
				System.out.println(error);
				return error.toString();
			}
			this.responseCode = response.statusCode();
			break;
		}
		if (responseCode >= 300) {
			throw new OkapiPlatformException("HTTPError: " + response.statusCode() + "; Message: " + response.body());
		}
		JSONObject responseJson = new JSONObject(response.body());
		accessToken = responseJson.getString("access_token");
		return (accessToken);
	}

	/**
	 * Send a service execution request to the platform and retrieve the response. The response is parsed for the 'request_id' key.
	 * The key is returned
	 * @param endpoint - the request (POST) end point from the OKAPI interface definition
	 * @param bodyString - a JSON formatted request body containing information like an initial orbit or ground location
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return a request id from the platform
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String sendAndGetRequestId(String endpoint, String bodyString, String accessToken) throws OkapiPlatformException {
		String response = send(endpoint,bodyString,accessToken);
		JSONObject responseJson = new JSONObject(response);
		return responseJson.getString("request_id");
	}

	/**
	 * Send a service execution request to the platform and retrieve the response as string.
	 * @param endpoint - the request (POST) end point from the OKAPI interface definition, .e.g '/satellites'
	 * @param bodyString - a JSON formatted request body containing information like an initial orbit or ground location
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return a JSON from the platform or "{}" as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String send(String endpoint, String bodyString, String accessToken) throws OkapiPlatformException {
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(this.baseUrl + (endpoint.startsWith("/") ? endpoint.substring(1) : endpoint)))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.POST(HttpRequest.BodyPublishers.ofString(bodyString))
				.build();

		HttpResponse<String> response = null;
		for(int timeout = 0; timeout < 3; timeout++) {
			try {
				response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException | InterruptedException e) {
				if (response == null && timeout < 2) {
					continue;
				}
				JSONObject error = new JSONObject();
				error.put("message", e.getMessage());
				error.put("status", "FATAL");
				System.out.println(error);
				return error.toString();
			}

			this.responseCode = response.statusCode();
			if (responseCode >= 300 && timeout < 2) {
				continue;
			} else if (responseCode >= 300) {
				throw new OkapiPlatformException("HTTPError: " + response.statusCode() + "; Message: " + response.body());
			}
			break;
		}
		return (response.body());
	}

	/**
	 * Send a service update request to the platform and retrieve the response as string.
	 * @param endpoint - the request (UPDATE) end point from the OKAPI interface definition, .e.g '/satellites/$id'
	 * @param bodyString - a JSON formatted request body containing information like an initial orbit or ground location
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return a JSON from the platform or "{}" as {@link String}
	 */
	public String update(String endpoint, String bodyString, String accessToken) throws OkapiPlatformException {
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(this.baseUrl + (endpoint.startsWith("/") ? endpoint.substring(1) : endpoint)))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.method("PATCH", HttpRequest.BodyPublishers.ofString(bodyString))
				.build();

		HttpResponse<String> response = null;
		for(int timeout = 0; timeout < 3; timeout++) {
			try {
				//TimeUnit.SECONDS.sleep(5);
				response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException | InterruptedException e) {
				if (response == null && timeout < 2) {
					continue;
				}
				JSONObject error = new JSONObject();
				error.put("message", e.getMessage());
				error.put("status", "FATAL");
				System.out.println(error);
				return error.toString();
			}

			this.responseCode = response.statusCode();
			if (responseCode >= 300 && timeout < 2) {
				continue;
			} else if (responseCode >= 300) {
				throw new OkapiPlatformException("HTTPError: " + response.statusCode() + "; Message: " + response.body());
			}
			break;
		}

		return (response.body());
	}

	/**
	 * Waits 15 seconds and retrieves the results.
	 * @param endpoint - the request (GET) end point from the OKAPI interface definition, .e.g 'propagate-orbit/sgp4/results/$id/omm'
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return A JSON formatted response from the platform as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String waitForProcessingAndGetValues(String endpoint, String accessToken) throws OkapiPlatformException {
		return this.waitForProcessingAndGetValues(endpoint,accessToken,15);
	}

	/**
	 * Will wait for the backend and retrieves the results.
	 * @param endpoint - the request (GET) end point from the OKAPI interface definition, .e.g 'propagate-orbit/sgp4/results/$id/omm'
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @param timeout - time frame in seconds in which to poll the OKAPI platform for the results
	 * @return A JSON formatted response from the platform as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String waitForProcessingAndGetValues(String endpoint, String accessToken, int timeout) throws OkapiPlatformException {
		String resultNeptuneSimple;
		int requestCounter = 0;
		do {
			resultNeptuneSimple = this.getValues(endpoint, accessToken);
			requestCounter++;
			if (responseCode != 202) break;
			if (requestCounter == timeout) throw new OkapiPlatformException("No values retrieved from the backend within " + timeout + " seconds.");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(true);
		return resultNeptuneSimple;
	}
	
	/**
	 * Retrieves the values related to a given request encapsulated in the URL from the OKAPI platform.
	 * @param endpoint - the request (GET) end point from the OKAPI interface definition, .e.g 'propagate-orbit/sgp4/results/$id/omm'
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return A JSON formatted response from the platform as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String getValues(String endpoint, String accessToken) throws OkapiPlatformException {

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(this.baseUrl + (endpoint.startsWith("/") ? endpoint.substring(1) : endpoint)))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.GET()
				.build();

		HttpResponse<String> response = null;
		for(int timeout = 0; timeout < 3; timeout++) {
			try {
				//TimeUnit.SECONDS.sleep(5);
				response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException | InterruptedException e) {
				if (response == null && timeout < 2) {
					continue;
				}
				JSONObject error = new JSONObject();
				error.put("message", e.getMessage());
				error.put("status", "FATAL");
				System.out.println(error);
				return error.toString();
			}
			this.responseCode = response.statusCode();
			if (responseCode >= 300 && timeout < 2) {
				continue;
			} else if (responseCode >= 300) {
				throw new OkapiPlatformException("HTTPError: " + response.statusCode() + "; Message: " + response.body());
			}
			break;
		}
		return (response.body());
	}

	/**
	 * Send a remove request to the platform and retrieve the response as string.
	 * @param endpoint - the request (DELETE) end point from the OKAPI interface definition, .e.g '/satellites/$id'
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return A JSON formatted response from the platform as {@link String}
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 */
	public String delete(String endpoint, String accessToken) throws OkapiPlatformException {
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(this.baseUrl + (endpoint.startsWith("/") ? endpoint.substring(1) : endpoint)))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.DELETE()
				.build();

		HttpResponse<String> response = null;
		for(int timeout = 0; timeout < 3; timeout++) {
			try {
				//TimeUnit.SECONDS.sleep(5);
				response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException | InterruptedException e) {
				if (response == null && timeout < 2) {
					continue;
				}
				JSONObject error = new JSONObject();
				error.put("message", e.getMessage());
				error.put("status", "FATAL");
				System.out.println(error);
				return error.toString();
			}

			this.responseCode = response.statusCode();
			if (responseCode >= 300 && timeout < 2) {
				continue;
			} else if (responseCode >= 300) {
				throw new OkapiPlatformException("HTTPError: " + response.statusCode() + "; Message: " + response.body());
			}
			break;
		}
		return (response.body());
	}

	/**
	 * Adds a new {@link Satellite} to the collection in the OKAPI backend.
	 * @param newSatellite - A new {@link Satellite} definition, which must contain the name, satelliteId and Space-Track status
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return the {@link Satellite} as received in the backend. It will have a new satelliteId, which has been assigned by the backend!
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Satellite addSatellite(Satellite newSatellite, String accessToken) throws OkapiPlatformException, IOException {
		String newSatelliteAsString = this.objectMapper.writeValueAsString(newSatellite);
		String satellitesJsonString = send(
				"/satellites",
				newSatelliteAsString,
				accessToken);
		return this.objectMapper.readValue(satellitesJsonString, Satellite.class);
	}

	/**
	 * Updates a {@link Satellite} already present in the OKAPI backend.
	 * All fields that are set will be updated; fields that are not set will remain as they are in the backend.
	 * Be careful when using this method: If you create a new {@link Satellite} object,
	 * some fields will have default values, so this method may overwrite values you don't intend to overwrite.
	 * @params existingSatellite - a {@link Satellite} that already exists in the backend (it must contain a satelliteId)
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return the updated {@link Satellite} as received from the backend
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Satellite updateSatellite(Satellite satellite, String accessToken) throws OkapiPlatformException, IOException {
		String existingSatelliteAsString = this.objectMapper.writeValueAsString(satellite);
		String updatedSatellitesJsonString = update(
				"/satellites/" + satellite.getSatelliteId(),
				existingSatelliteAsString,
				accessToken);
		return this.objectMapper.readValue(updatedSatellitesJsonString, Satellite.class);
	}

	/**
	 * Updates a {@link Satellite} already present in the OKAPI backend.
	 * All given fields will be updated; all other fields will remain as they are in the backend.
	 * @params satelliteId - the unique OKAPI ID of the satellite
	 * @param updates - a map of fields to update for the satellite
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return the updated {@link Satellite} as received from the backend
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Satellite updateSatellite(String satelliteId, List<Integer> noradIds, Map<String, Object> updates, String accessToken) throws OkapiPlatformException, IOException {
		updates.put("name", "Satellite name to be set automatically");
		updates.put("satellite_id", satelliteId);
		updates.put("norad_ids", noradIds);
		String existingSatelliteAsString = this.objectMapper.writeValueAsString(updates);
		String updatedSatellitesJsonString = update(
				"/satellites/" + satelliteId,
				existingSatelliteAsString,
				accessToken);
		return this.objectMapper.readValue(updatedSatellitesJsonString, Satellite.class);
	}

	/**
	 * Removes a {@link Satellite} present in the OKAPI backend.
	 * @param satelliteId - the unique OKAPI ID of the satellite
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return the {@link Satellite} as received in the backend.
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Satellite deleteSatellite(String satelliteId, String accessToken) throws OkapiPlatformException, IOException {
		String updatedSatellitesJsonString = delete(
				"/satellites/" + satelliteId,
				accessToken);
		return this.objectMapper.readValue(updatedSatellitesJsonString, Satellite.class);
	}

	/**
	 * Retrieves {@link Satellites} connected to this account.
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return {@link Satellites}, which contains all satellites assigned to the account
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Satellites getSatellites(String accessToken) throws OkapiPlatformException, IOException {
		Satellites satellites;
		String satellitesJsonString = waitForProcessingAndGetValues("/satellites",accessToken);
		satellites = this.objectMapper.readValue(satellitesJsonString, Satellites.class);

		return satellites;
	}

	/**
	 * Retrieves {@link Conjunctions} for all satellites connected to this account.
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return {@link Conjunctions}, which contains all conjunctions in relation to all satellites assigned to the account
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public Conjunctions getConjunctions(String accessToken) throws OkapiPlatformException, IOException {
		Conjunctions conjunctions;
		String conjunctionsJsonString = waitForProcessingAndGetValues("/conjunctions",accessToken);
		conjunctions = this.objectMapper.readValue(conjunctionsJsonString, Conjunctions.class);

		return conjunctions;
	}

	/**
	 * Retrieves {@link SpaceTrackCdms} connected to the conjunction identified by the passed conjunction Id.
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return {@link SpaceTrackCdms}, which contains all CDMs in relation to the conjunction
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public SpaceTrackCdms getCdms(String conjunctionId, String accessToken) throws OkapiPlatformException, IOException {
		SpaceTrackCdms cdms;
		String cdmsJsonString = waitForProcessingAndGetValues("/conjunctions/"+conjunctionId+"/cdms",accessToken);
		cdms = this.objectMapper.readValue(cdmsJsonString, SpaceTrackCdms.class);

		return cdms;
	}

	/**
	 * Retrieves {@link ManeuverEvals} connected to the conjunction identified by the passed conjunction Id.
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return {@link ManeuverEvals}, which contains all maneuver evaluations in relation to the conjunction
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public ManeuverEvals getManeuverEvals(String conjunctionId, String accessToken) throws OkapiPlatformException, IOException {
		ManeuverEvals evals;
		String evalsJsonString = waitForProcessingAndGetValues("/conjunctions/"+conjunctionId+"/maneuver-evals",accessToken);
		evals = this.objectMapper.readValue(evalsJsonString, ManeuverEvals.class);

		return evals;
	}

	/**
	 * Adds new ground station passes as {@link MultiGroundStationPasses} to the OKAPI backend.
	 * @param newGroundStationPasses - A new {@link Satellite} definition, which must contain the name, satelliteId and Space-Track status
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return the {@link Satellite} as received in the backend. It will have a new satelliteId, which has been assigned by the backend!
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public MultiGroundStationPasses addMultiGroundStationPasses(MultiGroundStationPasses newGroundStationPasses, String accessToken) throws OkapiPlatformException, IOException {
	  // Set non-default date format
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    this.objectMapper.setDateFormat(df);
    
    // Stringify
		String newGroundStationPassesAsString = this.objectMapper.writeValueAsString(newGroundStationPasses);
		
		// Reset format
		this.resetDateFormat();
		
		// Send
		newGroundStationPassesAsString = send(
				"/multi-ground-station-passes",
				newGroundStationPassesAsString,
				accessToken);
				
    // Read/return
		return this.objectMapper.readValue(newGroundStationPassesAsString, MultiGroundStationPasses.class);
	}

	/**
	 * Retrieves ground station passes as {@link MultiGroundStationPassesInfo}.
	 * @param accessToken - the access token enabling the access to the OKAPI services
	 * @return {@link MultiGroundStationPassesInfo}, which contains all ground station passes of the current user and additional information
	 * @throws OkapiPlatformException Raised when the web status is different than 202/200 or a timeout occurs.
	 * @throws IOException Raised when the communication to the backend fails.
	 */
	public MultiGroundStationPassesInfo getMultiGroundStationPassesInfo(String accessToken) throws OkapiPlatformException, IOException {
		MultiGroundStationPassesInfo passes;
		String jsonString = waitForProcessingAndGetValues("/multi-ground-station-passes-info", accessToken);
		//System.out.println(jsonString);
		passes = this.objectMapper.readValue(jsonString, MultiGroundStationPassesInfo.class);

		return passes;
	}
}
