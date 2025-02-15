package junit_testing.basicjunittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit_test.basicjunittest.performancetesting.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    private final PerformanceTesting tester = new PerformanceTesting();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        tester.longRunningTask();
    }

}
