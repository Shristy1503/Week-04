package setinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import setinterface.convertasettosortedlist.*;
import java.util.*;
public class SetToSortedListTest {
    HashSet<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
    @Test
    void SortedListtest(){
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(1,3,5,9));
        assertEquals(ConvertSetToSortedList.convertToList(numbers),sortedList);
    }

}
