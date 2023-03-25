package Tutorials.exceptionhandling;

public class TesteOne {

    public static void main(String[] args) {

        try {
            int result = getInt("13");
            System.out.println(result);
            System.out.println("OK!");
        } catch (Exception e) {
            System.out.println(e.toString() + ": You must have to pass a integer!!");
        }
        
    }

    private static int getInt(String number)  throws Exception {
        return Integer.parseInt(number);
    } 
    
}
