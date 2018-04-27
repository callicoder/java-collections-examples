import java.util.LinkedHashMap;

public class AccessEntriesFromLinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();

        customerIdNameMapping.put(1001, "Jack");
        customerIdNameMapping.put(1002, "David");
        customerIdNameMapping.put(1003, "Steve");
        customerIdNameMapping.put(1004, "Alice");
        customerIdNameMapping.put(1005, "Marie");

        System.out.println("customerIdNameMapping : " + customerIdNameMapping);

        // Check if a key exists in the LinkedHashMap
        Integer id = 1005;
        if(customerIdNameMapping.containsKey(id)) {
            System.out.println("Found the customer with id " + id + " : " + customerIdNameMapping.get(id));
        } else {
            System.out.println("Customer with id " + id + " does not exist");
        }

        // Check if a value exists in the LinkedHashMap
        String name = "David";
        if(customerIdNameMapping.containsValue(name)) {
            System.out.println("A customer named " + name + " exist in the map");
        } else {
            System.out.println("No customer found with name " + name + " in the map");
        }

        // Change the value associated with an existing key
        id = 1004;
        customerIdNameMapping.put(id, "Bob");
        System.out.println("Changed the name of customer with id " + id + ", New mapping : " + customerIdNameMapping);
    }
}
