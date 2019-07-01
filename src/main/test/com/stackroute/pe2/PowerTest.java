package com.stackroute.pe2;

import com.stackroute.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe2.Power.power;
import static org.junit.Assert.*;

public class PowerTest {
    public Power num;

    @Before
    public void setUp() {
        System.out.println("Before");
        num = new Power();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        num = null;
    }
    @Test
    public void givenOneNumberShouldReturnPowerOfFour()
    {
        String result=power(44);
        assertEquals("It is not power of 4",result);
    }
    @Test
    public void givenOneNumberShouldReturnNotPowerOfFour()
    {
        String result=power(64);
        assertEquals("It is power of 4",result);
    }
    @Test
    public void givenOneNumberShouldReturnPower()
    {
        String result=power(-16);
        assertEquals("It is power of 4",result);
    }
}