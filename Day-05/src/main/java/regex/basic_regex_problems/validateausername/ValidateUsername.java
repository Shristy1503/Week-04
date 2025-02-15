package regex.basic_regex_problems.validateausername;
import java.util.regex.*;
import java.util.Scanner;
public class ValidateUsername {
    public static void main(String[] args) {
       //define the regex
        String regex = "^[a-zA-Z0-9_]{5,15}$";
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
       //call the method
       boolean result = validateUsername(regex, username);
       //check if match is valid or not
        if(result){
            System.out.println(username + " -> " + " Valid");
        }else
            System.out.println(username + " -> " + "Invalid");
    }

    //method to validate the username
    public static boolean validateUsername(String regex, String string){
       //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the username string from pattern
        Matcher matcher = pattern.matcher(string);

        //return the boolean result true if match false if not
        return matcher.matches();
    }
}
