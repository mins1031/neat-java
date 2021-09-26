package com.company.Collections;

import com.company.team.Department;

public class MemoryTest {

    public static int sum(int a, int b, String c, Department department){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(department);


        return a+b;
    }

    public static void main(String[] args){

        int a = 3;
        int b = 4;
        String c = "minmin";
        String c1 = new String("min");
        Department department = new Department(c);

        sum(a,b,c1,department);
    }
}
