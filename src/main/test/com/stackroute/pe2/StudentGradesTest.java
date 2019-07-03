package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
public StudentGrades studentGrades;
@Before
    public void setUp()
{
    studentGrades =new StudentGrades();
}
@After
    public void tearDown(){
    studentGrades =null;
}
@Test
    public void givenArrayOfGradesShouldReturnAverage(){
    //arrange
    //act
    int[] array={89,90,78,70};
    String total= studentGrades.average(array,4);
    //assert
    assertEquals("Average is81",total);
}
@Test
    public void givenArrayOfGradesShouldReturnMinimumOfAllGrades(){
    //arrange
    //act
        int[] array={89,90,78,70};
        String minimum= studentGrades.minimum(array,4);
        //assert
        assertEquals("Minimum is70",minimum);
    }
    @Test
    public void givenArrayOfGradesShouldReturnMaximumOfAllGrades(){
    //arrange
        //act
        int[] array={35,56,78};
        String maximum= studentGrades.maximum(array,3);
        //assert
        assertEquals("Maximum is78",maximum);
    }
}