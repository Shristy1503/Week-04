package regex.basic_regex_problems.validateahexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        //define the regex
        String regex = "^[#][0-9A-Fa-f]{6}$";
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hex Color code: ");
        String hexColor = scanner.nextLine();
        //call the method
        boolean result = validateHexColorCode(regex, hexColor);
        //check if match is valid or not
        if(result){
            System.out.println(hexColor + " -> " + " Valid");
        }else
            System.out.println(hexColor + " -> " + "Invalid");

    }
    //method to validate the hex color code
    public static boolean validateHexColorCode(String regex, String string){
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the username string from pattern
        Matcher matcher = pattern.matcher(string);

        //return the boolean result true if match false if not
        return matcher.matches();
    }

}
