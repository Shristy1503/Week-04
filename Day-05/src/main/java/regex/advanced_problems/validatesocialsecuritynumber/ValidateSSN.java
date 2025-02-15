package regex.advanced_problems.validatesocialsecuritynumber;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Scanner;

public class ValidateSSN {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence with SSN : ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        //call the method
        List<String> result = validateSSN(regex, sentence);
        System.out.println(result);
    }
    //method to validate SSN
    public static List<String> validateSSN(String regex, String text) {
        List<String> ssn = new ArrayList<>();
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the number string from pattern
        Matcher matcher = pattern.matcher(text);
        //search for pattern in test
        while (matcher.find()) {
            //add the found ssn in the list
            ssn.add(matcher.group());
        }
        //return the SSN
        return ssn;
    }

}
