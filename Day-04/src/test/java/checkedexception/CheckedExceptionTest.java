package checkedexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckedExceptionTest {
    @Test
    public void testReadFile() {
        assertDoesNotThrow(() -> CheckedException.checkedException("src/sample.txt"));
    }
}
