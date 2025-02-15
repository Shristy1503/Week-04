package listinterfacetest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listinterface.findfrequencyofelements.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyTest {
    //test to find frequency of elements
    @Test
    void testFrequency(){
       //create expected result map
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        //actual value

        Map<String, Integer> actual = FinfFrequencyOfElements.findFrequency(Arrays.asList("apple", "banana", "apple", "orange"));
        assertEquals(expected, actual);
    }
}
