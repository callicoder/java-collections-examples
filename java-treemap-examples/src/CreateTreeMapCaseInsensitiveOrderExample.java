import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCaseInsensitiveOrderExample {
    public static void main(String[] args) {
        // TreeMap with keys sorted by ignoring case
        SortedMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        /*
            The above statement is the short form of -
            SortedMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
                }
            });
        */

        fileExtensions.put("PYTHON", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("KOTLIN", ".kt");
        fileExtensions.put("Golang", ".go");

        // The keys will be sorted ignoring the case (Try removing String.CASE_INSENSITIVE_ORDER and see the output)
        System.out.println(fileExtensions);
    }
}
