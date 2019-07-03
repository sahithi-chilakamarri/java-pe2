package com.stackroute.pe2;
    //This is used to check even number.
public class EvenChecker {
    public boolean isEven(int number){
        boolean b;
        //If the remainder is zero then it is even.
        if(number%2==0)
            b=true;
        else
            b=false;
    return b;
    }
}
