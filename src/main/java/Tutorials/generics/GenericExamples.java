package Tutorials.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {

    public static void main(String[] args) {

        Printer<Integer> printerInteger = new Printer<>(23);
        printerInteger.print();

        Printer<String> printerString = new Printer<>("Hello, world!");
        printerString.print();

        PrinterAnimal<Dog> printerAnimal = new PrinterAnimal<>(new Dog("Lala", "Black"));
        printerAnimal.print();

        shout("Lukas", 26);
        shout("New dog: ", new Dog("Duquesa", "Brown"));

        List<Dog> pets = new ArrayList<>();
        pets.add(new Dog("Shakira", "White"));
        printList(pets);
        
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }

    private static void printList(List<? extends Animal> myList) {  // Wildcard
        System.out.println(myList);
    }
    
}
