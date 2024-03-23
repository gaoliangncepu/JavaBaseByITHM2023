/*
 * @Description:Period的作用：比较两个日期的差值，计算年数差、月数差、天数差
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/29
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test7_gl {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2000, 1, 1, 22, 11, 55);
        LocalDateTime dateTime2 = LocalDateTime.now();

        //后边的日期减前面的日期
//        Period between = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());
        Period between = Period.between(dateTime2.toLocalDate(), dateTime1.toLocalDate());

        System.out.println("between.getYears() = " + between.getYears());//仅年份值的差
        System.out.println("between.getMonths() = " + between.getMonths());//仅月份值的差
        System.out.println("between.getDays() = " + between.getDays());//仅日号的差
        System.out.println("between.getUnits() = " + between.getUnits());

        System.out.println("between.toTotalMonths() = " + between.toTotalMonths());
    }
}
