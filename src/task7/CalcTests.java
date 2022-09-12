package task7;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import task6.CalcOOP;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalcTests {

    @Test
    public void testCheckingTheAdditionMethod(){
        CalcOOP myCalc = new CalcOOP(19,7);
        assertEquals(26,myCalc.plus(), 0);
    }

    @Test
    public void testCheckingTheSubtractMethod(){
        CalcOOP myCalc = new CalcOOP(18,13);
        assertEquals(5,myCalc.minus(), 0);
    }

    @Test
    public void testCheckingTheMultiplicationMethod(){
        CalcOOP myCalc = new CalcOOP(10,3);
        assertEquals(30,myCalc.multiplication(), 0);
    }

    @Test
    public void testCheckingTheDivisionMethod(){
        CalcOOP myCalc = new CalcOOP(15,5);
        assertEquals(3,myCalc.division(), 0);
    }



    @Test
    public void testCheckingTheDivisionByZeroMethod() {
        try {CalcOOP myCalc = new CalcOOP(10, 0);}
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testFirstNumberFormatException(){
        exception.expect(NumberFormatException.class);
        CalcOOP myCalc = new CalcOOP(6,1);
        myCalc.setFirstNumber(Double.parseDouble("b"));
        fail("Expected NumberFormatException");}

    @Test
    public void testSecondNumberFormatException(){
        exception.expect(NumberFormatException.class);
        CalcOOP myCalc = new CalcOOP(1,1);
        myCalc.setSecondNumber(Double.parseDouble("a"));
        fail("Expected NumberFormatException");}


    @Test(expected = AssertionError.class)
    public void testAssertionError(){
        Scanner actual = new Scanner("10 5 a");
        fail("Expected AssertionError");
    }
}