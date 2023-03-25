package Tutorials.innerclass;

public class InnerTest {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.printOuterSignature();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printInnerSignature();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass(); // in this case we don't need to instantiate the OuterClass                                                                          
        staticInnerClass.printInnerStaticSignature();                                                  //to instantiate the InnerClass

    }
    
}
