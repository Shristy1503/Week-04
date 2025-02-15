package regex.extraction_problems.extractlinksfromwebpage;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class ExtractLinksFromWebPage {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "https?://()";
        //call the method
        List<String> result = extractLinks(regex, sentence);
        System.out.println("links are: " + result);

    }
    public static List<String> extractLinks(String regex, String text) {
        List<String> links = new ArrayList<>();
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the date string from pattern
        Matcher matcher = pattern.matcher(text);
         //search for pattern in test
        while (matcher.find()) {
            //add the found link in the list
            links.add(matcher.group());
        }
        //return the links
        return links;
    }
}
