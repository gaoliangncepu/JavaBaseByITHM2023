/*
 * @Description:Collections工具类
 * @Update:
 * @UpdateRemark:工具类：构造器私有化、静态方法、使用泛型
 */
package com.itheima.d2_collections;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/13
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionsTest1_gl {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c, T ...elements)：为集合批量添加元素
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "王五", "李四", "张麻子");
        System.out.println(names);

        //2.public static void shuffle(List<?> list)：随机打乱list中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T> list)：对List中的元素进行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(6);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",23, 169.9));
        students.add(new Student("紫霞",22, 169.8));
        students.add(new Student("紫霞",22, 169.8));
        students.add(new Student("至尊宝",26, 165.5));
        Collections.sort(students);//Student实现Comparable接口并实现compareTo()方法
        System.out.println(students);

        //4.public static <T> void sort(List<T> list, Comparator<? super T> c)：按照指定的比较器规则对list中的元素进行排序
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getHeight(), s1.getHeight()));//就近原则，优先调用集合自带的比较器
        System.out.println(students);
    }
}
