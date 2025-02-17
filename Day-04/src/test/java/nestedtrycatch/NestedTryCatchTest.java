package nestedtrycatch;

import multiplecatchblocks.MultipleCatchBlocks;
import org.junit.jupiter.api.Test;

public class NestedTryCatchTest {
    @Test
    public void testValidIndex() {

        NestedTryCatch.arrayDivision(new int[]{1,2,3,4,5}, 2, 2);
    }
    @Test
    public void testDivideByZero() {

        NestedTryCatch.arrayDivision(new int[]{1,2,3,4,5}, 2, 0);
    }
}
