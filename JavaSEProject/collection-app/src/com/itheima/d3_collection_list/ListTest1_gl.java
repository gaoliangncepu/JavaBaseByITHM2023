/*
 * @Description:掌握List系列集合的特点，以及提供的特有方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_collection_list;

import java.util.*;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/10
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ListTest1_gl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//这是一行经典代码
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list); //重写了toString()方法，可以直接打印

        // 1.public void add(int index, E element): 在某个索引位置插入元素。
        list.add(2, "紫霞仙子");
        System.out.println(list);

        // 2.public boolean addAll(int index, Collection<? entends E> c)
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周星驰","朱茵");
        System.out.println(list2.addAll(1, list));//添加成功true或失败false
        System.out.println(list2);

        // 3.public E remove(int index): 根据索引删除元素,返回被删除元素
        System.out.println(list.remove(3));//返回删除位置处的值
        System.out.println(list);

        // 4.public E get(int index): 返回集合中指定位置的元素。
        System.out.println(list.get(3));

        // 5.public E set(int index, E element): 修改索引位置处的元素,修改成功后，会返回原来的数据
        System.out.println(list.set(3, "唐三藏"));//返回修改位置处的原值
        System.out.println(list);
    }
}
