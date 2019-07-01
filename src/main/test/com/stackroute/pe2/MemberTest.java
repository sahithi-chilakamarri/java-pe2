package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    public static Member member;
    public static Member.MemberVariable memberVariable;
    @Before
    public void setUp(){
        System.out.println("Before");
        member=new Member();
        memberVariable=member.new MemberVariable();
    }
    @After
    public void tearDown() {
        System.out.println("After");
        member = null;
        memberVariable=null;
    }
@Test
public void givenDataShouldReturnMemberValues(){
    Member m=memberVariable.display(26,80000,"Kamal");
    assertEquals(m.age,26);
    assertEquals(m.salary,80000,00);
    assertEquals(m.name,"Kamal");
    }
}
