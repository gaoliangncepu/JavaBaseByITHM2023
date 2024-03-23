/*
 * @Description:JDK8新增的日期时间类
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/25
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test123_gl {
    public static void main(String[] args) {
        //1.本地日期：LocalDate
        LocalDate date = LocalDate.now();//获取本地日期对象（不可变对象）yyyy-MM-dd
        System.out.println("date:" + date);
        LocalDate pointDate = LocalDate.of(2020, 10, 1);
        System.out.println("pointDate:" + pointDate);

        // 获取日期信息
        System.out.println(date.getYear());//2024
        System.out.println(date.getMonth());//JANUARY
        System.out.println(date.getMonthValue());//1
        System.out.println(date.getDayOfYear());//25
        System.out.println(date.getDayOfMonth());//25
        System.out.println(date.getDayOfWeek());//THURSDAY
        System.out.println(date.getDayOfWeek().getValue());//4

        // 修改日期信息：直接修改、增加、减少、
        LocalDate ld1 = date.withYear(2020);
        LocalDate ld2 = date.withMonth(12);
        System.out.println(ld1);//仅年份被修改
        System.out.println(ld2);//仅月份被修改
        System.out.println(date);//不变

        LocalDate ld3 = date.plusYears(2);
        LocalDate ld4 = date.plusMonths(3);
        LocalDate ld5 = date.plusWeeks(2);
        LocalDate ld6 = date.plusDays(5);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);
        System.out.println(ld6);

        LocalDate ld7 = date.minusYears(2);
        LocalDate ld8 = date.minusDays(5);
        System.out.println(ld7);
        System.out.println(ld8);

        System.out.println(date.equals(pointDate));
        System.out.println(date.isAfter(pointDate));
        System.out.println(date.isBefore(pointDate));
        System.out.println(date.isEqual(pointDate));

        System.out.println("-------------------------");

        //2.本地时间 LocalTime
        LocalTime time = LocalTime.now();//本地时间对象（不可变对象） HH:mm:ss.SSS
        System.out.println(time);
        LocalTime pointTime = LocalTime.of(23, 50, 30, 80 * 1000000);
        System.out.println(pointTime);

        //获取时间信息
        System.out.println(time.getHour());//时
        System.out.println(time.getMinute());//分
        System.out.println(time.getSecond());//秒
        System.out.println(time.getNano());//纳秒
        System.out.println(time.getNano()/1000000);//毫秒

        //修改时间信息
        LocalTime lt1 = time.withHour(12);
        LocalTime lt2 = time.withNano(30 * 1000000);
        System.out.println(lt1);
        System.out.println(lt2);

        LocalTime lt3 = time.plusMinutes(10);
        LocalTime lt4 = time.plusSeconds(10);
        System.out.println(lt3);
        System.out.println(lt4);

        LocalTime lt5 = time.minusHours(10);
        LocalTime lt6 = time.minusMinutes(10);
        System.out.println(lt5);
        System.out.println(lt6);

        System.out.println(time.equals(pointTime));
        System.out.println(time.isAfter(pointTime));
        System.out.println(time.isBefore(pointTime));

        System.out.println("-------------------------");

        //3.日期时间对象
        LocalDateTime ldt = LocalDateTime.now();//获取日期时间对象（不可变对象） yyyy-MM-ddTHH:mm:ss.SSS
        System.out.println(ldt);
        LocalDateTime pointDateTime = LocalDateTime.of(2019, 12, 29, 10, 11, 22, 333 * 1000000);
        System.out.println(pointDateTime);

        //获取日期和时间的全部信息
        int year = ldt.getYear(); // 年
        int month = ldt.getMonthValue(); // 月
        int day = ldt.getDayOfMonth(); // 日
        int dayOfYear = ldt.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue();  // 获取是周几
        int hour = ldt.getHour(); //时
        int minute = ldt.getMinute(); //分
        int second = ldt.getSecond(); //秒
        int nano = ldt.getNano(); //纳秒

        // 修改时间信息
        // withYear withMonth withDayOfMonth withDayOfYear withHour
        // withMinute withSecond withNano
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(59);

        // 加多少
        // plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMinutes(3);

        // 减多少
        // minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
        LocalDateTime ldt6 = ldt.minusYears(2);
        LocalDateTime ldt7 = ldt.minusMinutes(3);


        // 获取指定日期和时间的LocalDateTime对象：
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour,
        //                                  int minute, int second, int nanoOfSecond)
        LocalDateTime ldt8 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 1222);
        LocalDateTime ldt9 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 1222);

        // 判断2个日期、时间对象，是否相等，在前还是在后： equals、isBefore、isAfter
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt9.isAfter(ldt));
        System.out.println(ldt9.isBefore(ldt));

        // 转换成LocalDate 或 LocalTime对象
        LocalDate localDate = ldt.toLocalDate();
        LocalTime localTime = ldt.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
