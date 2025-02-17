package customexception;
import java.util.*;
public class CustomException {
    public static void main(String[] args) {
        //taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age : ");
        int age = scanner.nextInt();
        //call method to validate age
        validateAge(age);
        scanner.close(); //close scanner
    }
    //method to define custom exception
    public static void validateAge(int age) {
        try {
            if(age < 18){ //throw exception if age not valid
                throw new InvalidAgeException("Age must be 18 or above");
            }else  //age is valid
                System.out.println("Access granted");
        }catch (InvalidAgeException e){ //handles the exception
            System.out.println("caught exception: " + e.getMessage());
        }
    }
}
