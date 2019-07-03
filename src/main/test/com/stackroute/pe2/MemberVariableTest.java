package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    public  MemberVariable memberVariable;

    @Before
    public void setUp(){
        memberVariable=new MemberVariable();
    }
    @After
    public void tearDown() {
        memberVariable=null;
    }
    @Test
    public void givenDetailsOfTheEmployeeShouldReturnMemberValues(){
        Member m=memberVariable.display(26,80000,"Kamal");
        assertEquals(m.age,26);
        assertEquals(m.salary,80000,00);
        assertEquals(m.name,"Kamal");
    }
}

