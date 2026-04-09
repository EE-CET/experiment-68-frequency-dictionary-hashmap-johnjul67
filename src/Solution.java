import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        String[] resultParts = new String[frequencyMap.size()];
        int i = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            resultParts[i++] = entry.getKey() + ": " + entry.getValue();
        }
        System.out.println(String.join(" ", resultParts));
    }
}