import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateOverLinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();

        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Chris", "London");
        userCityMapping.put("David", "Paris");
        userCityMapping.put("Jesse", "California");

        System.out.println("=== Iterating over a LinkedHashMap using Java 8 forEach and lambda ===");
        userCityMapping.forEach((user, city) -> {
            System.out.println(user + " => " + city);
        });


        System.out.println("\n=== Iterating over the LinkedHashMap's entrySet using Java 8 forEach and lambda ===");
        userCityMapping.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() ===");
        Iterator<Map.Entry<String, String>> userCityMappingIterator = userCityMapping.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<String, String> entry = userCityMappingIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() and forEachRemaining ===");
        userCityMappingIterator = userCityMapping.entrySet().iterator();
        userCityMappingIterator.forEachRemaining(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });
    }
}
