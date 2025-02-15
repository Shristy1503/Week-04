package mapinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import mapinterface.findthekeywithhighestvalue.*;
import java.util.*;
public class FindKeyWithHighestValueTest {
    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = FindKeyWithHighestValue.findHighestKey(inputMap);

        assertEquals("B", maxKey);
    }

}
