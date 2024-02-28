import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class word_counter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter '1' to input text\nEnter '2' to provide a file: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        String text = "";
        switch (choice) {
            case 1:
                System.out.println("Enter text: ");
                text = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter file path: ");
                String filePath = sc.nextLine();
                try {
                    text = readFile(filePath);
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        String[] words = text.split("[\\s\\p{Punct}]+");
        int wordCount = words.length;

        
        String[] stopWords = {"a", "an", "the", "and", "or", "but", "in", "on", "at", "to", "for", "with"};
        int nonStopWordCount = 0;
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (!isStopWord(word, stopWords)) {
                nonStopWordCount++;
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        
        System.out.println("Total words: " + wordCount);

        
        System.out.println("Unique words: " + wordFrequency.size());
        System.out.println("Non-stop words: " + nonStopWordCount);
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String readFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            throw new IOException("File not found.");
        }
        return Files.readString(file.toPath());
    }

    private static boolean isStopWord(String word, String[] stopWords) {
        for (String stopWord : stopWords) {
            if (word.equalsIgnoreCase(stopWord)) {
                return true;
            }
        }
        return false;
    }
}