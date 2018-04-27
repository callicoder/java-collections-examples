import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> humanSpecies = new LinkedList<>();

        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthalensis");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Home Habilis");

        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
        humanSpecies.forEach(name -> {
            System.out.println(name);
        });


        System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
        Iterator<String> humanSpeciesIterator = humanSpecies.iterator();
        while (humanSpeciesIterator.hasNext()) {
            String speciesName = humanSpeciesIterator.next();
            System.out.println(speciesName);
        }

        System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
        humanSpeciesIterator = humanSpecies.iterator();
        humanSpeciesIterator.forEachRemaining(speciesName -> {
            System.out.println(speciesName);
        });

        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
        Iterator<String> descendingHumanSpeciesIterator = humanSpecies.descendingIterator();
        while (descendingHumanSpeciesIterator.hasNext()) {
            String speciesName = descendingHumanSpeciesIterator.next();
            System.out.println(speciesName);
        }


        System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
        // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards
        ListIterator<String> humanSpeciesListIterator = humanSpecies.listIterator(humanSpecies.size());
        while (humanSpeciesListIterator.hasPrevious()) {
            String speciesName = humanSpeciesListIterator.previous();
            System.out.println(speciesName);
        }

        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
        for(String speciesName: humanSpecies) {
            System.out.println(speciesName);
        }
    }
}
