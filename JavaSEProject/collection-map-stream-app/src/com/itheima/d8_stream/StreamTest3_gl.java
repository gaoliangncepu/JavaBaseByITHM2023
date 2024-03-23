/*
 * @Description:Stream流常用中间方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d8_stream;

import com.itheima.d8_stream.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/07
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class StreamTest3_gl {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        System.out.println("-----1------");
        System.out.println(scores.stream().filter(s -> s >= 60).sorted().collect(Collectors.toList()));

        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        System.out.println("-----2------");
        students.stream().filter(stu -> stu.getAge() >=23 && stu.getAge() <=30)
                .sorted((o1,o2) -> o2.getAge()-o1.getAge())
                .forEach(System.out::println);

        System.out.println("------List承接结果-------");
        System.out.println(students.stream().filter(stu -> stu.getAge() >= 23 && stu.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .collect(Collectors.toList()));

        // 需求3：取出身高最高的前3名学生，并输出。
        System.out.println("-----3------");
        students.stream().sorted(Comparator.comparingDouble(Student::getHeight)).skip(students.size()-3).forEach(System.out::println);

        // 需求4：取出身高倒数的2名学生，并输出。   s1 s2 s3 s4 s5 s6
        System.out.println("-----4------");
        students.stream().sorted((o1,o2) -> Double.compare(o1.getHeight(), o2.getHeight())).limit(2).forEach(System.out::println);

        // 需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出。
        System.out.println("-----5------");
//        students.stream().filter(stu -> 168 < stu.getHeight()).map(Student::getName).distinct().forEach(System.out::println);
        students.stream().filter(stu -> 168 < stu.getHeight()).map(stu -> stu.getName()).distinct().forEach(System.out::println);
        // distinct去重复，自定义类型的对象（希望内容一样就认为重复，重写hashCode,equals）
        students.stream().filter(stu -> 168 < stu.getHeight()).distinct().forEach(System.out::println);

        System.out.println("-----6------");
        Stream<String> stream1 = Stream.of("张三", "李四", "王五");
        Stream<String> stream2 = Stream.of("赵六", "王五");
        Stream<String> concatStream = Stream.concat(stream2, stream1);
        concatStream.forEach(System.out::println);
    }
}

