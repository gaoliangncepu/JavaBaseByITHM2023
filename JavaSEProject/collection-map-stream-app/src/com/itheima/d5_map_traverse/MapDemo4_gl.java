/*
 * @Description:Map遍历实例：统计投票人数
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d5_map_traverse;

import java.util.*;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/14
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MapDemo4_gl {
    public static void main(String[] args) {
        //1.把80个学生选择的景点数据拿到程序中
        List<Character> datas = new ArrayList<>();
        char[] selects = {'A', 'B', 'C', 'D'};
        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            int index = rd.nextInt(4);
            datas.add(selects[index]);
        }
        System.out.println(datas);
        System.out.println(datas.size());

        //2.开始统计每个景点的投票人数
        //准备一个Map集合，用于存放统计最终结果
        Map<Character, Integer> result = new HashMap<>();
        //遍历80个景点数据，直接在Map中计数
        for (Character data : datas) {
            // 说明这个景点之前统计过。其值+1. 存入到Map集合中去
            if (result.containsKey(data)) {
                result.put(data, result.get(data) + 1);
            } else {
                // 说明这个景点是第一次统计，存入"景点=1"
                result.put(data, 1);
            }
        }

        System.out.println(result);
    }
}
