package count_words_in_file;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class CountWords {
    public static void main(String[] args) {
        String filePath = "src/sample.txt"; // file path
        //create a map
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // convert to lowercase to remove punctuation using regex
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                // it split  words and update the hashMap
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }

        // sort words by frequency
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            pq.offer(entry);
            if (pq.size() > 5) {
                pq.poll(); // remove low frequency
            }
        }

        // store the top 5 words in a list
        List<Map.Entry<String, Integer>> topWords = new ArrayList<>(pq);
        topWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        //display result
        System.out.println("Total Unique Words: " + wordCount.size());
        System.out.println("Top 5 Most Frequent Words:");
        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
