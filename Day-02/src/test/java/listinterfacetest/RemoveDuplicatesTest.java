package listinterfacetest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listinterface.removeduplicateswhilepreservingorder.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {
    //apply test to remove duplicate while preserving the order
    @Test
    void removeDuplicateWhilePreservingOrderTest(){
        //create a list
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        //create actual value
        List<Integer> actual = RemoveDuplicatesWhilePreservingOrder.removeDuplicates(Arrays.asList(2, 3, 2, 6));
        assertEquals(list, actual);
    }
}
