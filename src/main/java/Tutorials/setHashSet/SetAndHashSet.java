package Tutorials.setHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndHashSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();

        names.add("Lukas");
        names.add("Natlia");
        names.add("John");

        names.remove("John");

        System.out.println(names);

        names.forEach(System.out::println);

        List<String> namesDuplicates = Arrays.asList("Lukas", "Lukas", "Natlia", "John", "John");        

        namesDuplicates.forEach(name -> System.out.print(name + ", "));
        System.out.println();

        Set<String> namesWithoutDuplicates = new HashSet<String>(namesDuplicates); // or we can user .addAll() method

        namesWithoutDuplicates.forEach(name -> System.out.print(name + ", "));
        System.out.println();
    }
    
}
