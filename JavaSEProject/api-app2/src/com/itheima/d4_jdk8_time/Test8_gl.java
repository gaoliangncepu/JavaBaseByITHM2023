/*
 * @Description:Duration作用：比较两个日期时间的差值
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/29
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test8_gl {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2000, 1, 1, 22, 11, 55);
        LocalDateTime dateTime2 = LocalDateTime.now();

        // 1、得到Duration对象
//        Duration between = Duration.between(dateTime1, dateTime2);
        Duration between = Duration.between(dateTime2, dateTime1);

        System.out.println("between.toDays() = " + between.toDays());//总间隔时长，以“天”为单位
        System.out.println("between.toHours() = " + between.toHours());//总间隔时长，以“小时”为单位
        System.out.println("between.toNanos() = " + between.toNanos());//总间隔时长，以“纳秒”为单位
        System.out.println("between.toMillis() = " + between.toMillis());//总间隔时长，以“毫秒”为单位
        System.out.println("between.toMinutes() = " + between.toMinutes());//总间隔时长，以“分钟”为单位
        System.out.println("between.getSeconds() = " + between.getSeconds());//总间隔时长，以“秒”为单位

        System.out.println("between.getNano() = " + between.getNano());//只获得纳秒的差值（绝对值）

    }
}
