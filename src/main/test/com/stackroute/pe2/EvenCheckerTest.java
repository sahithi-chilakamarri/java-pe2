package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckerTest {
    public EvenChecker evenChecker;

    @Before
    public void setUp() {
        evenChecker = new EvenChecker();

    }
    @After
    public void tearDown() {
        evenChecker = null;
    }
    @Test
    public void gvenOneNumberShouldReturnTrue(){
        //arrange
        //act
        //assert
        assertTrue(evenChecker.isEven(46));

    }
    @Test
    public void gvenOneNumberShouldReturnFalse(){
        //arrange
        //act
        //assert
        assertFalse(evenChecker.isEven(53));

    }
    @Test
    public void gvenOneNumberShouldReturn(){
        //arrange
        //act
        boolean result=evenChecker.isEven(78);
        //assert
        assertEquals(true,result);

    }

}