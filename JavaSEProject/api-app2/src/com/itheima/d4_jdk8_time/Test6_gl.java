/*
 * @Description:DateTimeFormatter时间日期格式化器
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/29
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test6_gl {
    public static void main(String[] args) {
        //1.创建DateTimeFormatter对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss.SSS");

        //2.对日期时间进行格式化
        //方案一
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        String formatNow = formatter.format(now);
        System.out.println("formatNow = " + formatNow);

        //方案二
        String formatNow2 = now.format(formatter);
        System.out.println("formatNow2 = " + formatNow2);

        //解析时间字符串
        //使用LocalDateTime提供的解析方法
        String str = "2023-11-20 23-15-22.223";
//        LocalDateTime parse1 = LocalDateTime.parse(str);
//        System.out.println("parse1 = " + parse1);
        LocalDateTime parse2 = LocalDateTime.parse(str, formatter);
        System.out.println("parse2 = " + parse2);
    }
}
