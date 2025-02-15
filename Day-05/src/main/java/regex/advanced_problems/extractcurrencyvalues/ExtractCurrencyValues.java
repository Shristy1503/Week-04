package regex.advanced_problems.extractcurrencyvalues;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence with repeating currency: ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "\\$?\\d+\\.\\d{2}";
        // Call method
        List<String> currencyValues = extractCurrencyValues(regex, sentence);

        // Print extracted values
        for (String value : currencyValues) {
            System.out.println(value);
        }
    }
    // Method to extract currency values
    public static List<String> extractCurrencyValues(String regex, String text) {
        List<String> currencyValues = new ArrayList<>();

        // regex pattern to match currency values
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and store matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }
}
