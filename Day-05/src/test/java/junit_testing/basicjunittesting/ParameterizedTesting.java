package junit_testing.basicjunittesting;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import junit_test.basicjunittest.testingparameterizedtests.*;

public class ParameterizedTesting {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testEvenNumber(int num) {
        assertTrue(num % 2 == 0 );
    }

}
