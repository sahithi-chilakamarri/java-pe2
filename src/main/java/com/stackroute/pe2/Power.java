package com.stackroute.pe2;

public class Power {
    public static String power(int number){
String str="";
number=Math.abs(number);
while(number>1)
{
    number=number/4;
}
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
