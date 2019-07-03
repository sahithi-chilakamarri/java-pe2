package com.stackroute.pe2;
//This is used to calculate average,minimum and maximum of the student grades
public class StudentGrades {
    String string="";
    //It is used to find the average of the grades.
    public String average(int[] array, int size){
        int number=0,sum=0;
        for(number=0;number<size;number++){
            sum=sum+array[number];
        }
        int average=sum/size;

        string="Average is"+average;
        return string;
    }
    //It is used to find minimum of all the grades
    public String minimum(int[] array,int size)
    {
        int minimum=0;
        for(int i=0;i<size;i++) {
             minimum = array[0];
            if (minimum > array[i])
                minimum = array[i];
        }
        string="Minimum is"+minimum;
        return string;
    }
    //It is used find maximum of all the grades
public String maximum(int[] array,int size){
    int maximum=0;
    for(int i=0;i<size;i++) {
        maximum = array[0];
        if (maximum < array[i])
            maximum = array[i];
    }
    string="Maximum is"+maximum;
    return string;
}
}

