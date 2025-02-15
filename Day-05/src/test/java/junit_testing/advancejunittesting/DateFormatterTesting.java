package junit_testing.advancejunittesting;
import static org.junit.jupiter.api.Assertions.*;

import junit_test.advancedjunitpractice.testingdateformatter.DateFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit_test.advancedjunitpractice.testingdateformatter.*;
public class DateFormatterTesting {
    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDateConversion() {
        assertEquals("15-02-2024", dateFormatter.formatDate("2024-02-15"));
        assertEquals("01-01-2025", dateFormatter.formatDate("2025-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate("15-02-2024");
        });
        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    void testEmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate("");
        });
        assertEquals("Invalid date format", exception.getMessage());
    }

}
