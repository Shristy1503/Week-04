package regex.advanced_problems.validatecreditcardnumber;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a credit card number:");
        String userInput = scanner.nextLine();

        // Validate the credit card number
        if (isValidCreditCard(userInput)) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }
    // Method to validate a credit card number
    public static boolean isValidCreditCard(String cardNumber) {
        // Regex for Visa and masterCard
        String cardPattern = "^(4\\d{15}|5\\d{15})$";
        return cardNumber.matches(cardPattern);
    }
}
