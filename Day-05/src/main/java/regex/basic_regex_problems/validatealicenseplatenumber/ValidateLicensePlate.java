package regex.basic_regex_problems.validatealicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        //define the regex
        String regex = "^[A-Z]{2}[0-9]{4}$";
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plate number: ");
        String number = scanner.nextLine();
        //call the method
        //call the method
        boolean result = validateNumberplate(regex, number);
        //check if match is valid or not
        if(result){
            System.out.println(number + " -> " + " Valid");
        }else
            System.out.println(number + " -> " + "Invalid");
    }
    //method to validate the number plate
    public static boolean validateNumberplate(String regex, String string){
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the username string from pattern
        Matcher matcher = pattern.matcher(string);

        //return the boolean result true if match false if not
        return matcher.matches();
    }
}
