package regex.extraction_problems.extractdates;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractDates {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        //call the method
        extractDates(regex, sentence);
    }
    //create method to extract dates in dd/mm/yyyy format
    public static void extractDates(String regex, String text){
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the date string from pattern
        Matcher matcher = pattern.matcher(text);
        //search for pattern in test using find()
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}