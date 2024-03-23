/*
 * @Description:集合的并发修改异常，并解决
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d5_collection_exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/12
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionTest1_gl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "王麻子","小李子","李爱花","张全蛋","晓李","李玉刚");
        System.out.println(list);

        // 需求：找出集合中全部带“李”的名字，并从集合中删除。
        // 1.并发修改异常
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();//抛异常：ConcurrentModificationException
            if (next.contains("李")) list.remove(next);
        }
        System.out.println(list);*/

        /*for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("李")) list.remove(str);
        }
        System.out.println(list);*/

        /*for (String str : list) { //抛异常：ConcurrentModificationException
            if (str.contains("李")) list.remove(str);
        }
        System.out.println(list);*/

        /*list.forEach(str -> { //抛异常：ConcurrentModificationException
            if (str.contains("李")) list.remove(str);
        });
        System.out.println(list);*/

        System.out.println("------------------解决-----------------");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("李")) {
                list.remove(str);
            }
        }
        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {//倒着遍历
            String str = list.get(i);
            if (str.contains("李")) list.remove(str);
        }
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("李")) iterator.remove();// 删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
        }
        System.out.println(list);

        // 增强for循环、forEach遍历方式下，集合并发修改异常问题无法解决
    }
}
