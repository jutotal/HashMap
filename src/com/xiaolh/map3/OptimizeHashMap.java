package com.xiaolh.map3;

import java.util.HashMap;

/**
 * Created by  肖橙橙
 * CreateTime 2020-08-04  10:19
 * 优化OptimizeHashMap
 */
public class OptimizeHashMap {
    /**
     * 1.创建10个Map,每个Map有10w条记录
     * 2.传递不同的构造方法和参数，比较速度
     * 3.实验参数，构造方法传参(16,0.75f),( 16384,0.75)
     */

    public static void main(String[] args) {
        Long sum=0L;
        //创建10个map
        for (int i = 0; i < 10; i++) {
            //每一个map录入10w条记录
//            sum+=new OptimizeHashMap().showMap1(16384,0.75f);//13141710
            sum+=new OptimizeHashMap().showMap1(16,0.75f);//11660400
        }
        //计算10个
        System.out.println("平均time="+sum/10);

    }

    public Long showMap1(int initialCapacity, float loadFactor){
        //创建两个变量
        String key, value;
        HashMap<String, String> map1 = new HashMap<>(initialCapacity,loadFactor);
        //计时器
        Long  startTime= System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            key = String.valueOf(i);
            value = "value";
            map1.put(key,value);
        }
        Long  endTime= System.nanoTime();
        Long time =endTime-startTime;
        System.out.println("time="+(time));
        return time;
    }
}
