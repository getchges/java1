//1. Program for sorting a given list of names in ascending order. 
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Sort the list in ascending order
        Collections.sort(names);

        // Print the sorted names
        System.out.println("Sorted Names (Ascending Order):");
        for (String people : names) {
            System.out.println(people);
        }
    }
}
