package finallyblockexecution;
import java.util.Scanner;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter numerator: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int num2 = scanner.nextInt();

        // calling method
        division(num1, num2);

        scanner.close();
    }
    //method to perform division
    public static int division(int num1, int num2){
        int result = 0;
        try {
            // performing division
             result = num1 / num2;
            return result;
        }
        //catch the arithmetic exception
        catch (ArithmeticException e) {
            // Handling division by zero error
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // this block will always execute
            System.out.println("Operation completed.");
        }
        return result;
    }
}
