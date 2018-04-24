import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCustomComparatorExample {
    public static void main(String[] args) {
        // Creating a TreeMap with a Custom comparator (Descending order)
        SortedMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        /*
            The above TreeMap with custom Comparator can be simply written as -
            SortedMap<String, String> fileExtensions = new TreeMap<>(Comparator.reverseOrder());
        */

        // Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        // Printing the TreeMap (The keys will be sorted based on the supplied comparator)
        System.out.println(fileExtensions);

    }
}
