import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemoveExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("numbers : " + numbers);

        // Remove an element from a HashSet (The remove() method returns false if the element does not exist in the HashSet)
        boolean isRemoved = numbers.remove(10);
        System.out.println("After remove(10) => " + numbers);

        // Remove all elements belonging to a given collection from a HashSet
        List<Integer> perfectSquares = new ArrayList<>();
        perfectSquares.add(4);
        perfectSquares.add(9);

        numbers.removeAll(perfectSquares);
        System.out.println("After removeAll(perfectSquares) => " + numbers);

        // Remove all elements matching a given predicate
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("After removeIf() => " + numbers);

        // Remove all elements from HashSet (clear it completely)
        numbers.clear();
        System.out.println("After clear() => " + numbers);
    }
}
