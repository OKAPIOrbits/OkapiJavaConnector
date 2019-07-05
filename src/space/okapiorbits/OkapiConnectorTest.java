package space.okapiorbits;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class tests the {@link OkapiConnector} using example input and sends them to the end points of the available OKAPI server.
 * @author Christopher Kebschull
 * @author Niels Perdijk
 * @version v2019-08 beta
 */
public class OkapiConnectorTest {
	
	/**
	 * Main method which initializes the OKAPI connector using a given username and password, followed by several exemplary requests.
	 * @param args - not used
	 * @throws IOException - when the communication with the server does not work as expected
	 */
	public static void main(String[] args) throws IOException {
		// initializing communication
		OkapiConnector Okapi = new OkapiConnector();
		String sendURL;
		String bodyString;
		String getURL;

		// user input AUTHENTICATION
		String username = <username>;
		String password = <password>;
		String baseUrl = "http://okapi.ddns.net:34569";		

		// user input PASS PREDICTION
		double altitude = 0.048;
		double longitude = 10.645;
		double latitude = 52.328;
		String start = "2018-08-07T19:01:00.000Z";
		String end = "2018-08-07T19:04:00.000Z";
		String tlePassPrediction = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

		// user input NEPTUNE simple
		double area = 1;
		double mass = 1;
		double x = 615.119526;
		double y = -7095.644839;
		double z = -678.668352;
		double x_dot = 0.390367;
		double y_dot = 0.741902;
		double z_dot = -7.39698;
		String epoch = "2016-07-23T00:31:50.000Z";
		String propagationEndEpochNeptuneSimple = "2016-07-23T03:31:50.000Z";
		double outputStepSizeNeptuneSimple = 30;

		// user input NEPTUNE OPM
		// meta data
		String OBJECT_NAME = "ISS (ZARYA)";
		String OBJECT_ID = "1998-067-A";
		String CENTER_NAME = "EARTH";
		String REF_FRAME = "GCRF";
		String REF_FRAME_EPOCH = "2000-01-01T00:00:00Z";
		String TIME_SYSTEM = "UTC";
		// data
		String EPOCH = "2016-07-22T00:31:50.000Z";
		double X = 615.119526;
		double Y = -7095.644839;
		double Z = -678.668352;
		double X_DOT = 0.390367;
		double Y_DOT = 0.741902;
		double Z_DOT = -7.39698;
		double MASS = 1;
		double SOLAR_RAD_COEFF = 1.3;
		double DRAG_AREA = 1;
		double DRAG_COEFF = 2.2;
		double atmosphericDrag = 1;
		String propagationEndEpochNeptuneOpm = "2016-07-23T00:31:50.000Z";
		double outputStepSizeNeptuneOpm = 30;

		// user input Propagation: SGP4
		String propagationEndEpochPropagation = "2018-08-08T00:00:00.000Z";
		double outputStepSizePropagation = 100;
		String tlePropagation = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

		// authentication at Auth0
		String accessTokenTransport = Okapi.getToken(username, password);
		System.out.println("Authentication completed");

		// PASS PREDICTION

		// preparation for pass prediction
		JSONObject simpleGroundLocation = new JSONObject();
		JSONObject timeWindow = new JSONObject();
		JSONObject passPredRequestBody = new JSONObject();
		try {
			simpleGroundLocation.put("altitude", altitude);
			simpleGroundLocation.put("longitude", longitude);
			simpleGroundLocation.put("latitude", latitude);
			timeWindow.put("start", start);
			timeWindow.put("end", end);
			passPredRequestBody.put("simple_ground_location", simpleGroundLocation);
			passPredRequestBody.put("time_window", timeWindow);
			passPredRequestBody.put("tle", tlePassPrediction);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// send request for SGP4 pass prediction
		String sgp4UrlRequest = "/predict-passes/sgp4/requests";
		String sgp4UrlRrequestCombined = baseUrl + sgp4UrlRequest;
		sendURL = sgp4UrlRrequestCombined;
		bodyString = passPredRequestBody.toString();
		String requestIdSgp4 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		// send request for overview creation
		String overviewUrlRequest = "/pass/prediction/requests";
		String overviewUrlRequestCombined = baseUrl + overviewUrlRequest;
		sendURL = overviewUrlRequestCombined;
		bodyString = passPredRequestBody.toString();
		String requestIdOverview = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		// send request for overview creation
		String trackingUrlRequest = "/pass/prediction/requests/long";
		String trackingUrlRequestCombined = baseUrl + trackingUrlRequest;
		sendURL = trackingUrlRequestCombined;
		bodyString = passPredRequestBody.toString();
		String requestIdTracking = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send Pass Prediction completed");

		// get results for SGP4 and print them in the terminal
		String sgp4UrlGet = "/predict-passes/sgp4/simple/results/";
		String sgp4UrlGetCombined = baseUrl + sgp4UrlGet + requestIdSgp4;
		getURL = sgp4UrlGetCombined;
		String resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultSgp4);
		}

		// get results for overview creation and print them in the terminal
		String overviewUrlGet = "/pass/predictions/";
		String overviewUrlGetCombined = baseUrl + overviewUrlGet + requestIdOverview;
		getURL = overviewUrlGetCombined;
		String resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultOverview);
		}

		// get results for SGP4 and print them in the terminal
		String trackingUrlGet = "/pass/predictions/long/";
		String trackingUrlGetCombined = baseUrl + trackingUrlGet + requestIdTracking;
		getURL = trackingUrlGetCombined;
		String resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultTracking);
		}

		System.out.println("Get Pass Prediction completed");

		// Propagation: NEPTUNE simple

		// preparation for NEPTUNE simple
		JSONObject simpleState = new JSONObject();
		JSONObject neptuneConfigSimple = new JSONObject();
		JSONObject settingsSimple = new JSONObject();
		JSONObject propagateNeptuneSimpleRequestBody = new JSONObject();
		try {
			simpleState.put("area", area);
			simpleState.put("mass", mass);
			simpleState.put("x", x);
			simpleState.put("y", y);
			simpleState.put("z", z);
			simpleState.put("x_dot", x_dot);
			simpleState.put("y_dot", y_dot);
			simpleState.put("z_dot", z_dot);
			simpleState.put("epoch", epoch);
			neptuneConfigSimple.put("geopotential_degree_order", 6);
			neptuneConfigSimple.put("atmospheric_drag", 1);
			neptuneConfigSimple.put("horizontal_wind", 0);
			neptuneConfigSimple.put("sun_gravity", 1);
			neptuneConfigSimple.put("moon_gravity", 1);
			neptuneConfigSimple.put("solar_radiation_pressure", 1);
			neptuneConfigSimple.put("solid_tides", 1);
			neptuneConfigSimple.put("ocean_tides", 0);
			settingsSimple.put("propagation_end_epoch", propagationEndEpochNeptuneSimple);
			settingsSimple.put("output_step_size", outputStepSizeNeptuneSimple);
			settingsSimple.put("neptune_config", neptuneConfigSimple);
			propagateNeptuneSimpleRequestBody.put("simple_state", simpleState);
			propagateNeptuneSimpleRequestBody.put("settings", settingsSimple);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Send simple NEPTUNE request
		String neptuneUrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneUrlRequestCombined = baseUrl + neptuneUrlRequest;
		sendURL = neptuneUrlRequestCombined;
		bodyString = propagateNeptuneSimpleRequestBody.toString();
		String requestIdNeptune = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send NEPTUNE simple completed");

		// Retrieve results for simple NEPTUNE propagation as simple formatted data
		String neptuneSimpleUrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimpleUrlGetCombined = baseUrl + neptuneSimpleUrlGet + requestIdNeptune;
		getURL = neptuneSimpleUrlGetCombined;
		String resultNeptuneSimple = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimple = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultNeptuneSimple = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneSimple);
		}

		// Retrieve results for simple NEPTUNE propagation request as OPM formatted data
		String neptuneOpmUrlGet = "/propagate-orbit/neptune/opm/results/";
		String neptuneOpmUrlGetCombined = baseUrl + neptuneOpmUrlGet + requestIdNeptune;
		getURL = neptuneOpmUrlGetCombined;
		String resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneOpm);
		}

		System.out.println("Get NEPTUNE OPM completed");

		// NEPTUNE OPM

		// Preparation for NEPTUNE OPM
		JSONObject OPM_HEADER = new JSONObject();
		JSONObject OPM_META_DATA = new JSONObject();
		JSONObject OPM_DATA = new JSONObject();
		JSONObject CCSDS_OPM = new JSONObject();
		JSONObject neptuneConfigOpm = new JSONObject();
		JSONObject settingsOpm = new JSONObject();
		JSONObject propagateNeptuneOpmRequestBody = new JSONObject();
		try {
			OPM_HEADER.put("CCSDS_OPM_VERS", 2);
			OPM_META_DATA.put("OBJECT_NAME", OBJECT_NAME);
			OPM_META_DATA.put("OBJECT_ID", OBJECT_ID);
			OPM_META_DATA.put("CENTER_NAME", CENTER_NAME);
			OPM_META_DATA.put("REF_FRAME", REF_FRAME);
			OPM_META_DATA.put("REF_FRAME_EPOCH", REF_FRAME_EPOCH);
			OPM_META_DATA.put("TIME_SYSTEM", TIME_SYSTEM);
			OPM_DATA.put("EPOCH", EPOCH);
			OPM_DATA.put("X", X);
			OPM_DATA.put("Y", Y);
			OPM_DATA.put("Z", Z);
			OPM_DATA.put("X_DOT", X_DOT);
			OPM_DATA.put("Y_DOT", Y_DOT);
			OPM_DATA.put("Z_DOT", Z_DOT);
			OPM_DATA.put("MASS", MASS);
			OPM_DATA.put("SOLAR_RAD_COEFF", SOLAR_RAD_COEFF);
			OPM_DATA.put("DRAG_AREA", DRAG_AREA);
			OPM_DATA.put("DRAG_COEFF", DRAG_COEFF);
			CCSDS_OPM.put("OPM_HEADER", OPM_HEADER);
			CCSDS_OPM.put("OPM_META_DATA", OPM_META_DATA);
			CCSDS_OPM.put("OPM_DATA", OPM_DATA);
			neptuneConfigOpm.put("atmospheric_drag", atmosphericDrag);
			settingsOpm.put("propagation_end_epoch", propagationEndEpochNeptuneOpm);
			settingsOpm.put("output_step_size", outputStepSizeNeptuneOpm);
			settingsOpm.put("neptune_config", neptuneConfigOpm);
			propagateNeptuneOpmRequestBody.put("CCSDS_OPM", CCSDS_OPM);
			propagateNeptuneOpmRequestBody.put("settings", settingsOpm);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Send NEPTUNE request using OPM formatted data
		String neptuneOpm2UrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneOpm2UrlRequestCombined = baseUrl + neptuneOpm2UrlRequest;
		sendURL = neptuneOpm2UrlRequestCombined;
		bodyString = propagateNeptuneOpmRequestBody.toString();
		String requestIdNeptuneOpm2 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send OPM NEPTUNE completed");

		// Retrieve results from OPM NEPTUNE propagation request in simple format
		String neptuneSimple2UrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimple2UrlGetCombined = baseUrl + neptuneSimple2UrlGet + requestIdNeptuneOpm2;
		getURL = neptuneSimple2UrlGetCombined;
		String resultNeptuneSimple2 = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimple2 = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultNeptuneSimple2 = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneSimple2);
		}

		System.out.println("Get OPM-Simple NEPTUNE completed");
		
		// Send NEPTUNE request using OPM formatted data
		String neptuneOpmGenericUrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneOpmGenericUrlRequestCombined = baseUrl + neptuneOpmGenericUrlRequest;
		sendURL = neptuneOpmGenericUrlRequestCombined;
		bodyString = propagateNeptuneOpmRequestBody.toString();
		String requestIdNeptuneOpmGeneric = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send OPM NEPTUNE completed");

		// Retrieve results from OPM NEPTUNE propagation request in simple format
		String neptuneSimpleGenericUrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimpleGenericUrlGetCombined = baseUrl + neptuneSimpleGenericUrlGet + requestIdNeptuneOpmGeneric + "/generic";
		getURL = neptuneSimpleGenericUrlGetCombined;
		String resultNeptuneSimpleGeneric = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimpleGeneric = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultNeptuneSimpleGeneric = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneSimpleGeneric);
		}

		System.out.println("Get OPM-Simple-Generic NEPTUNE completed");

		// Propagation: SGP4

		// preparation for Propagation: SGP4
		JSONObject settingsSgp4 = new JSONObject();
		JSONObject propagateSgp4RequestBody = new JSONObject();
		try {
			settingsSgp4.put("propagation_end_epoch", propagationEndEpochPropagation);
			settingsSgp4.put("output_step_size", outputStepSizePropagation);
			propagateSgp4RequestBody.put("tle", tlePropagation);
			propagateSgp4RequestBody.put("settings", settingsSgp4);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// send request for Propagation: SGP4
		String propagationSgp4UrlRequest = "/propagate-orbit/sgp4/requests/";
		String propagationSgp4UrlRequestCombined = baseUrl + propagationSgp4UrlRequest;
		sendURL = propagationSgp4UrlRequestCombined;
		bodyString = propagateSgp4RequestBody.toString();
		String requestIdPropagationSgp4 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send Propagation: SGP4 completed");

		// get results for Propagation: SGP4 as simple result and print them in the
		// terminal
		String propagationSgp4SimpleUrlGet = "/propagate-orbit/sgp4/simple/results/";
		String propagationSgp4simpleUrlGetCombined = baseUrl + propagationSgp4SimpleUrlGet + requestIdPropagationSgp4;
		getURL = propagationSgp4simpleUrlGetCombined;
		String resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultsPropagationSgp4Simple);
		}
		
		System.out.println("Get Propagation: SGP4 simple completed");

		// get results for Propagation: SGP4 as omm result and print them in the
		// terminal
		String propagationSgp4OmmUrlGet = "/propagate-orbit/sgp4/omm/results/";
		String propagationsgp4OmmUrlGetCombined = baseUrl + propagationSgp4OmmUrlGet + requestIdPropagationSgp4;
		getURL = propagationsgp4OmmUrlGetCombined;
		String resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (Okapi.responseCode == 200) {
			resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultsPropagationSgp4Omm);
		}

		System.out.println("Get Propagation: SGP4 OMM completed");

		System.out.println("End");
	}
}
