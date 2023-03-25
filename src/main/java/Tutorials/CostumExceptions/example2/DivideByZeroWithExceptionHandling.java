package Tutorials.CostumExceptions.example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        boolean continueLoop = true;

        do {
            try{
                System.out.print("Please enter an integer number: ");
                int numerador = scan.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int divisor = scan.nextInt();

                int resultado = quotient(numerador, divisor);
                System.out.printf("%nResult: %d / %d = %d%n", numerador, divisor, resultado);
                continueLoop = false;
                
            } catch (InputMismatchException e) {

                System.out.println("Exception: " + e);
                scan.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");

            } catch (ArithmeticException e) {

                System.out.println("Exception: " + e);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
            
        } while(continueLoop);
        
        scan.close();
    }

    private static int quotient(int numerador, int divisor) {

        return numerador / divisor;
    }
    
}
