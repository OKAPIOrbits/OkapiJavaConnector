package com.okapiorbits.platform;

import com.okapiorbits.platform.science.jobs.json.Satellite;
import com.okapiorbits.platform.science.jobs.json.Satellites;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;
import java.util.Collections;

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
        // This is a random ID, which will be changed by the backend but currently it is still required
        newSatellite.setSatelliteId("550e8400-e29b-11d4-a716-446655440000");
        newSatellite.setNoradIds(Collections.singletonList(1234567));
        newSatellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

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
    void updateSatellite() {
        Satellite currentSatellite = new Satellite();
        currentSatellite.setName("SPUTNIK-2");
        currentSatellite.setSatelliteId(satelliteId);
        currentSatellite.setSpaceTrackStatus(Satellite.SpaceTrackStatus.SHARING_AGREEMENT_SIGNED);

        // Send updated satellite definition to the backend and retrieve the updated instance
        try {
            currentSatellite = okapiConnector.updateSatellite(currentSatellite,accessToken);
        } catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
            okapiPlatformException.printStackTrace();
        }
        Assertions.assertEquals(okapiConnector.responseCode, 200);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(5)
    void deleteSatellite() {
        Satellite deletedSatellite = null;

        // Delete satellite definition from the backend collection and retrieve the deleted instance
        try {
            deletedSatellite = okapiConnector.deleteSatellite(
                    satelliteId,
                    accessToken);
        } catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
            okapiPlatformException.printStackTrace();
        }
        Assertions.assertNotEquals(deletedSatellite, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Order(4)
    void getSatellites() {
        Satellites satellites = null;
        try {
            satellites = okapiConnector.getSatellites(accessToken);
        } catch (OkapiConnector.OkapiPlatformException | IOException okapiPlatformException) {
            okapiPlatformException.printStackTrace();
        }
        Assertions.assertNotEquals(satellites, null);
        Assertions.assertEquals(okapiConnector.responseCode, 200);
    }
}