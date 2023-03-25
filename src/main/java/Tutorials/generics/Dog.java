package Tutorials.generics;

public class Dog extends Animal{

    private String name;
    private String color;
    
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog --> Name: " + name + ", Color: " + color;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating...");
        
    }

    
}
