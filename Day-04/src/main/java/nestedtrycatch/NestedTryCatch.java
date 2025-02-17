package nestedtrycatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        //create an array
        int[] array = {10, 20, 30, 40, 50};
        //define the index
        int index = 2;
        //define divisor
        int divisor = 0;

        // calling method to perform array access and division
       arrayDivision(array, index, divisor);
    }
    // method to perform array access and division
    public static void arrayDivision(int[] array, int index, int divisor) {
        try {
            // try to access array element
            int value = array[index];

            try {
                // divide the element by divisor
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // handling division by zero error
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // to handle invalid index error
            System.out.println("Invalid array index!");
        }
    }
}
