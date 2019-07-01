package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe2.IsEven.isEven;
import static org.junit.Assert.*;

public class IsEvenTest {
    public IsEven num;

    @Before
    public void setUp() {
        System.out.println("Before");
        num = new IsEven();

    }
    @After
    public void tearDown() {
        System.out.println("After");
        num = null;
    }
    @Test
    public void gvenOneNumberShouldReturnTrue(){
        boolean result=isEven(46);
        assertEquals(true,result);

    }
    @Test
    public void gvenOneNumberShouldReturnFalse(){
        boolean result=isEven(53);
        assertEquals(false,result);

    }
    @Test
    public void gvenOneNumberShouldReturn(){
        boolean result=isEven(78);
        assertEquals(true,result);

    }

}