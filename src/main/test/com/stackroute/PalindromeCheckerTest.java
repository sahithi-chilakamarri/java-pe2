package com.stackroute;

import com.stackroute.PalindromeChecker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.PalindromeChecker.palindrome;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    public PalindromeChecker palindromeChecker;

    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @After
    public void tearDown() {
        palindromeChecker = null;
    }

    @Test
    public void givenOneStringShouldReturnReverseAndPalindrome() {
        //arrange
        //act
        String result = palindrome("sasas");
        //assert
        assertEquals("sasas is a palindrome", result);
    }
    @Test
    public void givenOneStringShouldReturnNotPalindrome() {
        //arrange
        //act
        String result = palindrome("abcd");
        //assert
        assertEquals("abcd is not a palindrome", result);
    }
    @Test
    public void givenEmptyStringShouldReturnError() {
        //arrange
        //act
        String result = palindrome(" ");
        //assert
        assertEquals("Error", result);
    }

}
