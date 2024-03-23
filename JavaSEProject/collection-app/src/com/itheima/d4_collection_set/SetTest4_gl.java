/*
 * @Description:TreeSet集合基本使用
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_collection_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/11
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class SetTest4_gl {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(9);
        set1.add(4);
        set1.add(2);
        set1.add(1);
        System.out.println(set1);

        /*Set<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();//年龄升序
            }
        });*/
        // TreeSet 优先就近选择自己自带的比较器对象进行排序
//        Set<Student> studentSet = new TreeSet<>((o1,o2) -> o1.getAge() - o2.getAge());
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("蜘蛛精",23, 169.7));
        studentSet.add(new Student("紫霞",22, 169.8));
        studentSet.add(new Student("至尊宝",26, 170.5));
        studentSet.add(new Student("牛魔王",22, 183.5));
        System.out.println(studentSet);
    }
}
