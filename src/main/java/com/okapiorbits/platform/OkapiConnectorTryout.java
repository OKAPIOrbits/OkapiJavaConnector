package com.okapiorbits.platform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okapiorbits.platform.science.jobs.json.*;
import org.json.JSONObject;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import java.text.ParseException;

/**
 * This class tests the {@link OkapiConnector} using example input and sends them to the end points of the available
 * OKAPI platform.
 * @author Christopher Kebschull
 * @author Niels Perdijk
 * @version v2022-04
 */
public class OkapiConnectorTryout {

	static String satelliteId;
	static String conjunctionId;
	
	/**
	 * Main method which initializes the OKAPI connector using a given username and password, followed by several exemplary requests.
	 * @param args - not used
	 */
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		String username = dotenv.get("OKAPI_USERNAME");
		String password = dotenv.get("OKAPI_PASSWORD");
		// initializing communication
		OkapiConnector okapiConnector = new OkapiConnector(
				username,
				password
		);
		
		System.out.println("Testing Start");
		
		// authentication at Auth0
		System.out.println("[Authentication] - started");
		String accessToken;
		try {
			accessToken = okapiConnector.getToken();
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		System.out.println(accessToken);
		System.out.println("[Authentication] - completed");

		System.out.println("[Add satellite] - started");
		addSatelliteTest(okapiConnector,accessToken);
		System.out.println("[Add satellite] - completed");

		System.out.println("[Update satellite] - started");
		updateSatelliteTest(okapiConnector,accessToken);
		System.out.println("[Update satellite] - completed");

		System.out.println("[Get satellites] - started");
		getSatellitesTest(okapiConnector,accessToken);
		System.out.println("[Get satellites] - completed");

		System.out.println("[Remove satellite] - started");
		removeSatelliteTest(okapiConnector,accessToken);
		System.out.println("[Remove satellite] - completed");

		System.out.println("[Get conjunctions] - started");
		getConjunctionsTest(okapiConnector,accessToken);
		System.out.println("[Get conjunctions] - completed");

		if (conjunctionId != null) {
			System.out.println("[Get cdms] - started");
			getCdmsTest(okapiConnector,accessToken);
			System.out.println("[Get cdms] - completed");

			System.out.println("[Get maneuver evals] - started");
			getManeuverEvaluationsTest(okapiConnector,accessToken);
			System.out.println("[Get maneuver evals] - completed");
		}

		System.out.println("[Estimate risk all methods] - started");
		riskEstimationTest(okapiConnector,accessToken);
		System.out.println("[Estimate risk all methods] - completed");

		System.out.println("[Predict passes] - started");
		predictPassesTests(okapiConnector,accessToken);
		System.out.println("[Predict passes] - completed");

		System.out.println("[Propagate orbit NEPTUNE] - started");
		neptuneTest(okapiConnector,accessToken);
		System.out.println("[Propagate orbit NEPTUNE] - completed");

		System.out.println("Testing End");
	}

	/**
	 * Tests the /estimate-risk/all-methods/requests end point
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void riskEstimationTest(OkapiConnector okapi, String accessToken) {
		String bodyString =
				"{\"conjunction\":{" +
						"\"type\":\"cdm.json\"," +
						"\"content\":" +
							"{\"CONSTELLATION\":\"OKAPI\",\"CDM_ID\":\"1234\",\"FILENAME\":\"123_conj_456_20200108_1234.xml\",\"INSERT_EPOCH\":\"2020-01-09 12:00:00\",\"CCSDS_CDM_VERS\":\"1.0\",\"CREATION_DATE\":\"2020-01-09 11:00:00\",\"CREATION_DATE_FRACTION\":\"0\",\"ORIGINATOR\":\"JSPOC\",\"MESSAGE_FOR\":\"OKAPISAT\",\"MESSAGE_ID\":\"1234_conj_4567_20200109_123456789\",\"COMMENT_EMERGENCY_REPORTABLE\":\"null\",\"TCA\":\"2020-01-10 09:00:00\",\"TCA_FRACTION\":\"00\",\"MISS_DISTANCE\":\"800\",\"MISS_DISTANCE_UNIT\":\"m\",\"RELATIVE_SPEED\":\"15000\",\"RELATIVE_SPEED_UNIT\":\"m\\/s\",\"RELATIVE_POSITION_R\":\"-70.0\",\"RELATIVE_POSITION_R_UNIT\":\"m\",\"RELATIVE_POSITION_T\":\"110.0\",\"RELATIVE_POSITION_T_UNIT\":\"m\",\"RELATIVE_POSITION_N\":\"790.0\",\"RELATIVE_POSITION_N_UNIT\":\"m\",\"RELATIVE_VELOCITY_R\":\"11.4\",\"RELATIVE_VELOCITY_R_UNIT\":\"m\\/s\",\"RELATIVE_VELOCITY_T\":\"-14850\",\"RELATIVE_VELOCITY_T_UNIT\":\"m\\/s\",\"RELATIVE_VELOCITY_N\":\"2050.0\",\"RELATIVE_VELOCITY_N_UNIT\":\"m\\/s\",\"COLLISION_PROBABILITY\":\"0\",\"COLLISION_PROBABILITY_METHOD\":\"FOSTER-1992\",\"SAT1_OBJECT\":\"OBJECT1\",\"SAT1_OBJECT_DESIGNATOR\":\"1234\",\"SAT1_CATALOG_NAME\":\"SATCAT\",\"SAT1_OBJECT_NAME\":\"OKAPISAT\",\"SAT1_INTERNATIONAL_DESIGNATOR\":\"2021-001E\",\"SAT1_OBJECT_TYPE\":\"PAYLOAD\",\"SAT1_EPHEMERIS_NAME\":\"NONE\",\"SAT1_COVARIANCE_METHOD\":\"CALCULATED\",\"SAT1_MANEUVERABLE\":\"NO\",\"SAT1_REF_FRAME\":\"ITRF\",\"SAT1_GRAVITY_MODEL\":\"EGM-96: 36D 36O\",\"SAT1_ATMOSPHERIC_MODEL\":\"JBH09\",\"SAT1_N_BODY_PERTURBATIONS\":\"MOON,SUN\",\"SAT1_SOLAR_RAD_PRESSURE\":\"YES\",\"SAT1_EARTH_TIDES\":\"YES\",\"SAT1_INTRACK_THRUST\":\"NO\",\"SAT1_TIME_LASTOB_START\":\"2020-01-08 08:00:00\",\"SAT1_TIME_LASTOB_START_FRACTION\":\"0\",\"SAT1_TIME_LASTOB_END\":\"2020-01-20 08:00:00\",\"SAT1_TIME_LASTOB_END_FRACTION\":\"0\",\"SAT1_RECOMMENDED_OD_SPAN\":\"5.42\",\"SAT1_RECOMMENDED_OD_SPAN_UNIT\":\"d\",\"SAT1_ACTUAL_OD_SPAN\":\"4.30\",\"SAT1_ACTUAL_OD_SPAN_UNIT\":\"d\",\"SAT1_OBS_AVAILABLE\":\"183\",\"SAT1_OBS_USED\":\"183\",\"SAT1_RESIDUALS_ACCEPTED\":\"97.4\",\"SAT1_RESIDUALS_ACCEPTED_UNIT\":\"%\",\"SAT1_WEIGHTED_RMS\":\"0.978\",\"SAT1_COMMENT_APOGEE\":\"Apogee Altitude = 601   [km]\",\"SAT1_COMMENT_PERIGEE\":\"Perigee Altitude = 600   [km]\",\"SAT1_COMMENT_INCLINATION\":\"Inclination = 97.0  [deg]\",\"SAT1_AREA_PC\":\"0.4\",\"SAT1_AREA_PC_UNIT\":\"m**2\",\"SAT1_CD_AREA_OVER_MASS\":\"0.02\",\"SAT1_CD_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT1_CR_AREA_OVER_MASS\":\"0.007\",\"SAT1_CR_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT1_THRUST_ACCELERATION\":\"0\",\"SAT1_THRUST_ACCELERATION_UNIT\":\"m\\/s**2\",\"SAT1_SEDR\":\"6.0e-05\",\"SAT1_SEDR_UNIT\":\"W\\/kg\",\"SAT1_X\":\"6562.2804\",\"SAT1_X_UNIT\":\"km\",\"SAT1_Y\":\"1703.04577\",\"SAT1_Y_UNIT\":\"km\",\"SAT1_Z\":\"1592.077551\",\"SAT1_Z_UNIT\":\"km\",\"SAT1_X_DOT\":\"-1.28827778\",\"SAT1_X_DOT_UNIT\":\"km\\/s\",\"SAT1_Y_DOT\":\"-1.90418306\",\"SAT1_Y_DOT_UNIT\":\"km\\/s\",\"SAT1_Z_DOT\":\"7.30255187\",\"SAT1_Z_DOT_UNIT\":\"km\\/s\",\"SAT1_CR_R\":\"46.1461856511049\",\"SAT1_CR_R_UNIT\":\"m**2\",\"SAT1_CT_R\":\"42.3471255956732\",\"SAT1_CT_R_UNIT\":\"m**2\",\"SAT1_CT_T\":\"302.242625462294\",\"SAT1_CT_T_UNIT\":\"m**2\",\"SAT1_CN_R\":\"2.33965674350612\",\"SAT1_CN_R_UNIT\":\"m**2\",\"SAT1_CN_T\":\"-7.52607416991497\",\"SAT1_CN_T_UNIT\":\"m**2\",\"SAT1_CN_N\":\"26.3489367881701\",\"SAT1_CN_N_UNIT\":\"m**2\",\"SAT1_CRDOT_R\":\"-0.0547784235749886\",\"SAT1_CRDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_T\":\"-0.295120151146788\",\"SAT1_CRDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_N\":\"-0.000325743726599067\",\"SAT1_CRDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_RDOT\":\"0.00031032143490407\",\"SAT1_CRDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CTDOT_R\":\"-0.0501856442302755\",\"SAT1_CTDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_T\":\"-0.0471861244930156\",\"SAT1_CTDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_N\":\"-0.00252782542649572\",\"SAT1_CTDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_RDOT\":\"6.07418730203252e-05\",\"SAT1_CTDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CTDOT_TDOT\":\"5.45874543922052e-05\",\"SAT1_CTDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_R\":\"-0.00751381926357464\",\"SAT1_CNDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_T\":\"-0.00371414808055227\",\"SAT1_CNDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_N\":\"-0.0113588008096445\",\"SAT1_CNDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_RDOT\":\"1.09417486735304e-05\",\"SAT1_CNDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_TDOT\":\"8.17704363245973e-06\",\"SAT1_CNDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_NDOT\":\"1.74453648788543e-05\",\"SAT1_CNDOT_NDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CDRG_R\":\"0\",\"SAT1_CDRG_R_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_T\":\"0\",\"SAT1_CDRG_T_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_N\":\"0\",\"SAT1_CDRG_N_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_RDOT\":\"0\",\"SAT1_CDRG_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_TDOT\":\"0\",\"SAT1_CDRG_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_NDOT\":\"0\",\"SAT1_CDRG_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_DRG\":\"0\",\"SAT1_CDRG_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT1_CSRP_R\":\"0\",\"SAT1_CSRP_R_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_T\":\"0\",\"SAT1_CSRP_T_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_N\":\"0\",\"SAT1_CSRP_N_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_RDOT\":\"0\",\"SAT1_CSRP_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_TDOT\":\"0\",\"SAT1_CSRP_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_NDOT\":\"0\",\"SAT1_CSRP_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_DRG\":\"0\",\"SAT1_CSRP_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT1_CSRP_SRP\":\"0\",\"SAT1_CSRP_SRP_UNIT\":\"m**4\\/kg**2\",\"SAT2_OBJECT\":\"OBJECT2\",\"SAT2_OBJECT_DESIGNATOR\":\"5678\",\"SAT2_CATALOG_NAME\":\"SATCAT\",\"SAT2_OBJECT_NAME\":\"OBJECT 2\",\"SAT2_INTERNATIONAL_DESIGNATOR\":\"2000-022A\",\"SAT2_OBJECT_TYPE\":\"TBA\",\"SAT2_OPERATOR_CONTACT_POSITION\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~5678\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_OPERATOR_ORGANIZATION\":\"NONE\",\"SAT2_OPERATOR_PHONE\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~5678\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_OPERATOR_EMAIL\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~5678\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_EPHEMERIS_NAME\":\"NONE\",\"SAT2_COVARIANCE_METHOD\":\"CALCULATED\",\"SAT2_MANEUVERABLE\":\"N\\/A\",\"SAT2_REF_FRAME\":\"ITRF\",\"SAT2_GRAVITY_MODEL\":\"EGM-96: 36D 36O\",\"SAT2_ATMOSPHERIC_MODEL\":\"JBH09\",\"SAT2_N_BODY_PERTURBATIONS\":\"MOON,SUN\",\"SAT2_SOLAR_RAD_PRESSURE\":\"YES\",\"SAT2_EARTH_TIDES\":\"YES\",\"SAT2_INTRACK_THRUST\":\"NO\",\"SAT2_TIME_LASTOB_START\":\"2020-01-09 08:00:00\",\"SAT2_TIME_LASTOB_START_FRACTION\":\"0\",\"SAT2_TIME_LASTOB_END\":\"2020-01-09 09:00:00\",\"SAT2_TIME_LASTOB_END_FRACTION\":\"0\",\"SAT2_RECOMMENDED_OD_SPAN\":\"8.13\",\"SAT2_RECOMMENDED_OD_SPAN_UNIT\":\"d\",\"SAT2_ACTUAL_OD_SPAN\":\"8.13\",\"SAT2_ACTUAL_OD_SPAN_UNIT\":\"d\",\"SAT2_OBS_AVAILABLE\":\"140\",\"SAT2_OBS_USED\":\"138\",\"SAT2_RESIDUALS_ACCEPTED\":\"99.4\",\"SAT2_RESIDUALS_ACCEPTED_UNIT\":\"%\",\"SAT2_WEIGHTED_RMS\":\"1.52\",\"SAT2_COMMENT_APOGEE\":\"Apogee Altitude = 601   [km]\",\"SAT2_COMMENT_PERIGEE\":\"Perigee Altitude = 600   [km]\",\"SAT2_COMMENT_INCLINATION\":\"Inclination = 97.0  [deg]\",\"SAT2_AREA_PC\":\"0.02\",\"SAT2_AREA_PC_UNIT\":\"m**2\",\"SAT2_CD_AREA_OVER_MASS\":\"0.01\",\"SAT2_CD_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT2_CR_AREA_OVER_MASS\":\"0.009\",\"SAT2_CR_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT2_THRUST_ACCELERATION\":\"0\",\"SAT2_THRUST_ACCELERATION_UNIT\":\"m\\/s**2\",\"SAT2_SEDR\":\"8.0e-05\",\"SAT2_SEDR_UNIT\":\"W\\/kg\",\"SAT2_X\":\"6562.413913\",\"SAT2_X_UNIT\":\"km\",\"SAT2_Y\":\"1702.252966\",\"SAT2_Y_UNIT\":\"km\",\"SAT2_Z\":\"1592.063015\",\"SAT2_Z_UNIT\":\"km\",\"SAT2_X_DOT\":\"2.046814905\",\"SAT2_X_DOT_UNIT\":\"km\\/s\",\"SAT2_Y_DOT\":\"-1.062667288\",\"SAT2_Y_DOT_UNIT\":\"km\\/s\",\"SAT2_Z_DOT\":\"-7.2948262\",\"SAT2_Z_DOT_UNIT\":\"km\\/s\",\"SAT2_CR_R\":\"99.9911568880684\",\"SAT2_CR_R_UNIT\":\"m**2\",\"SAT2_CT_R\":\"-85.5596052003614\",\"SAT2_CT_R_UNIT\":\"m**2\",\"SAT2_CT_T\":\"679.619604230875\",\"SAT2_CT_T_UNIT\":\"m**2\",\"SAT2_CN_R\":\"27.0614673334493\",\"SAT2_CN_R_UNIT\":\"m**2\",\"SAT2_CN_T\":\"-16.6568273265456\",\"SAT2_CN_T_UNIT\":\"m**2\",\"SAT2_CN_N\":\"63.3048647153926\",\"SAT2_CN_N_UNIT\":\"m**2\",\"SAT2_CRDOT_R\":\"0.107056879196751\",\"SAT2_CRDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_T\":\"-0.659964067622497\",\"SAT2_CRDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_N\":\"0.019485753052086\",\"SAT2_CRDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_RDOT\":\"0.000708585747151425\",\"SAT2_CRDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CTDOT_R\":\"-0.108846482024542\",\"SAT2_CTDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_T\":\"0.0926867959261093\",\"SAT2_CTDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_N\":\"-0.0294861841043052\",\"SAT2_CTDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_RDOT\":\"-0.000115870505266814\",\"SAT2_CTDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CTDOT_TDOT\":\"0.000118496023294848\",\"SAT2_CTDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_R\":\"-0.0141976572926528\",\"SAT2_CNDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_T\":\"0.0382956717994341\",\"SAT2_CNDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_N\":\"-0.00809689080893274\",\"SAT2_CNDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_RDOT\":\"-2.78052024499934e-05\",\"SAT2_CNDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_TDOT\":\"1.54543876352614e-05\",\"SAT2_CNDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_NDOT\":\"2.37648026501431e-05\",\"SAT2_CNDOT_NDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CDRG_R\":\"0\",\"SAT2_CDRG_R_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_T\":\"0\",\"SAT2_CDRG_T_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_N\":\"0\",\"SAT2_CDRG_N_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_RDOT\":\"0\",\"SAT2_CDRG_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_TDOT\":\"0\",\"SAT2_CDRG_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_NDOT\":\"0\",\"SAT2_CDRG_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_DRG\":\"0\",\"SAT2_CDRG_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT2_CSRP_R\":\"0\",\"SAT2_CSRP_R_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_T\":\"0\",\"SAT2_CSRP_T_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_N\":\"0\",\"SAT2_CSRP_N_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_RDOT\":\"0\",\"SAT2_CSRP_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_TDOT\":\"0\",\"SAT2_CSRP_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_NDOT\":\"0\",\"SAT2_CSRP_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_DRG\":\"0\",\"SAT2_CSRP_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT2_CSRP_SRP\":\"0\",\"SAT2_CSRP_SRP_UNIT\":\"m**4\\/kg**2\",\"GID\":\"79\"}}}";

		// Send the request and retrieve a requestId
		String requestId;
		try {
			requestId = okapi.sendAndGetRequestId(
					"/estimate-risk/all-methods/requests",
					bodyString,
					accessToken);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		int responseCode;
		int requestCounter = 0;
		String resultNeptuneSimple;

		// Retrieve results using the provided requestId
		try {
			do {
				resultNeptuneSimple = okapi.getValues("/estimate-risk/all-methods/results/" + requestId + "/simple", accessToken);
				responseCode = okapi.responseCode;
				requestCounter++;
				if (responseCode != 202 || requestCounter == 15) break;
				System.out.println("The request was successful. The backend is processing it.");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while(true);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		if (okapi.responseCode == 200) {
			System.out.println(new JSONObject(resultNeptuneSimple).toString(4));
		}
		
	}

	/**
	 * Tests the /propagate-orbit/neptune/requests end point
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void neptuneTest(OkapiConnector okapi, String accessToken) {

		// Create the sample orbit data of the satellite and add propagation settings
		JSONObject simpleState = new JSONObject()
					.put("orbit", new JSONObject()
							.put("type","state.json")
							.put("content",new JSONObject()
									.put("area", 0.01)
									.put("mass", 1.3)
									.put("x", 615.119526)
									.put("y", -7095.644839)
									.put("z", -678.668352)
									.put("x_dot", 0.390367)
									.put("y_dot", 0.741902)
									.put("z_dot", -7.39698)
									.put("epoch", "2016-07-23T00:31:50.000Z")
							)
					)
					.put("settings", new JSONObject()
							.put("type","prop_settings.json")
							.put("content",new JSONObject()
									.put("propagation_end_epoch", "2016-07-23T03:31:50.000Z")
									.put("more", new JSONObject()
											.put("output_step_size", 3600)
											.put("geopotential_degree_order", 6)
											.put("atmospheric_drag", 1)
											.put("horizontal_wind", 0)
											.put("sun_gravity", 1)
											.put("moon_gravity", 1)
											.put("solar_radiation_pressure", 1)
											.put("solid_tides", 1)
											.put("ocean_tides", 0)
									)
							)
					);

		// Send simple NEPTUNE request and retrieve the requestId
		String requestId;
		try {
			requestId = okapi.sendAndGetRequestId(
					"/propagate-orbit/neptune/requests",
					simpleState.toString(),
					accessToken);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		int responseCode;
		String resultNeptuneOem;
		int requestCounter = 0;
		// Retrieve results for simple NEPTUNE propagation as OEM formatted data with the requestId
		try {
			do{
				resultNeptuneOem = okapi.getValues("/propagate-orbit/neptune/results/" + requestId + "/oem", accessToken);
				responseCode = okapi.responseCode;
				requestCounter++;
				if (responseCode != 202 || requestCounter == 15) break;
				System.out.println("The request was successful. The backend is processing it.");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while(true);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		if (okapi.responseCode == 200) {
			JSONObject resultNeptuneOemAsJson = new JSONObject(resultNeptuneOem);
			System.out.println(resultNeptuneOemAsJson.toString(4));
			// We can also transfer the result directly into an CcsdsOem object
			final ObjectMapper objectMapper = new ObjectMapper();
			try {
				CcsdsOem oem = objectMapper.readValue(resultNeptuneOemAsJson.getJSONObject("orbit").toString(), CcsdsOem.class);
				System.out.println(oem.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Tests the pass prediction end points based on SGP4, Neptune and Orekit propagation
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void predictPassesTests(OkapiConnector okapi, String accessToken) {

		// Create the sample orbit data of the satellite and add propagation settings
		JSONObject simpleState = new JSONObject()
					.put("orbit", new JSONObject()
							.put("type","state.json")
							.put("content",new JSONObject()
									.put("area", 0.01)
									.put("mass", 1.3)
									.put("x", -2915.65441951)
									.put("y", -3078.17058851)
									.put("z", 5284.39698421)
									.put("x_dot", 4.94176934)
									.put("y_dot", -5.83109248)
									.put("z_dot", -0.66365683)
									.put("epoch", "2018-08-06T18:19:43.256Z")
							)
					)
					.put("ground_location", new JSONObject()
							.put("type", "ground_loc.json")
							.put("content", new JSONObject()
									.put("altitude",  0.048)
									.put("longitude", 10.645)
									.put("latitude", 52.328)
							)
					)
					.put("time_window", new JSONObject()
							.put("type", "tw.json")
							.put("content", new JSONObject()
									.put("start",  "2018-08-06T18:19:44.256Z")
									.put("end", "2018-08-07T00:00:00.000Z")
							)
					)
					.put("settings", new JSONObject()
							.put("type","shared_prop_settings.json")
							.put("content",new JSONObject()
									.put("output_step_size", 60)
									.put("geopotential_degree_order", 2)
							)
					);


		String requestId;
		// Send a predict-passes request
		try {
			requestId = okapi.sendAndGetRequestId(
					"/predict-passes/neptune/requests",
					simpleState.toString(),
					accessToken);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		String predictPassesResult;
		// Retrieve results for predicted passes in summary format
		try {
			predictPassesResult = okapi.waitForProcessingAndGetValues("/predict-passes/neptune/results/" + requestId + "/summary", accessToken);
		} catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		if (okapi.responseCode == 200) {
			System.out.println(new JSONObject(predictPassesResult).toString(4));
		}
	}

	/**
	 * Tests the retrieval of our own satellites
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void getSatellitesTest(OkapiConnector okapi, String accessToken) {

		Satellites satellites;

		// Retrieve all satellite definitions connected to the account
		try {
			satellites = okapi.getSatellites(accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		if (okapi.responseCode == 200) {
			System.out.println(satellites.toString());
		}
	}

	/**
	 * Tests the addition of one satellite to the OKAPI backend
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void addSatelliteTest(OkapiConnector okapi, String accessToken) {

		Satellite newSatellite = new Satellite();
		newSatellite.setName("Sputnik");
		// This is a random ID, which will be changed by the backend but currently it is still required
		newSatellite.setSatelliteId("550e8400-e29b-11d4-a716-446655440000");
		newSatellite.setNoradIds(Collections.singletonList(1234567));
		newSatellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

		// Send new satellite definition to the backend to add to the collection and retrieve the new instance from the
		// backend.
		try {
			newSatellite = okapi.addSatellite(newSatellite,accessToken);

		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		// Retrieve the newly assigned satellite id
		if (okapi.responseCode == 200) {
			System.out.println(newSatellite.toString());
			satelliteId = newSatellite.getSatelliteId();
		}
	}

	/**
	 * Tests the update of an already existing satellite in the OKAPI backend
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void updateSatelliteTest(OkapiConnector okapi, String accessToken) {

		Satellite currentSatellite = new Satellite();
		currentSatellite.setName("SPUTNIK-2");
		currentSatellite.setSatelliteId(satelliteId);
		currentSatellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

		// Send updated satellite definition to the backend and retrieve the updated instance
		try {
			currentSatellite = okapi.updateSatellite(currentSatellite,accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		if (okapi.responseCode == 200) {
			System.out.println(currentSatellite.toString());
		}
	}

	/**
	 * Tests the removal of one satellite from the OKAPI backend
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void removeSatelliteTest(OkapiConnector okapi, String accessToken) {
		Satellite deletedSatellite;

		// Delete satellite definition from the backend collection and retrieve the deleted instance
		try {
			deletedSatellite = okapi.deleteSatellite(
					satelliteId,
					accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}
		if (okapi.responseCode == 200) {
			System.out.println(deletedSatellite.toString());
		}
	}

	/**
	 * Tests the retrieval of our own conjunction warnings
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void getConjunctionsTest(OkapiConnector okapi, String accessToken) {

		Conjunctions conjunctions;

		// Retrieve all conjunctions available for all satellites connected to the account
		try {
			conjunctions = okapi.getConjunctions(accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		// Get the first conjunctionId for the following test cases
		if (conjunctions.getElements().size() > 0)
			conjunctionId = conjunctions.getElements().get(0).getConjunctionId();

		if (okapi.responseCode == 200) {
			System.out.println(conjunctions);
		}
	}

	/**
	 * Tests the retrieval of CDMs connected to our conjunction warning
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void getCdmsTest(OkapiConnector okapi, String accessToken) {

		SpaceTrackCdms cdms;

		// Retrieve all CDMs available for the given conjunctions
		try {
			cdms = okapi.getCdms(conjunctionId,accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		if (okapi.responseCode == 200) {
			System.out.println(cdms.toString());
		}
	}

	/**
	 * Tests the retrieval of maneuver evaluations connected to our conjunction warning
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void getManeuverEvaluationsTest(OkapiConnector okapi, String accessToken) {

		ManeuverEvals evals;

		// Retrieve all maneuver evaluations available for the given conjunctions
		try {
			evals = okapi.getManeuverEvals(conjunctionId,accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		if (okapi.responseCode == 200) {
			System.out.println(evals.toString());
		}
	}

	/**
	 * Tests the addition of ground station passes for two satellites to the OKAPI backend
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void addGroundStationPassesTest(OkapiConnector okapi, String accessToken)
	  throws ParseException {

		MultiGroundStationPasses multiGroundStationPasses = new MultiGroundStationPasses();
		GroundStationPasses groundStationPasses = new GroundStationPasses();
		multiGroundStationPasses.getElements().add(groundStationPasses);
		groundStationPasses.setSpacecraft("My Sat 1");
		addPassWindow(groundStationPasses, "2020-10-13T10:00:23.000Z", "2020-10-13T10:09:54.000Z");
		addPassWindow(groundStationPasses, "2020-10-13T12:57:08.000Z", "2020-10-13T13:08:50.000Z");
		addPassWindow(groundStationPasses, "2020-10-13T20:41:06.000Z", "2020-10-13T20:49:45.000Z");
		groundStationPasses = new GroundStationPasses();
		multiGroundStationPasses.getElements().add(groundStationPasses);
		groundStationPasses.setSpacecraft("My Sat 2");
		addPassWindow(groundStationPasses, "2020-10-13T22:15:37.000Z", "2020-10-13T22:24:34.000Z");
		addPassWindow(groundStationPasses, "2020-10-14T09:49:20.000Z", "2020-10-14T09:58:45.000Z");
		addPassWindow(groundStationPasses, "2020-10-14T12:45:58.000Z", "2020-10-14T12:57:41.000Z");
		

		// Send new ground station passes definitions to the backend to add to the DB and retrieve the new instance from the
		// backend.
		try {
			multiGroundStationPasses = okapi.addMultiGroundStationPasses(multiGroundStationPasses, accessToken);

		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		// Retrieve the newly assigned satellite id
		if (okapi.responseCode == 200) {
			System.out.println(multiGroundStationPasses.toString());
		}
	}
	
	private static void addPassWindow(GroundStationPasses groundStationPasses, String isoStringStart, String isoStringEnd)
	  throws ParseException {
		PassWindow passWindow = new PassWindow();
		groundStationPasses.getPasses().add(passWindow);
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    Date date = df.parse(isoStringStart);
		passWindow.setStart(date);
    date = df.parse(isoStringEnd);
		passWindow.setEnd(date);
	}

	/**
	 * Tests the retrieval of ground station passes
	 * @param okapi - the initialized {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken()}
	 */
	private static void getMultiGroundStationPassesInfoTest(OkapiConnector okapi, String accessToken) {

		MultiGroundStationPassesInfo multiGroundStationPassesInfo;

		// Retrieve all of them
		try {
			multiGroundStationPassesInfo = okapi.getMultiGroundStationPassesInfo(accessToken);
		} catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
			okapiPlatformException.printStackTrace();
			return;
		}

		if (okapi.responseCode == 200) {
			System.out.println(multiGroundStationPassesInfo.toString());
		}
	}
}
