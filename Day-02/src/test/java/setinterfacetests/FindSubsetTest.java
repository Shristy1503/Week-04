package setinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import setinterface.findsubset.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsetTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

    @Test
    void isSubsetsTest(){
        assertEquals(FindSubset.findSubset(set1,set2),true);
    }

}
