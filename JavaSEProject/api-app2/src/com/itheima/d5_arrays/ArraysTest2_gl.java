/*
 * @Description:Arrays工具类操作对象数组
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d5_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/17
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ArraysTest2_gl {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);//直接排会抛异常，但Student实现Comparable接口并重写compareaTo()方法后即可直接排
        System.out.println(Arrays.toString(students));

        // public static <T> void sort(T[] arr, Comparator<? super T> c) 指定比较器
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());//身高升序
                return Double.compare(o2.getHeight(), o1.getHeight());//身高降序
            }
        });*/
        Arrays.sort(students, (o1, o2) -> {
//                return Double.compare(o1.getHeight(), o2.getHeight());//身高升序
            return Double.compare(o2.getHeight(), o1.getHeight());//身高降序
        });
        System.out.println(Arrays.toString(students));
    }
}
