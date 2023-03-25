package Tutorials.lambdaexpressions;

public class Main {

    public static void main(String[] args) {

        Printable printLambda = (s) -> System.out.println("Meow " + s);
        printThing(printLambda, "hello");
        

    }

    static void printThing(Printable thing, String name) {
        thing.print(name);
    }

}
