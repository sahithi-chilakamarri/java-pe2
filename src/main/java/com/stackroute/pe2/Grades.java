package com.stackroute.pe2;

public class Grades {
    public static String avg(int[] array,int size){
        int i=0,sum=0;
        String string="";
        for(i=0;i<size;i++){
            sum=sum+array[i];
        }
        int avg=sum/size;
        string="Average is"+avg;
        return string;
    }
    public static String minimum(int[] array,int size)
    {
        int min=0;
        String string="";
        for(int i=0;i<size;i++) {
             min = array[0];
            if (min > array[i])
                min = array[i];
        }
        string="Minimum is"+min;
        return string;
    }
public static String maximum(int[] array,int size){
    int max=0;
    String string="";
    for(int i=0;i<size;i++) {
        max = array[0];
        if (max < array[i])
            max = array[i];
    }
    string="Maximum is"+max;
    return string;
}
}

