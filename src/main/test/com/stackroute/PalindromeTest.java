package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.Palindrome.palindrome;
import static org.junit.Assert.*;

public class PalindromeTest {
    public Palindrome string;

    @Before
    public void setUp() {
        System.out.println("Before");
        string = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        string = null;
    }

    @Test
    public void givenOneStringShouldReturnReverseAndPalindrome() {
        String result = palindrome("sasas");
        assertEquals("sasasis a palindrome", result);
    }
    @Test
    public void givenOneStringShouldReturnReverseAndNotPalindrome() {
        String result = palindrome("abcd");
        assertEquals("abcdis not a palindrome", result);
    }
    @Test
    public void givenEmptyStringShouldReturnError() {
        String result = palindrome("defc");
        assertEquals("defcis not a palindrome", result);
    }
}
