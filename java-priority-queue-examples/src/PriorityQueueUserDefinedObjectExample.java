import java.util.Objects;
import java.util.PriorityQueue;

class Person implements Comparable<Person> {
    private String name;
    private double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Compare two person objects by their salary
    @Override
    public int compareTo(Person person) {
        if(this.getSalary() > person.getSalary()) {
            return 1;
        } else if (this.getSalary() < person.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class PriorityQueueUserDefinedObjectExample {
    public static void main(String[] args) {
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();

        // Add items to the Priority Queue
        personPriorityQueue.add(new Person("Rajeev", 100000.00));
        personPriorityQueue.add(new Person("Chris", 145000.00));
        personPriorityQueue.add(new Person("Andrea", 115000.00));
        personPriorityQueue.add(new Person("Jack", 167000.00));


        /*
            The compare() function implemented in the Person class is used to determine in what order the objects should be dequeued.
        */
        while (!personPriorityQueue.isEmpty()) {
            System.out.println(personPriorityQueue.remove());
        }
    }
}
