package com.stackroute;

public class Palindrome {
    public static String palindrome(String input) {
        String string = "", str = "";
        if (input.equals(" ")) {
            string = "Error";
        }
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            str = str + input.charAt(i);
        }
        if (str.equals(input)) {
            string = input + "is a palindrome";
        } else {
            string = input + "is not a palindrome";
        }


        return string;

    }
}
