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
		OkapiConnector okapi = new OkapiConnector();


		// user input authentication
		String username = <username>;
		String password = <password>;
		String baseUrl = "http://okapi.ddns.net:34570";		

		System.out.println("Testing Start");
		
		// authentication at Auth0
		System.out.println("[Authentication] - started");
		String accessToken = okapi.getToken(username, password);
		System.out.println("[Authentication] - completed");
		
		System.out.println("[Deprected pass prediction] - started");
		passPredictionTest(okapi,accessToken,baseUrl);
		System.out.println("[Deprected pass prediction] - completed");
		
		System.out.println("[Predict passes] - started");
		predictPassesTests(okapi,accessToken,baseUrl);
		System.out.println("[Predict passes] - completed");
		
		System.out.println("[Propagate orbit NEPTUNE] - started");
		neptuneTest(okapi,accessToken,baseUrl);
		System.out.println("[Propagate orbit NEPTUNE] - completed");
		
		System.out.println("[Propagate orbit Orekit-numerical] - started");
		orekitNumericalTest(okapi,accessToken,baseUrl);
		System.out.println("[Propagate orbit Orekit-numerical] - completed");
		
		System.out.println("[Propagate orbit SGP4] - started");
		sgp4Test(okapi,accessToken,baseUrl);
		System.out.println("[Propagate orbit SGP4] - completed");
		
		System.out.println("[Estimate risk all methods] - started");
		riskEstimationTest(okapi,accessToken,baseUrl);
		System.out.println("[Estimate risk all methods] - completed");

		System.out.println("Testing End");
	}


	private static void riskEstimationTest(OkapiConnector okapi, String accessToken, String baseUrl) {
		String bodyString ="{\"CCSDS_CDM\":{\"CONSTELLATION\":\"TU Berlin\",\"CDM_ID\":\"24537247\",\"FILENAME\":\"42829_conj_43782_2019076092820_3987.xml\",\"INSERT_EPOCH\":\"2019-03-17 11:37:59\",\"CCSDS_CDM_VERS\":\"1.0\",\"CREATION_DATE\":\"2019-03-17 07:38:19\",\"CREATION_DATE_FRACTION\":\"0\",\"ORIGINATOR\":\"JSPOC\",\"MESSAGE_FOR\":\"TECHNOSAT\",\"MESSAGE_ID\":\"42829_conj_43782_2019076092820_0760816243987\",\"COMMENT_EMERGENCY_REPORTABLE\":null,\"TCA\":\"2019-03-17 09:28:20\",\"TCA_FRACTION\":\"23\",\"MISS_DISTANCE\":\"804\",\"MISS_DISTANCE_UNIT\":\"m\",\"RELATIVE_SPEED\":\"14997\",\"RELATIVE_SPEED_UNIT\":\"m\\/s\",\"RELATIVE_POSITION_R\":\"-71.4\",\"RELATIVE_POSITION_R_UNIT\":\"m\",\"RELATIVE_POSITION_T\":\"110.2\",\"RELATIVE_POSITION_T_UNIT\":\"m\",\"RELATIVE_POSITION_N\":\"793.3\",\"RELATIVE_POSITION_N_UNIT\":\"m\",\"RELATIVE_VELOCITY_R\":\"11.4\",\"RELATIVE_VELOCITY_R_UNIT\":\"m\\/s\",\"RELATIVE_VELOCITY_T\":\"-14856\",\"RELATIVE_VELOCITY_T_UNIT\":\"m\\/s\",\"RELATIVE_VELOCITY_N\":\"2053.1\",\"RELATIVE_VELOCITY_N_UNIT\":\"m\\/s\",\"COLLISION_PROBABILITY\":\"0\",\"COLLISION_PROBABILITY_METHOD\":\"FOSTER-1992\",\"SAT1_OBJECT\":\"OBJECT1\",\"SAT1_OBJECT_DESIGNATOR\":\"42829\",\"SAT1_CATALOG_NAME\":\"SATCAT\",\"SAT1_OBJECT_NAME\":\"TECHNOSAT\",\"SAT1_INTERNATIONAL_DESIGNATOR\":\"2017-042E\",\"SAT1_OBJECT_TYPE\":\"PAYLOAD\",\"SAT1_OPERATOR_CONTACT_POSITION\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~42829\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT1_OPERATOR_ORGANIZATION\":\"TU Berlin\",\"SAT1_OPERATOR_PHONE\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~42829\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT1_OPERATOR_EMAIL\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~42829\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT1_EPHEMERIS_NAME\":\"NONE\",\"SAT1_COVARIANCE_METHOD\":\"CALCULATED\",\"SAT1_MANEUVERABLE\":\"NO\",\"SAT1_REF_FRAME\":\"ITRF\",\"SAT1_GRAVITY_MODEL\":\"EGM-96: 36D 36O\",\"SAT1_ATMOSPHERIC_MODEL\":\"JBH09\",\"SAT1_N_BODY_PERTURBATIONS\":\"MOON,SUN\",\"SAT1_SOLAR_RAD_PRESSURE\":\"YES\",\"SAT1_EARTH_TIDES\":\"YES\",\"SAT1_INTRACK_THRUST\":\"NO\",\"SAT1_TIME_LASTOB_START\":\"2019-03-16 07:38:19\",\"SAT1_TIME_LASTOB_START_FRACTION\":\"0\",\"SAT1_TIME_LASTOB_END\":\"2019-03-17 07:38:19\",\"SAT1_TIME_LASTOB_END_FRACTION\":\"0\",\"SAT1_RECOMMENDED_OD_SPAN\":\"7.52\",\"SAT1_RECOMMENDED_OD_SPAN_UNIT\":\"d\",\"SAT1_ACTUAL_OD_SPAN\":\"7.52\",\"SAT1_ACTUAL_OD_SPAN_UNIT\":\"d\",\"SAT1_OBS_AVAILABLE\":\"183\",\"SAT1_OBS_USED\":\"183\",\"SAT1_RESIDUALS_ACCEPTED\":\"98.4\",\"SAT1_RESIDUALS_ACCEPTED_UNIT\":\"%\",\"SAT1_WEIGHTED_RMS\":\"1.113\",\"SAT1_COMMENT_APOGEE\":\"Apogee Altitude = 628   [km]\",\"SAT1_COMMENT_PERIGEE\":\"Perigee Altitude = 594   [km]\",\"SAT1_COMMENT_INCLINATION\":\"Inclination = 97.6  [deg]\",\"SAT1_AREA_PC\":\"0.3906\",\"SAT1_AREA_PC_UNIT\":\"m**2\",\"SAT1_CD_AREA_OVER_MASS\":\"0.0219084\",\"SAT1_CD_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT1_CR_AREA_OVER_MASS\":\"0.00898291\",\"SAT1_CR_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT1_THRUST_ACCELERATION\":\"0\",\"SAT1_THRUST_ACCELERATION_UNIT\":\"m\\/s**2\",\"SAT1_SEDR\":\"5.89239e-05\",\"SAT1_SEDR_UNIT\":\"W\\/kg\",\"SAT1_X\":\"6562.2804\",\"SAT1_X_UNIT\":\"km\",\"SAT1_Y\":\"1703.04577\",\"SAT1_Y_UNIT\":\"km\",\"SAT1_Z\":\"1592.077551\",\"SAT1_Z_UNIT\":\"km\",\"SAT1_X_DOT\":\"-1.28827778\",\"SAT1_X_DOT_UNIT\":\"km\\/s\",\"SAT1_Y_DOT\":\"-1.90418306\",\"SAT1_Y_DOT_UNIT\":\"km\\/s\",\"SAT1_Z_DOT\":\"7.30255187\",\"SAT1_Z_DOT_UNIT\":\"km\\/s\",\"SAT1_CR_R\":\"46.1461856511049\",\"SAT1_CR_R_UNIT\":\"m**2\",\"SAT1_CT_R\":\"42.3471255956732\",\"SAT1_CT_R_UNIT\":\"m**2\",\"SAT1_CT_T\":\"302.242625462294\",\"SAT1_CT_T_UNIT\":\"m**2\",\"SAT1_CN_R\":\"2.33965674350612\",\"SAT1_CN_R_UNIT\":\"m**2\",\"SAT1_CN_T\":\"-7.52607416991497\",\"SAT1_CN_T_UNIT\":\"m**2\",\"SAT1_CN_N\":\"26.3489367881701\",\"SAT1_CN_N_UNIT\":\"m**2\",\"SAT1_CRDOT_R\":\"-0.0547784235749886\",\"SAT1_CRDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_T\":\"-0.295120151146788\",\"SAT1_CRDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_N\":\"-0.000325743726599067\",\"SAT1_CRDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CRDOT_RDOT\":\"0.00031032143490407\",\"SAT1_CRDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CTDOT_R\":\"-0.0501856442302755\",\"SAT1_CTDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_T\":\"-0.0471861244930156\",\"SAT1_CTDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_N\":\"-0.00252782542649572\",\"SAT1_CTDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CTDOT_RDOT\":\"6.07418730203252e-05\",\"SAT1_CTDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CTDOT_TDOT\":\"5.45874543922052e-05\",\"SAT1_CTDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_R\":\"-0.00751381926357464\",\"SAT1_CNDOT_R_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_T\":\"-0.00371414808055227\",\"SAT1_CNDOT_T_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_N\":\"-0.0113588008096445\",\"SAT1_CNDOT_N_UNIT\":\"m**2\\/s\",\"SAT1_CNDOT_RDOT\":\"1.09417486735304e-05\",\"SAT1_CNDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_TDOT\":\"8.17704363245973e-06\",\"SAT1_CNDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CNDOT_NDOT\":\"1.74453648788543e-05\",\"SAT1_CNDOT_NDOT_UNIT\":\"m**2\\/s**2\",\"SAT1_CDRG_R\":\"0\",\"SAT1_CDRG_R_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_T\":\"0\",\"SAT1_CDRG_T_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_N\":\"0\",\"SAT1_CDRG_N_UNIT\":\"m**3\\/kg\",\"SAT1_CDRG_RDOT\":\"0\",\"SAT1_CDRG_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_TDOT\":\"0\",\"SAT1_CDRG_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_NDOT\":\"0\",\"SAT1_CDRG_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CDRG_DRG\":\"0\",\"SAT1_CDRG_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT1_CSRP_R\":\"0\",\"SAT1_CSRP_R_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_T\":\"0\",\"SAT1_CSRP_T_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_N\":\"0\",\"SAT1_CSRP_N_UNIT\":\"m**3\\/kg\",\"SAT1_CSRP_RDOT\":\"0\",\"SAT1_CSRP_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_TDOT\":\"0\",\"SAT1_CSRP_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_NDOT\":\"0\",\"SAT1_CSRP_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT1_CSRP_DRG\":\"0\",\"SAT1_CSRP_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT1_CSRP_SRP\":\"0\",\"SAT1_CSRP_SRP_UNIT\":\"m**4\\/kg**2\",\"SAT2_OBJECT\":\"OBJECT2\",\"SAT2_OBJECT_DESIGNATOR\":\"43782\",\"SAT2_CATALOG_NAME\":\"SATCAT\",\"SAT2_OBJECT_NAME\":\"OBJECT AA\",\"SAT2_INTERNATIONAL_DESIGNATOR\":\"2018-099AA\",\"SAT2_OBJECT_TYPE\":\"TBA\",\"SAT2_OPERATOR_CONTACT_POSITION\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~43782\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_OPERATOR_ORGANIZATION\":\"NONE\",\"SAT2_OPERATOR_PHONE\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~43782\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_OPERATOR_EMAIL\":\"https:\\/\\/www.space-track.org\\/expandedspacedata\\/query\\/class\\/organization\\/object\\/~~43782\\/orderby\\/ORG_NAME,INFO_ID\\/format\\/html\\/emptyresult\\/show\\/\",\"SAT2_EPHEMERIS_NAME\":\"NONE\",\"SAT2_COVARIANCE_METHOD\":\"CALCULATED\",\"SAT2_MANEUVERABLE\":\"N\\/A\",\"SAT2_REF_FRAME\":\"ITRF\",\"SAT2_GRAVITY_MODEL\":\"EGM-96: 36D 36O\",\"SAT2_ATMOSPHERIC_MODEL\":\"JBH09\",\"SAT2_N_BODY_PERTURBATIONS\":\"MOON,SUN\",\"SAT2_SOLAR_RAD_PRESSURE\":\"YES\",\"SAT2_EARTH_TIDES\":\"YES\",\"SAT2_INTRACK_THRUST\":\"NO\",\"SAT2_TIME_LASTOB_START\":\"2019-03-16 07:38:19\",\"SAT2_TIME_LASTOB_START_FRACTION\":\"0\",\"SAT2_TIME_LASTOB_END\":\"2019-03-17 07:38:19\",\"SAT2_TIME_LASTOB_END_FRACTION\":\"0\",\"SAT2_RECOMMENDED_OD_SPAN\":\"9.43\",\"SAT2_RECOMMENDED_OD_SPAN_UNIT\":\"d\",\"SAT2_ACTUAL_OD_SPAN\":\"9.43\",\"SAT2_ACTUAL_OD_SPAN_UNIT\":\"d\",\"SAT2_OBS_AVAILABLE\":\"140\",\"SAT2_OBS_USED\":\"138\",\"SAT2_RESIDUALS_ACCEPTED\":\"99.4\",\"SAT2_RESIDUALS_ACCEPTED_UNIT\":\"%\",\"SAT2_WEIGHTED_RMS\":\"1.317\",\"SAT2_COMMENT_APOGEE\":\"Apogee Altitude = 601   [km]\",\"SAT2_COMMENT_PERIGEE\":\"Perigee Altitude = 596   [km]\",\"SAT2_COMMENT_INCLINATION\":\"Inclination = 97.8  [deg]\",\"SAT2_AREA_PC\":\"0.059\",\"SAT2_AREA_PC_UNIT\":\"m**2\",\"SAT2_CD_AREA_OVER_MASS\":\"0.0281873\",\"SAT2_CD_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT2_CR_AREA_OVER_MASS\":\"0.01374585\",\"SAT2_CR_AREA_OVER_MASS_UNIT\":\"m**2\\/kg\",\"SAT2_THRUST_ACCELERATION\":\"0\",\"SAT2_THRUST_ACCELERATION_UNIT\":\"m\\/s**2\",\"SAT2_SEDR\":\"8.22796e-05\",\"SAT2_SEDR_UNIT\":\"W\\/kg\",\"SAT2_X\":\"6562.413913\",\"SAT2_X_UNIT\":\"km\",\"SAT2_Y\":\"1702.252966\",\"SAT2_Y_UNIT\":\"km\",\"SAT2_Z\":\"1592.063015\",\"SAT2_Z_UNIT\":\"km\",\"SAT2_X_DOT\":\"2.046814905\",\"SAT2_X_DOT_UNIT\":\"km\\/s\",\"SAT2_Y_DOT\":\"-1.062667288\",\"SAT2_Y_DOT_UNIT\":\"km\\/s\",\"SAT2_Z_DOT\":\"-7.2948262\",\"SAT2_Z_DOT_UNIT\":\"km\\/s\",\"SAT2_CR_R\":\"99.9911568880684\",\"SAT2_CR_R_UNIT\":\"m**2\",\"SAT2_CT_R\":\"-85.5596052003614\",\"SAT2_CT_R_UNIT\":\"m**2\",\"SAT2_CT_T\":\"679.619604230875\",\"SAT2_CT_T_UNIT\":\"m**2\",\"SAT2_CN_R\":\"27.0614673334493\",\"SAT2_CN_R_UNIT\":\"m**2\",\"SAT2_CN_T\":\"-16.6568273265456\",\"SAT2_CN_T_UNIT\":\"m**2\",\"SAT2_CN_N\":\"63.3048647153926\",\"SAT2_CN_N_UNIT\":\"m**2\",\"SAT2_CRDOT_R\":\"0.107056879196751\",\"SAT2_CRDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_T\":\"-0.659964067622497\",\"SAT2_CRDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_N\":\"0.019485753052086\",\"SAT2_CRDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CRDOT_RDOT\":\"0.000708585747151425\",\"SAT2_CRDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CTDOT_R\":\"-0.108846482024542\",\"SAT2_CTDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_T\":\"0.0926867959261093\",\"SAT2_CTDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_N\":\"-0.0294861841043052\",\"SAT2_CTDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CTDOT_RDOT\":\"-0.000115870505266814\",\"SAT2_CTDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CTDOT_TDOT\":\"0.000118496023294848\",\"SAT2_CTDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_R\":\"-0.0141976572926528\",\"SAT2_CNDOT_R_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_T\":\"0.0382956717994341\",\"SAT2_CNDOT_T_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_N\":\"-0.00809689080893274\",\"SAT2_CNDOT_N_UNIT\":\"m**2\\/s\",\"SAT2_CNDOT_RDOT\":\"-2.78052024499934e-05\",\"SAT2_CNDOT_RDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_TDOT\":\"1.54543876352614e-05\",\"SAT2_CNDOT_TDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CNDOT_NDOT\":\"2.37648026501431e-05\",\"SAT2_CNDOT_NDOT_UNIT\":\"m**2\\/s**2\",\"SAT2_CDRG_R\":\"0\",\"SAT2_CDRG_R_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_T\":\"0\",\"SAT2_CDRG_T_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_N\":\"0\",\"SAT2_CDRG_N_UNIT\":\"m**3\\/kg\",\"SAT2_CDRG_RDOT\":\"0\",\"SAT2_CDRG_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_TDOT\":\"0\",\"SAT2_CDRG_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_NDOT\":\"0\",\"SAT2_CDRG_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CDRG_DRG\":\"0\",\"SAT2_CDRG_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT2_CSRP_R\":\"0\",\"SAT2_CSRP_R_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_T\":\"0\",\"SAT2_CSRP_T_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_N\":\"0\",\"SAT2_CSRP_N_UNIT\":\"m**3\\/kg\",\"SAT2_CSRP_RDOT\":\"0\",\"SAT2_CSRP_RDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_TDOT\":\"0\",\"SAT2_CSRP_TDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_NDOT\":\"0\",\"SAT2_CSRP_NDOT_UNIT\":\"m**3\\/(kg*s)\",\"SAT2_CSRP_DRG\":\"0\",\"SAT2_CSRP_DRG_UNIT\":\"m**4\\/kg**2\",\"SAT2_CSRP_SRP\":\"0\",\"SAT2_CSRP_SRP_UNIT\":\"m**4\\/kg**2\",\"GID\":\"79\"},\n" + 
				"\"overrides\":{}}";
		
		// send request for Propagation: SGP4
		String estimateRiskAllMethodsUrlRequest = "/estimate-risk/all-methods/requests/";
		String estimateRiskAllMethodsRequestCombined = baseUrl + estimateRiskAllMethodsUrlRequest;
		String requestIdPropagationSgp4 = okapi.SendRequest(estimateRiskAllMethodsRequestCombined, bodyString, accessToken);

		// get results for Propagation: SGP4 as simple result and print them in the terminal
		String estimateRiskAllMethodsSimpleUrlGet = "/estimate-risk/all-methods/simple/results/";
		String estimateRiskAllMethodsUrlGetCombined = baseUrl + estimateRiskAllMethodsSimpleUrlGet + requestIdPropagationSgp4;
		String resultsEstimateRiskAllMethodsSimple = okapi.GetResults(estimateRiskAllMethodsUrlGetCombined, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsEstimateRiskAllMethodsSimple = okapi.GetResults(estimateRiskAllMethodsUrlGetCombined, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultsEstimateRiskAllMethodsSimple = okapi.GetResults(estimateRiskAllMethodsUrlGetCombined, accessToken);
			System.out.println(resultsEstimateRiskAllMethodsSimple);
		}
		
	}


	/**
	 * Tests the SGP4 end points
	 * @param okapi - the instantiated {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken(String, String)}
	 * @param baseUrl - the URL to the OKAPI backend
	 */
	private static void sgp4Test(OkapiConnector okapi, String accessToken, String baseUrl) {
		String sendURL;
		String bodyString;
		String getURL;
		
		// user input Propagation: SGP4
		String propagationEndEpochPropagation = "2018-08-08T00:00:00.000Z";
		double outputStepSizePropagation = 100;
		String tlePropagation = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

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
		String requestIdPropagationSgp4 = okapi.SendRequest(sendURL, bodyString, accessToken);

		// get results for Propagation: SGP4 as simple result and print them in the terminal
		String propagationSgp4SimpleUrlGet = "/propagate-orbit/sgp4/simple/results/";
		String propagationSgp4simpleUrlGetCombined = baseUrl + propagationSgp4SimpleUrlGet + requestIdPropagationSgp4;
		getURL = propagationSgp4simpleUrlGetCombined;
		String resultsPropagationSgp4Simple = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Simple = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultsPropagationSgp4Simple = okapi.GetResults(getURL, accessToken);
			System.out.println(resultsPropagationSgp4Simple);
		}
		
		// get results for Propagation: SGP4 as omm result and print them in the
		// terminal
		String propagationSgp4OmmUrlGet = "/propagate-orbit/sgp4/omm/results/";
		String propagationsgp4OmmUrlGetCombined = baseUrl + propagationSgp4OmmUrlGet + requestIdPropagationSgp4;
		getURL = propagationsgp4OmmUrlGetCombined;
		String resultsPropagationSgp4Omm = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultsPropagationSgp4Omm = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultsPropagationSgp4Omm = okapi.GetResults(getURL, accessToken);
			System.out.println(resultsPropagationSgp4Omm);
		}

		System.out.println("Get Propagation: SGP4 OMM completed");
		
	}
	
	/**
	 * Tests the Orekit numerical end points
	 * @param okapi - the instantiated {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken(String, String)}
	 * @param baseUrl - the URL to the OKAPI backend
	 */
	private static void orekitNumericalTest(OkapiConnector okapi, String accessToken, String baseUrl) {
		String sendURL;
		String bodyString;
		String getURL;
		
		// user input simple
		double area = 1;
		double mass = 1;
		double x = 615.119526;
		double y = -7095.644839;
		double z = -678.668352;
		double x_dot = 0.390367;
		double y_dot = 0.741902;
		double z_dot = -7.39698;
		String epoch = "2016-07-23T00:31:50.000Z";
		String propagationEndEpochOrekitNumericalSimple = "2016-07-23T03:31:50.000Z";
		double outputStepSizeOrekitNumericalSimple = 30;

		// User input OPM
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
		String propagationEndEpochOpm = "2016-07-23T00:31:50.000Z";
		double outputStepSizeOpm = 30;
		
		// preparation for simple
		JSONObject simpleState = new JSONObject();
		JSONObject configSimple = new JSONObject();
		JSONObject settingsSimple = new JSONObject();
		JSONObject propagateSimpleRequestBody = new JSONObject();
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
			configSimple.put("geopotential_degree_order", 6);
			configSimple.put("atmospheric_drag", 1);
			configSimple.put("horizontal_wind", 0);
			configSimple.put("sun_gravity", 1);
			configSimple.put("moon_gravity", 1);
			configSimple.put("solar_radiation_pressure", 1);
			configSimple.put("solid_tides", 1);
			configSimple.put("ocean_tides", 0);
			settingsSimple.put("propagation_end_epoch", propagationEndEpochOrekitNumericalSimple);
			settingsSimple.put("output_step_size", outputStepSizeOrekitNumericalSimple);
			settingsSimple.put("neptune_config", configSimple);
			propagateSimpleRequestBody.put("simple_state", simpleState);
			propagateSimpleRequestBody.put("settings", settingsSimple);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Send simple request
		String urlRequest = "/propagate-orbit/orekit-numerical/requests";
		String urlRequestCombined = baseUrl + urlRequest;
		sendURL = urlRequestCombined;
		bodyString = propagateSimpleRequestBody.toString();
		String requestId = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results for simple propagation as simple formatted data
		String simpleUrlGet = "/propagate-orbit/orekit-numerical/simple/results/";
		String simpleUrlGetCombined = baseUrl + simpleUrlGet + requestId;
		getURL = simpleUrlGetCombined;
		String resultSimple = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSimple = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultSimple = okapi.GetResults(getURL, accessToken);
			System.out.println(resultSimple);
		}

		// Retrieve results for simple propagation request as OPM formatted data
		String opmUrlGet = "/propagate-orbit/orekit-numerical/opm/results/";
		String opmUrlGetCombined = baseUrl + opmUrlGet + requestId;
		getURL = opmUrlGetCombined;
		String resultOpm = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultOpm = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultOpm = okapi.GetResults(getURL, accessToken);
			System.out.println(resultOpm);
		}

		// OPM

		// Preparation for OPM
		JSONObject OPM_HEADER = new JSONObject();
		JSONObject OPM_META_DATA = new JSONObject();
		JSONObject OPM_DATA = new JSONObject();
		JSONObject CCSDS_OPM = new JSONObject();
		JSONObject configOpm = new JSONObject();
		JSONObject settingsOpm = new JSONObject();
		JSONObject propagateOpmRequestBody = new JSONObject();
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
			configOpm.put("atmospheric_drag", atmosphericDrag);
			settingsOpm.put("propagation_end_epoch", propagationEndEpochOpm);
			settingsOpm.put("output_step_size", outputStepSizeOpm);
			settingsOpm.put("neptune_config", configOpm);
			propagateOpmRequestBody.put("CCSDS_OPM", CCSDS_OPM);
			propagateOpmRequestBody.put("settings", settingsOpm);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Send request using OPM formatted data
		String opm2UrlRequest = "/propagate-orbit/orekit-numerical/requests";
		String opm2UrlRequestCombined = baseUrl + opm2UrlRequest;
		sendURL = opm2UrlRequestCombined;
		bodyString = propagateOpmRequestBody.toString();
		String requestIdOpm2 = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results from OPM propagation request in simple format
		String simple2UrlGet = "/propagate-orbit/orekit-numerical/simple/results/";
		String simple2UrlGetCombined = baseUrl + simple2UrlGet + requestIdOpm2;
		getURL = simple2UrlGetCombined;
		String resultSimple2 = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSimple2 = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultSimple2 = okapi.GetResults(getURL, accessToken);
			System.out.println(resultSimple2);
		}
		
		// Send request using OPM formatted data
		String opmGenericUrlRequest = "/propagate-orbit/orekit-numerical/requests";
		String opmGenericUrlRequestCombined = baseUrl + opmGenericUrlRequest;
		sendURL = opmGenericUrlRequestCombined;
		bodyString = propagateOpmRequestBody.toString();
		String requestIdOpmGeneric = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results from OPM propagation request in simple format
		String simpleGenericUrlGet = "/propagate-orbit/orekit-numerical/simple/results/";
		String simpleGenericUrlGetCombined = baseUrl + simpleGenericUrlGet + requestIdOpmGeneric + "/generic";
		getURL = simpleGenericUrlGetCombined;
		String resultSimpleGeneric = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSimpleGeneric = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultSimpleGeneric = okapi.GetResults(getURL, accessToken);
			System.out.println(resultSimpleGeneric);
		}
	}


	/**
	 * Tests the NEPTUNE end points
	 * @param okapi - the instantiated {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken(String, String)}
	 * @param baseUrl - the URL to the OKAPI backend
	 */
	private static void neptuneTest(OkapiConnector okapi, String accessToken, String baseUrl) {
		String sendURL;
		String bodyString;
		String getURL;
		
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
		String requestIdNeptune = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results for simple NEPTUNE propagation as simple formatted data
		String neptuneSimpleUrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimpleUrlGetCombined = baseUrl + neptuneSimpleUrlGet + requestIdNeptune;
		getURL = neptuneSimpleUrlGetCombined;
		String resultNeptuneSimple = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimple = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultNeptuneSimple = okapi.GetResults(getURL, accessToken);
			System.out.println(resultNeptuneSimple);
		}

		// Retrieve results for simple NEPTUNE propagation request as OPM formatted data
		String neptuneOpmUrlGet = "/propagate-orbit/neptune/opm/results/";
		String neptuneOpmUrlGetCombined = baseUrl + neptuneOpmUrlGet + requestIdNeptune;
		getURL = neptuneOpmUrlGetCombined;
		String resultNeptuneOpm = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneOpm = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultNeptuneOpm = okapi.GetResults(getURL, accessToken);
			System.out.println(resultNeptuneOpm);
		}

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
		String requestIdNeptuneOpm2 = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results from OPM NEPTUNE propagation request in simple format
		String neptuneSimple2UrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimple2UrlGetCombined = baseUrl + neptuneSimple2UrlGet + requestIdNeptuneOpm2;
		getURL = neptuneSimple2UrlGetCombined;
		String resultNeptuneSimple2 = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimple2 = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultNeptuneSimple2 = okapi.GetResults(getURL, accessToken);
			System.out.println(resultNeptuneSimple2);
		}
		
		// Send NEPTUNE request using OPM formatted data
		String neptuneOpmGenericUrlRequest = "/propagate-orbit/neptune/requests";
		String neptuneOpmGenericUrlRequestCombined = baseUrl + neptuneOpmGenericUrlRequest;
		sendURL = neptuneOpmGenericUrlRequestCombined;
		bodyString = propagateNeptuneOpmRequestBody.toString();
		String requestIdNeptuneOpmGeneric = okapi.SendRequest(sendURL, bodyString, accessToken);

		// Retrieve results from OPM NEPTUNE propagation request in simple format
		String neptuneSimpleGenericUrlGet = "/propagate-orbit/neptune/simple/results/";
		String neptuneSimpleGenericUrlGetCombined = baseUrl + neptuneSimpleGenericUrlGet + requestIdNeptuneOpmGeneric + "/generic";
		getURL = neptuneSimpleGenericUrlGetCombined;
		String resultNeptuneSimpleGeneric = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptuneSimpleGeneric = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultNeptuneSimpleGeneric = okapi.GetResults(getURL, accessToken);
			System.out.println(resultNeptuneSimpleGeneric);
		}
	}
	
	/**
	 * Tests the pass prediction end points based on SGP4, Neptune and Orekit propagation
	 * @param okapi - the instantiated {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken(String, String)}
	 * @param baseUrl - the URL to the OKAPI backend
	 */
	private static void predictPassesTests(OkapiConnector okapi, String accessToken, String baseUrl) {
		String bodyString;
		
		double altitude = 0.048;
		double longitude = 10.645;
		double latitude = 52.328;
		String start = "2018-08-06T18:19:44.256628Z";
		String end = "2018-08-07T00:00:00.000Z";
		String tlePassPrediction = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";

		
		// user input NEPTUNE simple
		double area = 1;
		double mass = 1;
		double x = -2915.65441951;
		double y = -3078.17058851;
		double z = 5284.39698421;
		double x_dot = 4.94176934;
		double y_dot = -5.83109248;
		double z_dot = -0.66365683;
		String epoch = "2018-08-06T18:19:43.256628Z";
		double outputTimeStep = 10;
		
		// preparation for pass prediction
		JSONObject passPredNumericalRequestBody = new JSONObject();

		JSONObject simpleGroundLocation = new JSONObject();
		JSONObject timeWindow = new JSONObject();
		JSONObject simpleState = new JSONObject();
		JSONObject neptuneConfigSimple = new JSONObject();
		JSONObject predictPassesSettingsSimple = new JSONObject();
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
			neptuneConfigSimple.put("geopotential_degree_order", 2);
			predictPassesSettingsSimple.put("output_time_step", outputTimeStep);
			simpleGroundLocation.put("altitude", altitude);
			simpleGroundLocation.put("longitude", longitude);
			simpleGroundLocation.put("latitude", latitude);
			timeWindow.put("start", start);
			timeWindow.put("end", end);
			
			
			passPredNumericalRequestBody.put("simple_state", simpleState);
			passPredNumericalRequestBody.put("neptune_config", neptuneConfigSimple);
			passPredNumericalRequestBody.put("predict_passes_settings", predictPassesSettingsSimple);
			passPredNumericalRequestBody.put("simple_ground_location", simpleGroundLocation);
			passPredNumericalRequestBody.put("time_window", timeWindow);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		// preparation for SGP4
		JSONObject passPredRequestBody = new JSONObject();
		try {
			passPredRequestBody.put("simple_ground_location", simpleGroundLocation);
			passPredRequestBody.put("predict_passes_settings", predictPassesSettingsSimple);
			passPredRequestBody.put("time_window", timeWindow);
			passPredRequestBody.put("tle", tlePassPrediction);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		// send request for SGP4 pass prediction
		String sgp4UrlRequest = "/predict-passes/sgp4/requests";
		String sgp4UrlRrequestCombined = baseUrl + sgp4UrlRequest;
		bodyString = passPredRequestBody.toString();
		System.out.println(bodyString);
		String requestIdSgp4 = okapi.SendRequest(sgp4UrlRrequestCombined, bodyString, accessToken);
		
		// send request for NEPTUNE pass prediction
		String neptuneUrlRequest = "/predict-passes/neptune/requests";
		String neptuneUrlRrequestCombined = baseUrl + neptuneUrlRequest;
		bodyString = passPredNumericalRequestBody.toString();
		System.out.println(bodyString);
		String requestIdNeptune = okapi.SendRequest(neptuneUrlRrequestCombined, bodyString, accessToken);
		
		// send request for NEPTUNE pass prediction
		String orekitUrlRequest = "/predict-passes/orekit-numerical/requests";
		String orekitUrlRrequestCombined = baseUrl + orekitUrlRequest;
		bodyString = passPredNumericalRequestBody.toString();
		System.out.println(bodyString);
		String requestIdOrekit = okapi.SendRequest(orekitUrlRrequestCombined, bodyString, accessToken);
		
		// get results for SGP4 and print them in the terminal
		String sgp4UrlGet = "/predict-passes/sgp4/simple/results/";
		String sgp4UrlGetCombined = baseUrl + sgp4UrlGet + requestIdSgp4;
		String resultSgp4 = okapi.GetResults(sgp4UrlGetCombined, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultSgp4 = okapi.GetResults(sgp4UrlGetCombined, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultSgp4 = okapi.GetResults(sgp4UrlGetCombined, accessToken);
			System.out.println(resultSgp4);
		}
		
		// get results for NEPTUNE and print them in the terminal
		String neptuneUrlGet = "/predict-passes/neptune/simple/results/";
		String neptuneUrlGetCombined = baseUrl + neptuneUrlGet + requestIdNeptune;
		String resultNeptune = okapi.GetResults(neptuneUrlGetCombined, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultNeptune = okapi.GetResults(neptuneUrlGetCombined, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultNeptune = okapi.GetResults(neptuneUrlGetCombined, accessToken);
			System.out.println(resultNeptune);
		}
		
		// get results for Orekit Numerical and print them in the terminal
		String orekitUrlGet = "/predict-passes/orekit-numerical/simple/results/";
		String orekitUrlGetCombined = baseUrl + orekitUrlGet + requestIdOrekit;
		String resultOrekit = okapi.GetResults(orekitUrlGetCombined, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultOrekit = okapi.GetResults(orekitUrlGetCombined, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultOrekit = okapi.GetResults(orekitUrlGetCombined, accessToken);
			System.out.println(resultOrekit);
		}

	}


	/**
	 * Tests the pass prediction end points
	 * @param okapi - the instantiated {@link OkapiConnector}
	 * @param accessToken - a valid accessToken obtained using {@link OkapiConnector#getToken(String, String)}
	 * @param baseUrl - the URL to the OKAPI backend
	 * @deprecated
	 */
	private static void passPredictionTest(OkapiConnector okapi, String accessToken, String baseUrl) {
		
		String sendURL;
		String bodyString;
		String getURL;
		
		double altitude = 0.048;
		double longitude = 10.645;
		double latitude = 52.328;
		String start = "2018-08-07T19:01:00.000Z";
		String end = "2018-08-07T19:04:00.000Z";
		String tlePassPrediction = "1 25544U 98067A   18218.76369510  .00001449  00000-0  29472-4 0  9993\n2 25544  51.6423 126.6422 0005481  33.3092  62.9075 15.53806849126382";
		
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

		// send request for overview creation
		String overviewUrlRequest = "/pass/prediction/requests";
		String overviewUrlRequestCombined = baseUrl + overviewUrlRequest;
		sendURL = overviewUrlRequestCombined;
		bodyString = passPredRequestBody.toString();
		String requestIdOverview = okapi.SendRequest(sendURL, bodyString, accessToken);

		// send request for overview creation
		String trackingUrlRequest = "/pass/prediction/requests/long";
		String trackingUrlRequestCombined = baseUrl + trackingUrlRequest;
		sendURL = trackingUrlRequestCombined;
		bodyString = passPredRequestBody.toString();
		String requestIdTracking = okapi.SendRequest(sendURL, bodyString, accessToken);

		// get results for overview creation and print them in the terminal
		String overviewUrlGet = "/pass/predictions/";
		String overviewUrlGetCombined = baseUrl + overviewUrlGet + requestIdOverview;
		getURL = overviewUrlGetCombined;
		String resultOverview = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultOverview = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultOverview = okapi.GetResults(getURL, accessToken);
			System.out.println(resultOverview);
		}

		// get results for SGP4 and print them in the terminal
		String trackingUrlGet = "/pass/predictions/long/";
		String trackingUrlGetCombined = baseUrl + trackingUrlGet + requestIdTracking;
		getURL = trackingUrlGetCombined;
		String resultTracking = okapi.GetResults(getURL, accessToken);
		while (okapi.responseCode == 202) {
			System.out.println("Your request is not ready yet. The request was successful.");
			resultTracking = okapi.GetResults(getURL, accessToken);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (okapi.responseCode == 200) {
			resultTracking = okapi.GetResults(getURL, accessToken);
			System.out.println(resultTracking);
		}

	}
}
