import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCaseInsensitiveExample {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom Comparator (Case Insensitive Order)
        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        /*
            The above TreeSet with the custom Comparator is the concise form of the following:
            SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
                }
            });
        */

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Now, lowercase elements will also be considered as duplicates
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
    }
}
