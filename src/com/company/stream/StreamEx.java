package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args){
        String[] stringArray = {"min","jung","jae","yoon","jong"};
        List<String> stream = Arrays.stream(stringArray).filter(s -> s == "min" || s == "jong")
                .collect(Collectors.toList());
        //stringArray내용중 필터링한 것을 List로 바꿔주는 로직
        //결국 stream.중개연산(필터링,mapping등).최종연산(컬렉션 변환)
        System.out.println(stream.getClass());
        System.out.println(stream);
        List<String> intStream = Arrays.stream(stringArray).map(s -> s)
                .collect(Collectors.toList());
        System.out.println(intStream);
        System.out.println(intStream.getClass());

    }
}
