package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
public Grades num;
@Before
    public void setUp(){
    System.out.println("Before");
    num=new Grades();
}
@After
    public void tearDown(){
    System.out.println("After");
    num=null;
}
@Test
    public void givenGradesShouldReturnSum(){
    int[] array={89,90,78,70};
    String total=num.avg(array,4);
    assertEquals("Average is81",total);
}
@Test
    public void givenGradesShouldReturnMinimum(){
        int[] array={89,90,78,70};
        String minimum=num.minimum(array,4);
        assertEquals("Minimum is70",minimum);
    }
    @Test
    public void givenGradesShouldReturnMaximum(){
        int[] array={35,56,78};
        String maximum=num.maximum(array,3);
        assertEquals("Maximum is78",maximum);
    }
}