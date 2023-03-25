package Tutorials.unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void zeroNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.deterineLetterGrade(0));
    }

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.deterineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.deterineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.deterineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.deterineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.deterineLetterGrade(99));
    }

    @Test
    void negativeOneNineShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {grader.deterineLetterGrade(-1);});
    }


}