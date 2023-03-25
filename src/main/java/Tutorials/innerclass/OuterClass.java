package Tutorials.innerclass;

public class OuterClass {

    private String signature = "Hi, I'm a outer class!";

    public void printOuterSignature() {
        System.out.println(this.signature);

        // Local Inner Class
        class LocalInnerClass {
            String localSignature = "Hi, I'm a local inner class!";

            public void printInnerLocalSignature() {
                System.out.println(localSignature);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.printInnerLocalSignature();
    }

    // Inner Class
    public class InnerClass {

        private String signature = "Hi, I'm a inner class!";

        public void printInnerSignature() {
            System.out.println(this.signature);
        }
    }

    // Static Inner Class
    public static class StaticInnerClass {

        private String signature = "Hi, I'm a static inner class!";

        public void printInnerStaticSignature() {
            System.out.println(this.signature);
        }

    }
}