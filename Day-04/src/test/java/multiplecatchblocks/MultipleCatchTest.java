package multiplecatchblocks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleCatchTest {
    @Test
    public void testValidIndex() {
        MultipleCatchBlocks.arrayExceptions(new int[]{1,2,3,4,5}, 2);
    }
    @Test
    public void testInValidIndex() {
        MultipleCatchBlocks.arrayExceptions(new int[]{1,2,3,4,5}, 10);
    }
}
