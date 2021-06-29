package com.company.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy1 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("baby","아기");
        dic.put("love","사랑");
        dic.put("apple","사과");
        System.out.println(dic);

        System.out.println(dic.get("baby"));
        System.out.println(dic.get("love"));
        System.out.println(dic.get("apple"));

        //모든 엔트리 꺼내기 1
        Set<String> ketSet = dic.keySet();
        for (String key : ketSet){
            String value = dic.get(key);
            System.out.println("key:"+key+ ", value:"+value);
        }
        System.out.println("=====================================");

        //모든 엔트리 꺼내기 2
        Set<Map.Entry<String,String>> entrySet = dic.entrySet();
        for (Map.Entry<String ,String> map : entrySet){
            System.out.println("key:"+map.getKey()+ ", value:"+map.getValue());
        }

    }
}
