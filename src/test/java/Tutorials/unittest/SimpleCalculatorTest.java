package Tutorials.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void twoPlusThreeShouldEqualFive(){
        var calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void fourPlusSixShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(4,6));
    }


}