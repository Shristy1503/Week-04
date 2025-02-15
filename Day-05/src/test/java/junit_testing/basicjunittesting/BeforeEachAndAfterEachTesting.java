package junit_testing.basicjunittesting;
import static org.junit.jupiter.api.Assertions.*;

import junit_test.basicjunittest.testingannotations.*;
import org.junit.jupiter.api.*;

public class BeforeEachAndAfterEachTesting {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testConnectionIsClosedAfterTest() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }

}
