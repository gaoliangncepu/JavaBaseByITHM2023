/*
 * @Description:掌握Instant的使用
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/29
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test5_gl {
    public static void main(String[] args) {
        //1.创建Instant对象，获取此刻时间信息
        Instant now = Instant.now();
        System.out.println("now = " + now);// 不可变对象

        //2.获取总秒数（从1970-01-01T00：00：000Z的Java纪元开始的累计秒数）
        long epochSecond = now.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);

        //3.不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println("nano = " + nano);
        System.out.println("nano/1000000 = " + nano / 1000000);

        Instant plusNanos = now.plusNanos(222);
        System.out.println("plusNanos = " + plusNanos);

        //Instant对象的作用：做代码的性能分析，或者记录用户的操作时间戳
        //Instant的操作特点与LocalDateTime相似
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("now1 = " + now1);
    }
}
