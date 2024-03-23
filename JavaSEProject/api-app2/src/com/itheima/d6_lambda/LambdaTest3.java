/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d6_lambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/03/19
 * @copyright Copyright (c) 2010 Company: CODECENTER OF AVIC
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        // 目标：10种典型Lambda表达式使用场景。

        // 1.集合遍历
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.forEach(System.out::println);

        // 2.排序
        List<String> list2 = Arrays.asList("F", "B", "K", "D");
        Collections.sort(list2, String::compareToIgnoreCase);
        System.out.println("list2 = " + list2);

        // 3.过滤
        List<String> list3 = Arrays.asList("apple", "orange", "banana", "grape");
        List<String> rList = list3.stream().filter(s -> s.startsWith("b")).collect(Collectors.toList());
        System.out.println("rList = " + rList);

        // 4.映射
        List<String> collect = list3.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        // 5.归约
        double[] prices = {99.8, 128, 100};
        double sum = Arrays.stream(prices).reduce(0.0, Double::sum);
        System.out.println("sum = " + sum);

        // 6.分组
        Map<Integer, List<String>> collect1 = list3.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("collect1 = " + collect1);

        // 7.创建线程
        Thread newThread = new Thread(() -> System.out.println("New Thread"));

        // 8.Optional操作
        Optional.ofNullable("Hello World").map(String::toUpperCase).ifPresent(System.out::println);
    }
}
