package com.xiaolh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by  xiaolh 遍历
 * CreateTime 2020-08-01  15:00
 * 4种遍历方法
 */
public class HashMapTraverseDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String str[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k",};
//        map.put("zhang1",new Integer(1));
//        map.put("zhang2",new Integer(3));
//        map.put("zhang3",new Integer(4));
//        map.put("zhang4",new Integer(7));
//        map.put("zhang5",new Integer(2));
        String key;
        Integer value;
        for (int i = 0; i < 900000; i++) {
            int count = (int)(Math.random()*10);
            key= String.valueOf(str[count]+i*100);
            value=i;
            map.put(key,value);
        }

//      1. 利用map.keySet 遍历 获取键值 key value
//        Long startTime = System.currentTimeMillis();
//        for (String key1 :  map.keySet()) {
//            System.out.println(key1+"="+map.get(key1));
//        }
//        Long endTime = System.currentTimeMillis();
//        System.out.println("map.keySet 用时"+(endTime-startTime));


//      2.利用map.values 遍历 获取值value
//        Long startTime = System.currentTimeMillis();
//        for (Integer v :  map.values()) {
//            System.out.println(v);
//        }
//        Long endTime = System.currentTimeMillis();
//        System.out.println("map.values 用时"+(endTime-startTime));



//        3.使用Map.EntrySet()遍历 获取键值 key value   效率比keySet效率高一些
//        Long startTime = System.currentTimeMillis();
//        for (Map.Entry<String,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }
//        Long endTime = System.currentTimeMillis();
//        System.out.println("Map.EntrySet 用时"+(endTime-startTime));


//        4.利用 Iterator 迭代器
        Long startTime = System.currentTimeMillis();
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Iterator 用时"+(endTime-startTime));
    }
}
