package finallyblock;
import finallyblockexecution.FinallyBlock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinallyBlockTest {
    @Test
    public void testValidDivision() {
        assertEquals(5, FinallyBlock.division(10, 2));
    }

    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            FinallyBlock.division(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
