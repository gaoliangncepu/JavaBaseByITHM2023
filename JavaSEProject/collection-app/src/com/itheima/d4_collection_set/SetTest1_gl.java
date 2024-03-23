/*
 * @Description:了解SET集合的特点
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/11
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class SetTest1_gl {
    public static void main(String[] args) {
        //1.创建SET集合对象
//        Set<Integer> strSet = new HashSet<>();//一行经典代码 【无序、不可重复、无索引】
//        Set<Integer> strSet = new LinkedHashSet<>();//一行经典代码  【有序、不可重复、无索引】
        Set<Integer> strSet = new TreeSet<>();//一行经典代码  【排序、不可重复、无索引】

        strSet.add(666);
        strSet.add(555);
        strSet.add(555);
        strSet.add(888);
        strSet.add(888);
        strSet.add(777);
        strSet.add(777);
        System.out.println(strSet);
    }
}
