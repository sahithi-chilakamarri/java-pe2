package com.stackroute.pe2;
//This is used to calculate the factorial.
public class FactorialCalculator {
    public String factorial(int number) {
        int i, factorial = 1;
        if (number < 0)
            return "Error";
        //It is the number to calculate factorial
        for (i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
                factorial = factorial * j;
        }
        //If factorial is out of the range return Out Of Range.
       if(factorial==0)
       {
           return "Out of range";
       }
       else
       {
           return "success";
       }
    }
}
