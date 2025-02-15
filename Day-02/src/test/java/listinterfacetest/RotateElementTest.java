package listinterfacetest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listinterface.rotateelementsinlist.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementTest {
    @Test
    void rotateElementInListTest(){
        //create list
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(1);
        expected.add(2);
        //actual value
        RotateElementsInAList obj = new RotateElementsInAList();
        List actual = obj.rotateElementsInList(new ArrayList<>(Arrays.asList(1,2,3,4)), 2);
        assertEquals(expected, actual);

    }
}
