package uncheckedexception;
import java.io.*;
import java.util.*;
public class UncheckedException  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = performDivision(scanner);
        System.out.println("Result: " + result);
        scanner.close();
    }
    //method to do the arithmetic performance
    public static double performDivision(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            return num1 / num2;
        } catch (ArithmeticException e) { // Catches division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) { // Catches invalid input
            System.out.println("Error: Invalid input given. Please enter numeric values.");
            scanner.next(); // Clear the invalid input
        }
        return 0; // Return a default value if an exception occurs
    }
    
}
