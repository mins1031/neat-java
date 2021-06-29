package com.company;

import com.company.employee.Member;
import com.company.team.Department;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String memberName1 = "min";
        String min = "min";
        String memberName2 = "janet";
        String copyName1 = new String("min");
        String copyName2 = new String("janet");

        String departName1 = "develop";
        String departName2 = "marketing";

        Department developDepart = new Department(departName1);
        Department marketingDepart = new Department(departName2);


        if (memberName1.equals(copyName1))
            System.out.println("equals는 객체의 내용 같으면 true");

        /*System.out.println(copyName2.equals(copyName1));
        System.out.println(memberName1.equals(min));
        System.out.println(memberName1.equals(copyName1));
        System.out.println(memberName1 == min);
        System.out.println(memberName1.equals(min));
        System.out.println(copyName2.equals(copyName1));
*/

        Department a = new Department("min");
        Department b = new Department("janet");
        Department c = new Department("min");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
/**
 * equals는 기본적으로 문자열의 경우 내부 문자열값 자체를 판별하고 ==는 객체의 경우 객체가 같은 객체인지를 판단한다
 *  String a = new String("a");
 *  String b = new String("b");
 *  String c = new String("a");
 *  System.out.println(a.equals(b)); a와 b는 내용이 다르기 때문에 false
 *  System.out.println(a == b); a와 b는 각자 다른 String 객체기 때문에 false
 *  System.out.println(a.equals(c)); a와 b는 서로 내용이 같기 때문에 true
 *  =============int(기본타입)======================
 *  int a = 10;
 *  Integer b = 10;
 *  Integer c = new Integer(10);
 *  System.out.println(a == b); 일반 변수 int인 a와 Integer로 선언한 b의
 *  System.out.println(a == c);
 *  System.out.println(c == b);
 * */

        Collection collection;
        List<String> list = new ArrayList<>();
        Stack stack = new Stack();
        Set set ;
        Queue queue ;
        Deque deque;
        Tree tree ;
        TreeSet treeSet = new TreeSet();
        TreeMap treeMap = new TreeMap();
        Vector vector = new Vector();

        List<String> list1 = new ArrayList<>();
    }
}
