package customexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgeValidatorTest {
    @Test
    void testValidAge() {
        // No exception should be thrown for age 18 or above
        assertDoesNotThrow(() -> CustomException.validateAge(18));
        assertDoesNotThrow(() -> CustomException.validateAge(25));
    }
    @Test
    void testInvalidAge() {
        // Exception should be thrown for age below 18
        Exception exception = assertThrows(InvalidAgeException.class, () -> CustomException.validateAge(17));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }

}
