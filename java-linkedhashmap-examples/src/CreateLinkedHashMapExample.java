import java.util.LinkedHashMap;

public class CreateLinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

        // Adding new key-value pairs to the LinkedHashMap
        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);

        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        wordNumberMapping.putIfAbsent("five", 5);


        System.out.println(wordNumberMapping);
    }
}
