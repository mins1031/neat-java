package com.company.stream;

import com.company.employee.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamStudy {

    public static void main(String[] args){
        String[] strArr = {"c", "a", "b","e","d","g","f"};
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        List<String> strList = Arrays.asList(strArr);
        System.out.println(strList);

        Arrays.stream(strArr).sorted().forEach(System.out::println);
        strList.stream().sorted().forEach(System.out::println);

        Arrays.stream(strArr)
                .distinct()
                .limit(5)
                .sorted()
                .forEach(System.out::print);
        //배열을 중복제거하고 5개로 갯수 제한하고 정렬해 forEach로 출력해준다.

        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList2 = Arrays.asList("Hwang", "Hong", "Kang");

        intList.stream().filter(x -> x<=2).forEach(System.out::print);
        Arrays.asList(1,2,3,2,5).stream().distinct().forEach(System.out::print);
        System.out.println("");
        intList.stream().map(x -> x*x).forEach(System.out::println); // 1,4,9

        Arrays.asList(intList,Arrays.asList(2,5)).stream()
                .flatMap(i -> i.stream())
                .forEach(System.out::println); // 1,2,3,2,5

        strList2.stream()
                .flatMap(message -> Arrays.stream(message.split("an")))
                .forEach(System.out::println);  // Hw, g, Hong, K, g

        intList.stream().skip(2).forEach(System.out::println); // 3

        Arrays.asList(1,4,3,2).stream().sorted().forEach(System.out::println); // 1,2,3,4
        Arrays.asList(1,4,3,2).stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println); // 4,3,2,1
        Arrays.asList(1,4,3,2).stream().sorted((a,b) -> -a.compareTo(b)).forEach(System.out::println); // 4,3,2,1


        int sum = intList.stream().filter(x -> x<=2)
                .peek(System.out::println)
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum);

        strList2.stream().filter(s -> s.startsWith("H")).findFirst().ifPresent(System.out::println);  //Hwang
        strList2.parallelStream().filter(s -> s.startsWith("H")).findAny().ifPresent(System.out::println);  //Hwang or Hong

        boolean result1 = strList2.stream().anyMatch(s -> s.startsWith("H"));  //true
        boolean result2 = strList2.stream().allMatch(s -> s.startsWith("H"));  //false
        boolean result3 = strList2.stream().noneMatch(s -> s.startsWith("T")); //true
        boolean result4 = strList2.stream().allMatch(s -> s.endsWith("g")); //ture
        System.out.printf("%b, %b, %b, %b",result1,result2, result3,result4);

        intList.stream().mapToInt(Integer::intValue).sum();	// 6
        intList.stream().reduce((a,b) -> a+b).ifPresent(System.out::println); // 6

        intList.stream().mapToInt(Integer::intValue).average();	// 2
        intList.stream().reduce((a,b) -> a+b).map(n -> n/intList.size()).ifPresent(System.out::println); // 2
    }
}
