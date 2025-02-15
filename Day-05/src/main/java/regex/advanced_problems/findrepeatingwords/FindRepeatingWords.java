package regex.advanced_problems.findrepeatingwords;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.Scanner;
public class FindRepeatingWords {
    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence with repeating words: ");
        String sentence = scanner.nextLine();
        //define the regex
        String regex = "\\b(\\w+)\\b";
        //call the method
        Set<String> result = findRepeatedWords(regex, sentence);
        System.out.println(result);
        for (String str : result){
            System.out.println(str);
        }
    }
    //method to find repeated words
    public static Set<String> findRepeatedWords(String regex, String text) {
        Set<String> repeatWord = new HashSet<>();
        Set<String> word = new HashSet<>();
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the number string from pattern
        Matcher matcher = pattern.matcher(text);
        //search for pattern in test
        while (matcher.find()) {
            //it extract and store the repeated word
            String string = matcher.group(1);
            if(!word.add(string)){
                repeatWord.add(string);
            }
        }
        //return the word
        return repeatWord;
    }
}
