package setinterface.checkiftwosetsareequal;
import java.util.*;

public class CheckEqualSets {
    public static void main(String[] args) {
        //create sets
        Set<Integer> set1 = new HashSet<>();
        //add elements in set 1
        set1.add(1);
        set1.add(2);
        set1.add(6);
        Set<Integer> set2 = new HashSet<>();
        //add elements in set 2
        set2.add(3);
        set2.add(6);
        set2.add(2);

    }
    public static boolean checkEqual(Set<Integer> set1, Set<Integer> set2){
        //check condition
        if (set1.equals(set2)) {
            return true;
        } else {
          return false;
        }
    }
}
