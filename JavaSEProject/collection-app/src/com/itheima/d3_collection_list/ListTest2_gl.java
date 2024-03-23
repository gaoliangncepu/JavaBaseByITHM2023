/*
 * @Description:List系列集合的遍历：Iterator迭代器、增强for循环、for循环、forEach
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/10
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ListTest2_gl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("糖宝宝");
        list.add("蜘蛛精");
        list.add("至尊宝");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);//list遍历一般先取值，后操作
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.forEach(System.out::println);

        System.out.println("-------------正对遍历的同时增删数据---------------");

    }
}
