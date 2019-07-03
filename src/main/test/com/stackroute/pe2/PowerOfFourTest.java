package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    public PowerOfFour powerOfFour;

    @Before
    public void setUp() {
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {
        powerOfFour = null;
    }
    @Test
    public void givenOneNumberShouldReturnPowerOfFour()
    {
        String result=powerOfFour.power(44);
        assertEquals("It is not power of 4",result);
    }
    @Test
    public void givenOneNumberShouldReturnNotPowerOfFour()
    {
        String result=powerOfFour.power(64);
        assertEquals("It is power of 4",result);
    }
    @Test
    public void givenOneNumberShouldReturnPower()
    {
        String result=powerOfFour.power(-16);
        assertNotEquals("It is power of 4",result);
    }
}