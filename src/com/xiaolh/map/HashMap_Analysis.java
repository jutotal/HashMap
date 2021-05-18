package com.xiaolh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by  xiaolh
 * CreateTime 2020-08-01  16:26
 *  性能分析
 *  分别测试10w、100w、500w
 */
public class HashMap_Analysis {
    public static void main(String[] args) {
        Map maps = inputMap();
        show1(maps);
        show2(maps);
        show3(maps);
        show4(maps);
    }

    public static Map<String, Integer> inputMap(){
        HashMap<String, Integer> map = new HashMap<>();
        String str[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k",};
        String key;
        Integer value;
        for (int i = 0; i < 5000000; i++) {
            int count = (int)(Math.random()*10);
            key= String.valueOf(str[count]+i*100);
            value=i;
            map.put(key,value);
        }
        return map;
    }

    public static void show1(Map<String,Integer> map){
        Long startTime = System.currentTimeMillis();
        Integer value;
        for (String key1 :  map.keySet()) {
//            System.out.println(key1+"="+map.get(key1));
            value = map.get(key1);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("map.keySet 用时"+(endTime-startTime));
    }

    public static void show2(Map<String,Integer> map){
        Long startTime = System.currentTimeMillis();
        Integer value;
        for (Integer v :  map.values()) {
//            System.out.println(v);
            value=v;
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("map.values 用时"+(endTime-startTime));
    }

    public static void show3(Map<String,Integer> map){
        Long startTime = System.currentTimeMillis();
        Integer value;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+"="+entry.getValue());
            value = entry.getValue();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Map.EntrySet 用时"+(endTime-startTime));
    }

    public static void show4(Map<String,Integer> map){
        Long startTime = System.currentTimeMillis();
        Integer value;
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
//            System.out.println(entry.getKey()+"="+entry.getValue());
            value = entry.getValue();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Iterator 用时"+(endTime-startTime));
    }

}
