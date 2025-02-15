package regex.advanced_problems.extractprogramminglanguagenames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String userInput = scanner.nextLine();

        // Extract and display programming languages
        List<String> extractedLanguages = extractProgrammingLanguages(userInput);
        System.out.println("Extracted Programming Languages: " + String.join(", ", extractedLanguages));
    }
    // Method to extract programming languages from text
    public static List<String> extractProgrammingLanguages(String text) {
        // List of programming languages to search for
        String[] languages = { "Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "R", "TypeScript" };

        List<String> foundLanguages = new ArrayList<>();
        for (String lang : languages) {
            // Use regex to match whole words
            Pattern pattern = Pattern.compile("\\b" + lang + "\\b");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                foundLanguages.add(lang);
            }
        }
        return foundLanguages;
    }
}
