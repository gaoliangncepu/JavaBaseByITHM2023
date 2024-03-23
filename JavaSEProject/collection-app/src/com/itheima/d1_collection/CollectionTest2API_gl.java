/*
 * @Description:掌握Collection集合的常用API
 *  add(E e)、clear()、remove(E e)、isEmpty()、size()、contains(Object obj)、toArray()
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/02
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionTest2API_gl {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        // 1.public boolean add(E e)：添加元素, 添加成功返回true。
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java3");
        System.out.println(c);

        // 2.public void clear()：清空集合的元素。
//        c.clear();
//        System.out.println(c);

        // 4.public int size()：获取集合的大小。
        System.out.println(c.size());

        // 3.public boolean isEmpty()：判断集合是否为空 是空返回true,反之。
        System.out.println(c.isEmpty());

        // 5.public boolean contains(Object obj)：判断集合中是否包含某个元素。
        System.out.println(c.contains("java1"));//true
        System.out.println(c.contains("java4"));//false

        // 6.public boolean remove(E e)：删除某个元素:如果有多个重复元素默认删除前面的第一个！
        System.out.println(c.remove("java1"));//true
        System.out.println(c.remove("java4"));//false

        // 7.public Object[] toArray()：把集合转换成数组
        Object[] objects = c.toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(strings));

        System.out.println("--------------------------------------------");
        // 把一个集合的全部数据倒入到另一个集合中去。
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); // 就是把c2集合的全部数据拷贝一份倒入到c1集合中去。
        System.out.println(c1);
        System.out.println(c2);
    }
}
