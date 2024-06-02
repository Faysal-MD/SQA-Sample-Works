import java.io.*;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "E:\\Installed software\\eclipse-workspace\\WordCount\\src\\input.txt";

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase
                line = line.toLowerCase();

                // Split the line into words, ignoring punctuation
                String[] words = line.split("[\\W_]+");

                // Count each word
                for (String word : words) {
                    if (word.isEmpty()) {
                        continue;
                    }
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a TreeMap to sort the words alphabetically
        TreeMap<String, Integer> sortedWordCounts = new TreeMap<>(wordCounts);

        // Print the word counts
        for (Map.Entry<String, Integer> entry : sortedWordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
