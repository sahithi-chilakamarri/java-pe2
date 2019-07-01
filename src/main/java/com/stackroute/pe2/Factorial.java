package com.stackroute.pe2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Factorial {
    public static String fact(int num) {
        int i, fact = 1;
        if (num < 0)
            return "Error";//It is the number to calculate factorial
        for (i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
                fact = fact * j;
        }
       if(fact==0)
       {
           return "Out of range";
       }
       else
       {
           return "success";
       }
    }
}
