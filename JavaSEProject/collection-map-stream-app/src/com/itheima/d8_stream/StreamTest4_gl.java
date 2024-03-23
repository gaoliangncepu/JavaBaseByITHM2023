/*
 * @Description:Stream流的终结方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d8_stream;

import com.itheima.d8_stream.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/07
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class StreamTest4_gl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        // 需求1：请计算出身高超过168的学生有几人。
        long count = students.stream().filter(stu -> 168 < stu.getHeight()).count();
        System.out.println(count);

        // 需求2：请找出身高最高的学生对象，并输出。
        Student student1 = students.stream().max(Comparator.comparingDouble(Student::getHeight)).get();
        System.out.println(student1);

        // 需求3：请找出身高最矮的学生对象，并输出。
        Student student2 = students.stream().min(Comparator.comparingDouble(Student::getHeight)).get();
        System.out.println(student2);

        // 需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        List<Student> studentList = students.stream().filter(stu -> 170 < stu.getHeight()).collect(Collectors.toList());
        System.out.println(studentList);

        Set<Student> studentSet = students.stream().filter(stu -> 170 < stu.getHeight()).collect(Collectors.toSet());
        System.out.println(studentSet);// 重写equals和hashcode方法后，内容相同的两个对象被认为重复，存入SET集合时只留下一个

        // 需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回。
//        Map<String, Double> doubleMap = students.stream().filter(stu -> 170 < stu.getHeight())
//                .distinct().collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getHeight()));
        Map<String, Double> doubleMap = students.stream().filter(stu -> 170 < stu.getHeight())
                .distinct().collect(Collectors.toMap(Student::getName, Student::getHeight));
        System.out.println(doubleMap);

        // 需求6：请找出身高超过170的学生对象，并把结果存入数组返回
//        Object[] objects = students.stream().filter(stu -> 170 < stu.getHeight()).toArray();
//        Student[] studentArray = students.stream().filter(stu -> 170 < stu.getHeight()).toArray(len -> new Student[len]);
        Student[] studentArray = students.stream().filter(stu -> 170 < stu.getHeight()).toArray(Student[]::new);
        System.out.println(Arrays.asList(studentArray));
        System.out.println(Arrays.toString(studentArray));
    }
}
