package regex.advanced_problems.validateipaddress;
import java.util.Scanner;
public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter an IP address:");
        String userInput = scanner.nextLine();

        // Validate the IP address
        if (isValidIPv4(userInput)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }
    }
    // Method to validate an IPv4 address
    public static boolean isValidIPv4(String ip) {
        String ipAddress = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d?|0)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d?|0)){3}$";
        //return the result of valid ip address
        return ip.matches(ipAddress);
    }
}
