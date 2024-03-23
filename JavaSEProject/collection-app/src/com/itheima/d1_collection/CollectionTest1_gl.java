/*
 * @Description:认识Collection体系的特点
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/02
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionTest1_gl {
    //Collection 是一个接口，表示集合，是单列集合的祖宗类
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();//有序、可重复、有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);

        Collection<String> set = new HashSet<>();//无序、不可重复、无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);
    }
}
