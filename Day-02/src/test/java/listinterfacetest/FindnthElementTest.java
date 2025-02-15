package listinterfacetest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listinterface.findnthelementfromtheend.*;
import java.util.Arrays;
import java.util.LinkedList;

public class FindnthElementTest {
    //method to test to find the nth element from the last
    @Test
    void FindNthElementTest(){
     //create a linked list
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
       list.add('D');
        list.add('E');
        //check actual and expected
        assertEquals(Character.valueOf('D'), FindnthElement.findnthElement(list, 2));
    }
}
