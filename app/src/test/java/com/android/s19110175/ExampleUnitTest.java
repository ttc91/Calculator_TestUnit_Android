package com.android.s19110175;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.android.s19110175.calculator.Calculator;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator calculator;
    private Object ExceptionInInitializerError;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    //------------------------(ADDITION)-------------------------------//

    //Case 1 : Addition of positive integers
    @Test
    public void testAddTwoPositiveNumbers() {
        double result = calculator.addTwoNumbers(3, 6);
        assertEquals(result, 9, 0d);
    }

    //Case 2 : Addition of positive integers and zero
    @Test
    public void testAddPositiveIntegerAndZero(){
        double result = calculator.addTwoNumbers(3, 0);
        assertEquals(result, 3, 0);
    }

    //Case 3 : Addition of negative integers
    @Test
    public void testAddNegativeIntegers(){
        double result = calculator.addTwoNumbers(-3, -3);
        assertEquals(result, -6, 0d);
    }

    //Case 4 : Addition of one positive and one negative integers
    @Test
    public void testAddPositiveAndNegativeNumbers(){
        double result = calculator.addTwoNumbers(3, -3);
        assertEquals(result, 0, 0d);
    }

    //Case 5 : Addition positive integer and float point negative numbers
    @Test
    public void testAddPositiveAndFloatPointNegativeNumbers(){
        double result = calculator.addTwoNumbers(3, -3.3);
        assertEquals(result, -0.3, 1d);
    }

    //Case 6 : Addition float positive numbers
    @Test
    public void testAddFloatPositiveNumber(){
        double result = calculator.addTwoNumbers(3.3, 3.3);
        assertEquals(result, 6.6, 1d);
    }

    //Case 7 : Addition float negative numbers
    @Test
    public void testAddFloatNegativeNumber(){
        double result = calculator.addTwoNumbers(-3.3, -3.3);
        assertEquals(result, -6.6, 1d);
    }

    //Case 8 : Addition float negative number and zero :
    @Test
    public void testAddFloatNegativeNumberAndZero(){
        double result = calculator.addTwoNumbers(-3.3, -0);
        assertEquals(result, -3.3, 1d);
    }

    //Case 8 : Addition multiple float negative numbers and one positive number :
    @Test
    public void testAddMulFloatNegativeNumberAndPositiveNum(){
        double result = calculator.addTwoNumbers(-3 * (-4) , 3);
        assertEquals(result, 15, 1d);
    }

    //Case 9 : Addition multiple float positive numbers and one negative number :
    @Test
    public void testAddMulFloatPositiveNumberAndNegativeNum(){
        double result = calculator.addTwoNumbers(3 * (4) , -3);
        assertEquals(result, 9, 0d);
    }

    //--------------------------(SUBTRACTION)

    //Case 1 : Subtraction of positive integers
    @Test
    public void testSubTwoPositiveNumbers() {
        double result = calculator.subTwoNumbers(3, 4);
        assertEquals(result, -1, 0d);
    }

    //Case 2 : Subtraction of Negative integers
    @Test
    public void testSubTwoNegativeNumbers(){
        double result = calculator.subTwoNumbers(-3, -4);
        assertEquals(result, 1, 0d);
    }

    //Case 3 : Subtraction with a positive float number and positive integer
    @Test
    public void testSubFloatPositiveNumberAndInteger(){
        double result = calculator.subTwoNumbers(3.4, 4);
        assertEquals(result, -0.6, 1d);
    }

    //Case 4 : Subtraction with a negative float number and positive integer
    @Test
    public void testSubFloatNegativeNumberAndInteger(){
        double result = calculator.subTwoNumbers(-3.4, 4);
        assertEquals(result, -7.4, 0d);
    }

    //Case 5 : Subtraction with a negative float numbers
    @Test
    public void testSubFloatNegativeNumbers(){
        double result = calculator.subTwoNumbers(-3.4, -3.4);
        assertEquals(result, 0, 0d);
    }

    //Case 6 : Subtraction with a negative float and zero
    @Test
    public void testSubFloatNegativeFloatAndZero(){
        double result = calculator.subTwoNumbers(-3.4, 0);
        assertEquals(result, -3.4, 0d);
    }

    //Case 7 : Subtraction with a positive float and zero
    @Test
    public void testSubFloatPosFloatAndZero(){
        double result = calculator.subTwoNumbers(3.4, 0);
        assertEquals(result, 3.4, 0d);
    }

    //Case 8 : Subtraction multiple float positive numbers and one negative number :
    @Test
    public void testSubMulFloatPositiveNumberAndNegativeNum(){
        double result = calculator.subTwoNumbers(3 * (4) , -3);
        assertEquals(result, 15, 0d);
    }

    //-----------------(MULTIPLICATION)

    //Case 1 : Multiplication two positive integer
    @Test
    public void testMulPositiveIntegers(){
        double result = calculator.mulTwoNumbers(4, 4);
        assertEquals(result, 16, 0d);
    }

    //Case 2 : Multiplication two negative integer
    @Test
    public void testMulNegativeIntegers(){
        double result = calculator.mulTwoNumbers(-4, -4);
        assertEquals(result, 16, 0d);
    }

    //Case 3 : Multiplication two positive floats
    @Test
    public void testMulPositiveFloat(){
        double result = calculator.mulTwoNumbers(4.5, 3.2);
        assertEquals(result, 14.4, 1d);
    }

    //Case 4 : Multiplication two negative floats
    @Test
    public void testMulNegativeFloat(){
        double result = calculator.mulTwoNumbers(-4.5, -3.2);
        assertEquals(result, 14.4, 1d);
    }

    //Case 5 : Multiplication two negative floats
    @Test
    public void testMulNegativeFloatAndPositiveInteger(){
        double result = calculator.mulTwoNumbers(-4.5, 3);
        assertEquals(result, -13.5, 1d);
    }

    //---------------------(DIVISION)

    //Case 1 : Division two positive integer
    @Test
    public void testDivisionPositiveIntegers(){
        double result = calculator.divTwoNumbers(4, 4);
        assertEquals(result, 1, 0d);
    }

    //Case 2 : Division two negative integer
    @Test
    public void testDivNegativeIntegers(){
        double result = calculator.divTwoNumbers(-4, -4);
        assertEquals(result, 1, 0d);
    }

    //Case 3 : Division two positive floats
    @Test
    public void testDivPositiveFloat(){
        double result = calculator.divTwoNumbers(4.5, 3.2);
        assertEquals(result, 1.40625, 1d);
    }

    //Case 4 : Multiplication two negative floats
    @Test
    public void testDivNegativeFloat(){
        double result = calculator.divTwoNumbers(-4.5, -3.2);
        assertEquals(result, 1.40625, 1d);
    }

    //Case 5 : Multiplication two negative floats
    @Test
    public void testDivNegativeFloatAndPositiveInteger(){
        double result = calculator.divTwoNumbers(-4.5, 3);
        assertEquals(result, -1.5, 1d);
    }

    //--------------(EXPONENTIAL)

    //Case 1 :  a positive integer to the power of positive integer
    @Test
    public void testPosIntPowPosInt(){
        double result = calculator.exponentialNumber(4, 4);
        assertEquals(result, 256, 0d);
    }

    //Case 2 :  a positive integer to the power of negative integer
    @Test
    public void testPosIntPowNevInt(){
        double result = calculator.exponentialNumber(4, -4);
        assertEquals(result, 0.00390625, 1d);
    }

    //Case 3 :  a positive integer to the power of negative float
    @Test
    public void testPosIntPowNevFloat(){
        double result = calculator.exponentialNumber(4, -4.5);
        assertEquals(result, 0.001953125, 1d);
    }

    //Case 4 :  a positive float to the power of negative float
    @Test
    public void testPosFloatPowNevFloat(){
        double result = calculator.exponentialNumber(4.5, -4.5);
        assertEquals(result, 0.00114959188, 1d);
    }

    //Case 5 :  a positive float to the power of positive float
    @Test
    public void testPosFloatPowPosFloat(){
        double result = calculator.exponentialNumber(4.5, 4.5);
        assertEquals(result, 869.873923381, 1d);
    }

    //----------------(FACTORIAL)

    //Case 1 : Submit integer value at upper boundary +1
    @Test
    public void tesFactorialOfInt(){
        Integer result = calculator.factorialNumber(4);
        assertEquals(result, 24, 0d);
    }

    //Case 2 : Submit integer value with leading 0
    @Test
    public void tesFactorialOfIntLeadingZero(){
        Integer result = calculator.factorialNumber(04);
        assertEquals(result, 24, 0d);
    }

    //Case 3 : Submit integer value with leading plus sign [+]
    @Test
    public void tesFactorialOfIntLeadingPlus(){
        Integer result = calculator.factorialNumber(+4);
        assertEquals(result, 24, 0d);
    }

    //Case 4 : Submit integer value with leading space
    @Test
    public void tesFactorialOfIntLeadingMinus(){
        Integer result = calculator.factorialNumber( 4);
        assertEquals(result, 24, 0d);
    }

    //Case 5 : Submit integer value 1
    @Test
    public void tesFactorialOfOneValue(){
        Integer result = calculator.factorialNumber( 1);
        assertEquals(result, 1, 0d);
    }

    //-----------------------(LOGARITHM)

    //Case 1 : Submit with a is positive integer and x also
    @Test
    public void testLogPosInts(){
        double result = calculator.logarithmNumber(4, 5);
        assertEquals(result, 1.1609640474, 1d);
    }

    //Case 2 : Submit with a is positive and x positive float
    @Test
    public void testLogPosBaseAndPosFloat(){
        double result = calculator.logarithmNumber(4, 4.5);
        assertEquals(result, 1.0849625007, 1d);
    }

    //Case 3 : Submit with base number a is positive float and x positive float
    @Test
    public void testLogPosFloatBaseAndPosFloat(){
        double result = calculator.logarithmNumber(4.5, 4.3);
        assertEquals(result, 0.96977391311, 1d);
    }

    //Case 4 : Submit with base number a is positive float and x positive integer
    @Test
    public void testLogPosFloatBaseAndPosInt(){
        double result = calculator.logarithmNumber(4.5, 4);
        assertEquals(result, 0.92169084124, 1d);
    }

    //Case 5 : Submit with base number a and log number x is same value
    @Test
    public void testLogNumAndBaseNumIsSame(){
        double result = calculator.logarithmNumber(4, 4);
        assertEquals(result, 1, 1d);
    }
}