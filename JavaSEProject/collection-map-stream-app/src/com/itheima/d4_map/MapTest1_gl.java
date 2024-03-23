/*
 * @Description:Map的特点（双列集合，entry=(key,value)）
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/14
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MapTest1_gl {
    public static void main(String[] args) {
        // HashMap：以key为准，无序、不重复、无索引
        // LinkedMap：以key为准，有序、不重复、无索引
        // HashMap：以key为准，排序、不重复、无索引
//        Map<String,Integer> map = new HashMap<>();//经典代码
//        Map<String,Integer> map = new LinkedHashMap<>();//经典代码
        Map<String,Integer> map = new TreeMap<>();//经典代码

        map.put("手表", 100);
        map.put("手表", 220); // 后面重复的数据会覆盖前面的数据（键）
        map.put("手机", 2);
        map.put("Java", 2);
//        map.put(null, null);//TreeMap不允许key=null
        System.out.println(map);
    }
}
