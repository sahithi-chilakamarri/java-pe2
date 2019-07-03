package com.stackroute.pe2;
//This is method is used to check the input number is power of four
public class PowerOfFour {
    public String power(int number){
String str="";
//Checking whether the given number is power of four or not
while(number>1)
{
    number=number/4;
}
//If it is power of four return message
if(number==1)
{
    str="It is power of 4";

}
else{
    str="It is not power of 4";
}

return str;

    }
}
