package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {
    public FactorialCalculator factorialCalculator;
    @Before
    public void setUp(){
        factorialCalculator =new FactorialCalculator();
    }
    @After
    public void tearDown(){
        factorialCalculator =null;
    }
    @Test
    public void givenNumberShouldReturnFactorial(){
        //arrange
        //act
        String total= factorialCalculator.factorial(6);
        //assert
        assertEquals("success",total);
    }
    @Test
    public void givenNumberShouldReturnOutOfRange(){
        //arrange
        //act
        String total= factorialCalculator.factorial(20);
        //assert
        assertEquals("Out of range",total);
    }
    @Test
    public void givenNegativeNumberShouldReturnError(){
        //arrange
        //act
        String total= factorialCalculator.factorial(-5);
        //assert
        assertEquals("Error",total);
    }
}
