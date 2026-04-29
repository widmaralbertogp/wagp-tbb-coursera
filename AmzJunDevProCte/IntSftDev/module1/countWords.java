import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class WordCounter {
    public static Map<String, Integer> countWords(String text, Set<String> stopWords) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = text.trim().split("\\s+");
        for (String word : words) {
            if (!stopWords.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }
}
// Usage
String inputText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
Set<String> stopWords = new HashSet<>();
stopWords.add("ipsum");
stopWords.add("sit");
Map<String, Integer> wordCounts = WordCounter.countWords(inputText, stopWords);
System.out.println("Word counts:");
for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
