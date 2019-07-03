package com.stackroute;
//This is used to check whether the given number is palindrome or not
public class PalindromeChecker {
    public static String palindrome(String inputString) {
        String string = "", reverseString = "";
        int length = inputString.length();
        if (inputString.equals(" ")) {
            string = "Error";
        }
        //It is used to reverse the string.
       else {
            for (int i = length - 1; i >= 0; i--) {
                reverseString = reverseString + inputString.charAt(i);
            }
            //If the reverse string is equal to the given input string then it is palindrome.
            if (reverseString.equals(inputString)) {
                string = inputString + " is a palindrome";
            } else {
                string = inputString + " is not a palindrome";
            }
        }

        return string;

    }
}
