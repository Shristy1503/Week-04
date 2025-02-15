package junit_testing.basicjunittesting;
import junit_test.basicjunittest.testingexceptionhandling.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTest {
    @Test
    public void testDivision() {
        assertEquals(2, ExceptionHandlingTesting.div(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> ExceptionHandlingTesting.div(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

}
