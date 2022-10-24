package com.okapiorbits.platform;

import com.okapiorbits.platform.science.jobs.json.*;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;
import java.util.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OkapiConnectorTest {

    private static OkapiConnector okapiConnector;
    private static String accessToken;
    private static String satelliteId;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp() {
        String username = null;
        String password = null;
        try {
            Dotenv dotenv = Dotenv.load();
            username = dotenv.get("OKAPI_USERNAME");
            password = dotenv.get("OKAPI_PASSWORD");
        } catch (DotenvException e) {
            System.out.println("Not .env file found. Proceeding with environment variables");
        }
        String testUsername = System.getenv("OKAPI_TEST_USERNAME");
        String testPassword = System.getenv("OKAPI_TEST_PASSWORD");
        String testUrl = System.getenv("OKAPI_TEST_URL");
        if (testUsername != null && testPassword != null && testUrl != null) {
            // initializing communication with test accounts and custom URL
            okapiConnector = new OkapiConnector(
                    testUsername,
                    testPassword,
                    testUrl
            );
        } else if (testUsername != null && testPassword != null) {
            // initializing communication with test accounts
            okapiConnector = new OkapiConnector(
                    testUsername,
                    testPassword
            );
        } else if (username != null && password != null) {
            // initializing communication
            okapiConnector = new OkapiConnector(
                    username,
                    password
            );
        }
        Assertions.assertNotEquals(okapiConnector, null);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(1)
    void getToken() {
        accessToken = null;
        try {
            accessToken = okapiConnector.getToken();
        } catch (OkapiConnector.OkapiPlatformException okapiPlatformException) {
            okapiPlatformException.printStackTrace();
        }
        Assertions.assertNotEquals(accessToken, null);

    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(2)
    void addSatellite() {
        Satellite newSatellite = new Satellite();
        newSatellite.setName("Sputnik");
        // This is a random ID, which will be changed by the backend, but currently it is still required
        newSatellite.setSatelliteId("550e8400-e29b-11d4-a716-446655440000");
        newSatellite.setNoradIds(Collections.singletonList(1234567));
        newSatellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SATELLITE_REGISTERED);

        // Send new satellite definition to the backend to add to the collection and retrieve the new instance from the
        // backend.
        try {
            newSatellite = okapiConnector.addSatellite(newSatellite,accessToken);
        } catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
            okapiPlatformException.printStackTrace();
        }

        // Retrieve the newly assigned satellite id
        Assertions.assertNotEquals(newSatellite, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
        Assertions.assertNotEquals(newSatellite.getSatelliteId(), null);
        satelliteId = newSatellite.getSatelliteId();
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(3)
    void updateSatelliteWithMap()
            throws OkapiConnector.OkapiPlatformException, IOException {
    	
		Map<String, Object> updates = new HashMap<>();
		updates.put("name", "Спутник");
		updates.put("mass", 1.2);
		updates.put("space_track_status", Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

        // Send updated satellite definition to the backend and retrieve the updated instance
        Satellite updatedSatellite = okapiConnector.updateSatellite(satelliteId, updates, accessToken);

        Assertions.assertEquals(200, okapiConnector.responseCode);
        // Check updated fields
        Assertions.assertEquals("Спутник", updatedSatellite.getName());
        Assertions.assertEquals(1.2, updatedSatellite.getMass());
        Assertions.assertEquals(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED, updatedSatellite.getSpaceTrackStatus());
        // Check fields that were not updated
        Assertions.assertEquals(Collections.singletonList(1234567), updatedSatellite.getNoradIds());
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(3)
    void updateSatelliteWithObject()
            throws OkapiConnector.OkapiPlatformException, IOException {

        Satellite satellite = new Satellite();
        satellite.setSatelliteId(satelliteId);
        satellite.setName("Спутник");
        satellite.setMass(1.2);
        satellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

        // Send updated satellite definition to the backend and retrieve the updated instance
        Satellite updatedSatellite = okapiConnector.updateSatellite(satellite, accessToken);

        Assertions.assertEquals(200, okapiConnector.responseCode);
        // Check updated fields
        Assertions.assertEquals("Спутник", updatedSatellite.getName());
        Assertions.assertEquals(1.2, updatedSatellite.getMass());
        Assertions.assertEquals(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED, updatedSatellite.getSpaceTrackStatus());
        // Check fields that were not updated
        Assertions.assertEquals(Collections.singletonList(1234567), updatedSatellite.getNoradIds());
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(5)
    void deleteSatellite()
            throws OkapiConnector.OkapiPlatformException, IOException{
        Satellite deletedSatellite;

        // Delete satellite definition from the backend collection and retrieve the deleted instance
        deletedSatellite = okapiConnector.deleteSatellite(
                satelliteId,
                accessToken);
        Assertions.assertNotEquals(deletedSatellite, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(4)
    void getSatellites()
            throws OkapiConnector.OkapiPlatformException, IOException{
        Satellites satellites = okapiConnector.getSatellites(accessToken);
        Assertions.assertNotEquals(satellites, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
    }

	/**
	 * Tests the addition of ground station passes for two satellites to the OKAPI backend
	 */
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(5)
	  void addGroundStationPasses()
            throws ParseException, OkapiConnector.OkapiPlatformException, IOException {
        MultiGroundStationPasses multiGroundStationPasses = new MultiGroundStationPasses();
        GroundStationPasses groundStationPasses = new GroundStationPasses();
        multiGroundStationPasses.getElements().add(groundStationPasses);
        groundStationPasses.setSpacecraft("SALSAT");
        addPassWindow(groundStationPasses, "2020-10-13T10:00:23Z", "2020-10-13T10:09:54Z");
        addPassWindow(groundStationPasses, "2020-10-13T12:57:08Z", "2020-10-13T13:08:50Z");
        addPassWindow(groundStationPasses, "2020-10-13T20:41:06Z", "2020-10-13T20:49:45Z");
        groundStationPasses = new GroundStationPasses();
        multiGroundStationPasses.getElements().add(groundStationPasses);
        groundStationPasses.setSpacecraft("TUBIN");
        addPassWindow(groundStationPasses, "2020-10-13T22:15:37Z", "2020-10-13T22:24:34Z");
        addPassWindow(groundStationPasses, "2020-10-14T09:49:20Z", "2020-10-14T09:58:45Z");
        addPassWindow(groundStationPasses, "2020-10-14T12:45:58Z", "2020-10-14T12:57:41Z");
		    

        // Send new ground station passes definitions to the backend to add to the DB and retrieve the new instance from the
        // backend.
        multiGroundStationPasses = okapiConnector.addMultiGroundStationPasses(multiGroundStationPasses, accessToken);


        // Retrieve the newly assigned satellite id
        if (okapiConnector.responseCode == 200) {
              System.out.println(multiGroundStationPasses.toString());
        }
		    
        Assertions.assertNotEquals(multiGroundStationPasses, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
	  }
	  
	  private void addPassWindow(GroundStationPasses groundStationPasses, String isoStringStart, String isoStringEnd)
	      throws ParseException {
		    PassWindow passWindow = new PassWindow();
		    groundStationPasses.getPasses().add(passWindow);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = df.parse(isoStringStart);
		    passWindow.setStart(date);
        date = df.parse(isoStringEnd);
		    passWindow.setEnd(date);
	  }

	  /**
	   * Tests the retrieval of ground station passes
	   */
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(6)
	  void getMultiGroundStationPassesInfo()
            throws OkapiConnector.OkapiPlatformException, IOException{

        MultiGroundStationPassesInfo multiGroundStationPassesInfo;

        // Retrieve all of them
        multiGroundStationPassesInfo = okapiConnector.getMultiGroundStationPassesInfo(accessToken);


        if (okapiConnector.responseCode == 200) {
              System.out.println(multiGroundStationPassesInfo.toString());
        }
		    
        Assertions.assertNotEquals(multiGroundStationPassesInfo, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
	  }
}
