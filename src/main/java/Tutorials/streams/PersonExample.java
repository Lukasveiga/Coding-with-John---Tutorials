package Tutorials.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonExample {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();

        people.add(new Person("James", 25));
        people.add(new Person("Beatriz", 32));
        people.add(new Person("Kat", 28));
        people.add(new Person("John", 29));

        List<Person> ageLessThan30 = people.stream()
            .filter(person -> person.getAge() <= 30)
                .collect(Collectors.toList());

        ageLessThan30.forEach(person -> System.out.println(person));

        System.out.println("--------------------------");

        List<Person> sortedList = people.stream().
            sorted(Comparator.comparing(person -> person.getName()))
                .collect(Collectors.toList());

        sortedList.forEach(person -> System.out.println(person));
        
    }

    private static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person [Name: " + name + ", Age: " + age + "]";
        }

        
        
    }
    
}
