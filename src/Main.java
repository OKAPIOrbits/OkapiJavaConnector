import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {
	public static void main(String[] args) throws IOException {
		// initializing communication
		OkapiConnector Okapi = new OkapiConnector();
		String sendURL;
		String bodyString;
		String getURL;

		// user input AUTHENTICATION
		String username = <yourusername>;
		String password = <yourpassword>;
		// String baseUrl = "http://okapi-s1.ddns.net:34570";
		String baseUrl = "http://localhost:34568";

		// user input PASS PREDICTION
		double altitude = 0.048;
		double longitude = 10.645;
		double latitude = 52.328;
		String start = "2018-08-07T19:01:00.000Z";
		String end = "2018-08-07T19:04:00.000Z";
		String tle_pass_prediction = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

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
		String propagation_end_epoch_neptune_simple = "2016-07-23T03:31:50.000Z";
		double output_step_size_neptune_simple = 30;

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
		double atmospheric_drag = 1;
		String propagation_end_epoch_neptune_opm = "2016-07-23T00:31:50.000Z";
		double output_step_size_neptune_opm = 30;

		// user input Propagation: SGP4
		String propagation_end_epoch_propagation = "2018-08-08T00:00:00.000Z";
		double output_step_size_propagation = 100;
		String tle_propagation = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

		// authentication at Auth0
		String accessTokenTransport = Okapi.Init(username, password);
		System.out.println("Authentication completed");

		// PASS PREDICTION

		// preparation for pass prediction
		JSONObject simple_ground_location = new JSONObject();
		JSONObject time_window = new JSONObject();
		JSONObject pass_pred_request_body = new JSONObject();
		try {
			simple_ground_location.put("altitude", altitude);
			simple_ground_location.put("longitude", longitude);
			simple_ground_location.put("latitude", latitude);
			time_window.put("start", start);
			time_window.put("end", end);
			pass_pred_request_body.put("simple_ground_location", simple_ground_location);
			pass_pred_request_body.put("time_window", time_window);
			pass_pred_request_body.put("tle", tle_pass_prediction);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send request for SGP4 pass prediction
		String sgp4UrlRequest = "/predict-passes/sgp4/requests";
		String sgp4UrlRrequestCombined = baseUrl + sgp4UrlRequest;
		sendURL = sgp4UrlRrequestCombined;
		bodyString = pass_pred_request_body.toString();
		String requestIdSgp4 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		// send request for overview creation
		String overviewUrlRequest = "/pass/prediction/requests";
		String overviewUrlRequestCombined = baseUrl + overviewUrlRequest;
		sendURL = overviewUrlRequestCombined;
		bodyString = pass_pred_request_body.toString();
		String requestIdOverview = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		// send request for overview creation
		String trackingUrlRequest = "/pass/prediction/requests/long";
		String trackingUrlRequestCombined = baseUrl + trackingUrlRequest;
		sendURL = trackingUrlRequestCombined;
		bodyString = pass_pred_request_body.toString();
		String requestIdTracking = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send Pass Prediction completed");

		// get results for SGP4 and print them in the terminal
		String sgp4UrlGet = "/predict-passes/sgp4/simple/results/";
		String sgp4UrlGetCombined = baseUrl + sgp4UrlGet + requestIdSgp4;
		getURL = sgp4UrlGetCombined;
		String resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultSgp4 = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultSgp4);
		}

		// get results for overview creation and print them in the terminal
		String overviewUrlGet = "/pass/predictions/";
		String overviewUrlGetCombined = baseUrl + overviewUrlGet + requestIdOverview;
		getURL = overviewUrlGetCombined;
		String resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultOverview = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultOverview);
		}

		// get results for SGP4 and print them in the terminal
		String trackingUrlGet = "/pass/predictions/long/";
		String trackingUrlGetCombined = baseUrl + trackingUrlGet + requestIdTracking;
		getURL = trackingUrlGetCombined;
		String resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultTracking = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultTracking);
		}

		System.out.println("Get Pass Prediction completed");

		// Propagation: NEPTUNE simple

		// preparation for NEPTUNE simple
		JSONObject simple_state = new JSONObject();
		JSONObject neptune_config_simple = new JSONObject();
		JSONObject settings_simple = new JSONObject();
		JSONObject propagate_neptune_simple_request_body = new JSONObject();
		try {
			simple_state.put("area", area);
			simple_state.put("mass", mass);
			simple_state.put("x", x);
			simple_state.put("y", y);
			simple_state.put("z", z);
			simple_state.put("x_dot", x_dot);
			simple_state.put("y_dot", y_dot);
			simple_state.put("z_dot", z_dot);
			simple_state.put("epoch", epoch);
			neptune_config_simple.put("geopotential_degree_order", 6);
			neptune_config_simple.put("atmospheric_drag", 1);
			neptune_config_simple.put("horizontal_wind", 0);
			neptune_config_simple.put("sun_gravity", 1);
			neptune_config_simple.put("moon_gravity", 1);
			neptune_config_simple.put("solar_radiation_pressure", 1);
			neptune_config_simple.put("solid_tides", 1);
			neptune_config_simple.put("ocean_tides", 0);
			settings_simple.put("propagation_end_epoch", propagation_end_epoch_neptune_simple);
			settings_simple.put("output_step_size", output_step_size_neptune_simple);
			settings_simple.put("neptune_config", neptune_config_simple);
			propagate_neptune_simple_request_body.put("simple_state", simple_state);
			propagate_neptune_simple_request_body.put("settings", settings_simple);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send simple NEPTUNE request
		String neptuneUrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneUrlRequestCombined = baseUrl + neptuneUrlRequest;
		sendURL = neptuneUrlRequestCombined;
		bodyString = propagate_neptune_simple_request_body.toString();
		String requestIdNeptune = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send NEPTUNE simple completed");

		// get results for simple NEPTUNE propagation as OEM data
		String neptuneOemUrlGet = "/propagate-orbit/neptune/oem/results/";
		String neptuneOemUrlGetCombined = baseUrl + neptuneOemUrlGet + requestIdNeptune;
		getURL = neptuneOemUrlGetCombined;
		String resultNeptuneOem = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneOem = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultNeptuneOem = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneOem);
		}

		// get results for simple NEPTUNE propagation as OPM data
		String neptuneOpmUrlGet = "/propagate-orbit/neptune/opm/results/";
		String neptuneOpmUrlGetCombined = baseUrl + neptuneOpmUrlGet + requestIdNeptune;
		getURL = neptuneOpmUrlGetCombined;
		String resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultNeptuneOpm = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneOpm);
		}

		System.out.println("Get NEPTUNE simple completed");

		// NEPTUNE OPM

		// preparation for NEPTUNE OPM
		JSONObject OPM_HEADER = new JSONObject();
		JSONObject OPM_META_DATA = new JSONObject();
		JSONObject OPM_DATA = new JSONObject();
		JSONObject CCSDS_OPM = new JSONObject();
		JSONObject neptune_config_opm = new JSONObject();
		JSONObject settings_opm = new JSONObject();
		JSONObject propagate_neptune_opm_request_body = new JSONObject();
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
			neptune_config_opm.put("atmospheric_drag", atmospheric_drag);
			settings_opm.put("propagation_end_epoch", propagation_end_epoch_neptune_opm);
			settings_opm.put("output_step_size", output_step_size_neptune_opm);
			settings_opm.put("neptune_config", neptune_config_opm);
			propagate_neptune_opm_request_body.put("CCSDS_OPM", CCSDS_OPM);
			propagate_neptune_opm_request_body.put("settings", settings_opm);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send simple NEPTUNE request
		String neptuneOpm2UrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneOpm2UrlRequestCombined = baseUrl + neptuneOpm2UrlRequest;
		sendURL = neptuneOpm2UrlRequestCombined;
		bodyString = propagate_neptune_opm_request_body.toString();
		String requestIdNeptuneOpm2 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send OPM NEPTUNE completed");

		// get results for simple NEPTUNE propagation as OEM data
		String neptuneOpm2UrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneOpm2UrlGetCombined = baseUrl + neptuneOpm2UrlGet + requestIdNeptuneOpm2;
		getURL = neptuneOpm2UrlGetCombined;
		String resultNeptuneOpm2 = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneOpm2 = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultNeptuneOpm2 = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultNeptuneOpm2);
		}

		System.out.println("Get OPM NEPTUNE completed");

		// Propagation: SGP4

		// preparation for Propagation: SGP4
		JSONObject settings_sgp4 = new JSONObject();
		JSONObject propagate_sgp4_request_body = new JSONObject();
		try {
			settings_sgp4.put("propagation_end_epoch", propagation_end_epoch_propagation);
			settings_sgp4.put("output_step_size", output_step_size_propagation);
			propagate_sgp4_request_body.put("tle", tle_propagation);
			propagate_sgp4_request_body.put("settings", settings_sgp4);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send request for Propagation: SGP4
		String propagationSgp4UrlRequest = "/propagate-orbit/sgp4/requests/";
		String propagationSgp4UrlRequestCombined = baseUrl + propagationSgp4UrlRequest;
		sendURL = propagationSgp4UrlRequestCombined;
		bodyString = propagate_sgp4_request_body.toString();
		String requestIdPropagationSgp4 = Okapi.SendRequest(sendURL, bodyString, accessTokenTransport);

		System.out.println("Send Propagation: SGP4 completed");

		// get results for Propagation: SGP4 as simple result and print them in the
		// terminal
		String propagationSgp4SimpleUrlGet = "/propagate-orbit/sgp4/simple/results/";
		String propagationSgp4simpleUrlGetCombined = baseUrl + propagationSgp4SimpleUrlGet + requestIdPropagationSgp4;
		getURL = propagationSgp4simpleUrlGetCombined;
		String resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultsPropagationSgp4Simple = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultsPropagationSgp4Simple);
		}

		// get results for Propagation: SGP4 as omm result and print them in the
		// terminal
		String propagationSgp4OmmUrlGet = "/propagate-orbit/sgp4/omm/results/";
		String propagationsgp4OmmUrlGetCombined = baseUrl + propagationSgp4OmmUrlGet + requestIdPropagationSgp4;
		getURL = propagationsgp4OmmUrlGetCombined;
		String resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
		while (Okapi.response_code == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Okapi.response_code == 200) {
			resultsPropagationSgp4Omm = Okapi.GetResults(getURL, accessTokenTransport);
			System.out.println(resultsPropagationSgp4Omm);
		}

		System.out.println("Get Propagation: SGP4 completed");

		System.out.println("End");
	}
}
