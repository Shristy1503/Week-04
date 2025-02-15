package regex.extraction_problems.extractallemailaddresses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAdresses {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        //call the method
        extractEmailAdresses(text);
    }
    //method to extract all email addresses from a text
    public static void extractEmailAdresses(String string){
        //define regex
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the username string from pattern
        Matcher matcher = pattern.matcher(string);

        //search for pattern in test using find()
       while (matcher.find()){
           System.out.println(matcher.group());
       }

    }
}
