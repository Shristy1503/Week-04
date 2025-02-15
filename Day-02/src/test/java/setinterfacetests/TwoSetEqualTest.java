package setinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import setinterface.checkiftwosetsareequal.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class TwoSetEqualTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

    @Test
    void EqualSetsTest(){
        assertEquals(CheckEqualSets.checkEqual(set1, set2), true);
    }

}
