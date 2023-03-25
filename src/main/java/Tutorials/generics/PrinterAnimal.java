package Tutorials.generics;

public class PrinterAnimal<T extends Animal> {

    private T thingToPrint;

    public PrinterAnimal(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
        thingToPrint.eat();
    }
    
}
