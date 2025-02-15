package listinterfacetest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listinterface.reversealist.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseListTest {//create list
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

    //reverse array list test
    @Test
    void reverseArrayListTest(){
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        ReverseArrayList.reverseArrayList(arrayList);
        assertEquals(expected, arrayList);
    }
    //reverse linkedlist test
    @Test
    void reverseLinkedListTest(){
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList( 4, 3, 2, 1));
        ReverseLinkedList.reverseLinkedList(linkedList);
        assertEquals(expected, linkedList);
    }
}
