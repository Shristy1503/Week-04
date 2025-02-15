package regex.extraction_problems.extractallcapitalizedwords;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "\\b[A-Z][a-z]+\\b";
        //call the method
        extractCapitals(regex, sentence);

    }
    //create method to extract capital words from sentence
    public static void extractCapitals(String regex, String text){
        //compile the regex pattern
      Pattern pattern = Pattern.compile(regex);
        //match the capital word string from pattern
      Matcher matcher = pattern.matcher(text);
        //search for pattern in test using find()
      while (matcher.find()){
          System.out.print(matcher.group());
      }
    }
}
