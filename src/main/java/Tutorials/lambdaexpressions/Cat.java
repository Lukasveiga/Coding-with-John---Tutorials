package Tutorials.lambdaexpressions;

public class Cat implements Printable {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print(String name) {
        System.out.println(this.name + " says: Meow");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
