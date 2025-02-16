package annotations.exercise_problems.suppress_unchecked_warnings;

import java.util.ArrayList;

public class SuppressWarning {
    public static void main(String[] args) {
        // calling the method
        createList();
    }
    // suppress unchecked warnings
    @SuppressWarnings("unchecked")
    static void createList() {
        // creating an ArrayList without generics
        ArrayList list = new ArrayList();

        // Adding elements of different datatypes
        list.add("Hello");
        list.add(123);
        System.out.println(list);
    }
}
