package com.xiaolh.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by  肖橙橙 优化
 * CreateTime 2020-08-01  17:17
 * 案例演示
 *
     一麦  金麦  大麦   小麦  麦之朗
 语文  90  74    83   91    85
 数学  80  60    75   85    97
 英语  72  85    69   82    77

 1. 单独输出一麦的所有成绩
 思路：将这5哥小Map，存到一个大Map中，可以按照姓名标记进行定位
 2. 输出所有人的所有成绩
 思路：将这5个Map，存到List集合中，如需要定位某个学生，需要用下标完成

 对于 List 来说，语文、数学、英语 代表 key ；各科成绩代表 value
 对于小Map来说， key 代表三门课程 ；          value：90 80 72  ......
 对于大Map来说，key:一麦、金麦、大麦、小麦、麦之朗；value ：map1对象 .
 */

public class HashMapDemo {
    public static void main(String[] args) {
        //大map
        HashMap<String, Map> map = new HashMap<>();

        //5个小map
        //第一个学生
        HashMap<String, String> stuMap1 = new HashMap<>();
        stuMap1.put("CHINESE","90");
        stuMap1.put("MATH","80");
        stuMap1.put("ENGLISH","72");
        //第二个学生
        HashMap<String, String> stuMap2 = new HashMap<>();
        stuMap2.put("CHINESE","74");
        stuMap2.put("MATH","60");
        stuMap2.put("ENGLISH","85");
        //第三个学生
        HashMap<String, String> stuMap3 = new HashMap<>();
        stuMap3.put("CHINESE","83");
        stuMap3.put("MATH","75");
        stuMap3.put("ENGLISH","69");
        //第四个学生
        HashMap<String, String> stuMap4 = new HashMap<>();
        stuMap4.put("CHINESE","91");
        stuMap4.put("MATH","86");
        stuMap4.put("ENGLISH","82");
        //第五个学生
        HashMap<String, String> stuMap5 = new HashMap<>();
        stuMap5.put("CHINESE","85");
        stuMap5.put("MATH","97");
        stuMap5.put("ENGLISH","77");

        //大map
        map.put("yimai",stuMap1);
        map.put("jinmai",stuMap2);
        map.put("damai",stuMap3);
        map.put("xiaomai",stuMap4);
        map.put("maizhilang",stuMap5);

        System.out.println("所有人的所有各科成绩："+map);
        //根据键，获取值
        System.out.println("一麦的各科成绩："+map.get("yimai"));
        System.out.println("金麦的各科成绩："+map.get("jinmai"));
    }
}
