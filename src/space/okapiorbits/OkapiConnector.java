package space.okapiorbits;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;

/**
 * This class provides helper methods to send and retrieve information to and from the OKAPI server.
 * @author Christopher Kebschull
 * @author Niels Perdijk
 * @version v2019-07 beta
 */
public class OkapiConnector {
	
	int responseCode;

	/**
	 * Handles the error messages handed over from the OKAPI and Auth0 end points.
	 * @author Niels Perdijk
	 */
	public static class ReportError extends Exception {
		private static final long serialVersionUID = 2526489312574632854L;

		public ReportError(String message) {
			super(message);
		}
	}

	/**
	 * Connect to the Auth0 identity provider {@link https://auth0.com} and retrieve an access token needed to communicate with the OKAPI end points.
	 * @param username
	 * @param password
	 * @return an access token as {@link String}
	 */
	public String getToken(String username, String password) {
		String accessTokenTransport = "blank";
		String authURL = "https://okapi-development.eu.auth0.com/oauth/token/";
		HttpURLConnection auth = null;

		try {
			JSONObject requestTokenPayloadJson = new JSONObject();
			requestTokenPayloadJson.put("grant_type", "password");
			requestTokenPayloadJson.put("username", username);
			requestTokenPayloadJson.put("password", password);
			requestTokenPayloadJson.put("audience", "https://api.okapiorbits.space/picard");
			requestTokenPayloadJson.put("scope",
					"('pass_predictions pass_prediction_requests' 'neptune_propagation neptune_propagation_request' 'pass_predictions_long pass_prediction_requests_long')");
			requestTokenPayloadJson.put("client_id", "jrk0ZTrTuApxUstXcXdu9r71IX5IeKD3");
			String requestTokenPayloadString = requestTokenPayloadJson.toString();

			// Create connection
			URL url = new URL(authURL);
			auth = (HttpURLConnection) url.openConnection();
			auth.setRequestMethod("POST");
			auth.setRequestProperty("Content-Type", "application/json");
			auth.setUseCaches(false);
			auth.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(auth.getOutputStream());
			wr.writeBytes(requestTokenPayloadString);
			wr.flush();
			wr.close();

			// Get Response
			if (auth.getResponseCode() >= 300) {
				InputStream isErr = auth.getErrorStream();
				BufferedReader rdErr = new BufferedReader(new InputStreamReader(isErr));
				StringBuffer response = new StringBuffer();
				String line;
				while ((line = rdErr.readLine()) != null) {
					response.append(line);
					response.append('\r');
				}
				rdErr.close();
				String errMessage = response.toString();
				if (auth.getResponseCode() == 400) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 403) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 429) {
					JSONObject error = new JSONObject();
					error.put("message",
							"Your auth0 account has been blocked after 10 failed logins, check your e-mail.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				}

			}

			InputStream is = auth.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			JSONObject responseJson = new JSONObject(response.toString());
			accessTokenTransport = responseJson.getString("access_token");
			System.out.println("Authentication successful");
			return accessTokenTransport;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (auth != null) {
				auth.disconnect();
			}
		}
		return accessTokenTransport;
	}

	/**
	 * Send a service execution request to the server.
	 * @param sendURL - the URL to a OKAPI end point
	 * @param bodyString - a JSON formatted request body containing information like an initial orbit or ground location
	 * @param accessTokenTransport - the access token enabling the access to the OKAPI services
	 * @return a request id from the server or "blank" as {@link String}
	 */
	public String SendRequest(String sendURL, String bodyString, String accessTokenTransport) {
		String requestId = "blank";
		HttpURLConnection sendRequest = null;

		try {
			// Create connection
			URL url = new URL(sendURL);
			sendRequest = (HttpURLConnection) url.openConnection();
			sendRequest.setRequestMethod("POST");
			sendRequest.setRequestProperty("Content-Type", "application/json");
			sendRequest.setRequestProperty("access_token", accessTokenTransport); // Legacy
			sendRequest.setRequestProperty("Authorization", "Bearer " + accessTokenTransport);
			sendRequest.setUseCaches(false);
			sendRequest.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(sendRequest.getOutputStream());
			wr.writeBytes(bodyString);
			wr.flush();
			wr.close();

			// Get Response
			if (sendRequest.getResponseCode() >= 300) {
				StringBuffer response = new StringBuffer();
				String errMessage = response.toString();
				if (sendRequest.getResponseCode() == 401) {
					JSONObject error = new JSONObject();
					error.put("message", "You are unathorized.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 500) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				}

			}

			InputStream is = sendRequest.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			JSONObject responseJson = new JSONObject(response.toString());
			requestId = responseJson.getString("request_id");

			System.out.println("send_request successful, with request ID: " + requestId);
			return requestId;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sendRequest != null) {
				sendRequest.disconnect();
			}
		}
		return requestId;
	}
	
	/**
	 * Returns the result related to the given request encapsulated in the URL from the OKAPI server.
	 * @param endpointURL - the URL to the OKAPI end point.
	 * @param accessTokenTransport - the access token enabling the access to the OKAPI services
	 * @return The JSON formatted response from the server as {@link String}
	 */
	public String GetResults(String endpointURL, String accessTokenTransport) {
		String resultsTransport = "blank";
		HttpURLConnection getResults = null;

		try {
			// Create connection
			URL url = new URL(endpointURL);
			getResults = (HttpURLConnection) url.openConnection();
			getResults.setRequestMethod("GET");
			getResults.setRequestProperty("Content-Type", "application/json");
			getResults.setRequestProperty("access_token", accessTokenTransport); // Legacy
			getResults.setRequestProperty("Authorization", "Bearer " + accessTokenTransport);

			// Get Response
			responseCode = getResults.getResponseCode();
			if (getResults.getResponseCode() >= 300) {
				StringBuffer response = new StringBuffer();
				String errMessage = response.toString();
				if (getResults.getResponseCode() == 401) {
					JSONObject error = new JSONObject();
					error.put("message", "You are unathorized.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 500) {
					JSONObject error = new JSONObject();
					error.put("message", errMessage);
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				}

			}

			InputStream is = getResults.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();

			resultsTransport = response.toString();
			return resultsTransport;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (getResults != null) {
				getResults.disconnect();
			}
		}
		return resultsTransport;
	}

}
