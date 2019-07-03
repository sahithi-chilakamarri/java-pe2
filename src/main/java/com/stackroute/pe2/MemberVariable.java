package com.stackroute.pe2;
//This is used to initialize the members of member class using member class object.
public class MemberVariable {
    Member member = new Member();
//Initialize the member class variables
    public Member display(int age, float salary, String name) {
        member.name = name;
        member.age = age;
        member.salary = salary;
        return member;
    }
}

