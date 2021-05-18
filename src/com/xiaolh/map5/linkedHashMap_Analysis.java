package com.xiaolh.map5;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by  xiaolh
 * CreateTime 2020-08-04  11:07
 *
 */
public class linkedHashMap_Analysis {
    /**
     * 1.分别给HashMap 和LinkedHashMap 录入100w条数据，循环遍历，观察耗时
     * 2.不带参数的构造方法
     */

    public static void main(String[] args) {
        int count = 5000000;
        System.currentTimeMillis();
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        //计时器
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            hashMap.put(String.valueOf(i),"value");
        }
        Long endTime = System.currentTimeMillis();
        Long time = endTime- startTime;
        System.out.println("hashMap ---------> time="+time);

        //计时器
        Long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedHashMap.put(String.valueOf(i),"value");
        }
        Long endTime1 = System.currentTimeMillis();
        Long time1 = endTime1-startTime1;
        System.out.println("linkedHashMap  --> time="+time1);

        //计时器 取
        Long startTime3 = System.currentTimeMillis();
        for (String value : hashMap.values()) {

        }
        Long endTime3 = System.currentTimeMillis();
        Long time2 =  endTime3-startTime3;
        System.out.println("hashMap ---------> time="+time2);


        //计时器 取
        Long startTime4 = System.currentTimeMillis();
        for (String value : linkedHashMap.values()) {

        }
        Long endTime4 = System.currentTimeMillis();
        Long time3 =  endTime4-startTime4;
        System.out.println("linkedHashMap  --> time="+time3);

    }
}
