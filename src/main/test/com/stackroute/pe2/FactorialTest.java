package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    public Factorial num;
    @Before
    public void setUp(){
        System.out.println("Before");
        num=new Factorial();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        num=null;
    }
    @Test
    public void givenNumberShouldReturnFactorial(){
        String total=num.fact(6);
        assertEquals("success",total);
    }
    @Test
    public void givenNumberShouldReturnOutOfRange(){
        String total=num.fact(20);
        assertEquals("Out of range",total);
    }
    @Test
    public void givenNegativeNumberShouldReturnError(){
        String total=num.fact(-5);
        assertEquals("Error",total);
    }
}
