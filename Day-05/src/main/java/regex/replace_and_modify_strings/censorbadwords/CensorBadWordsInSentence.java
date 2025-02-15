package regex.replace_and_modify_strings.censorbadwords;
import java.util.Scanner;
public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array of string to store bad words
        String[] badWords = { "damn", "stupid" };

        // Taking user input
        System.out.println("Enter a sentence:");
        String userInput = scanner.nextLine();

        // Censor bad words and display result
        String result = censorBadWords(userInput, badWords);
        System.out.println("Censored Sentence: " + result);

        scanner.close();
    }
    // Method to censor bad words
    public static String censorBadWords(String input, String[] badWords) {
        for (String word : badWords) {
            input = input.replaceAll("(?i)\\b" + word + "\\b", "****"); // Case-insensitive match
        }
        return input;
    }
}
