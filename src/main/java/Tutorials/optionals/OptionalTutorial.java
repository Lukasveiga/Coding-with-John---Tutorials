package Tutorials.optionals;

import Tutorials.lambdaexpressions.Cat;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) {

        Cat myCat = findCatByName("Fred").orElseThrow(NoSuchElementException::new);
        System.out.println(myCat.getAge());

        Optional<Cat> myCat2 = findCatByName("José");

        int age = myCat2.map(Cat::getAge).orElse(0);
        System.out.println(age);

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);

        return Optional.ofNullable(cat);
    }
}
