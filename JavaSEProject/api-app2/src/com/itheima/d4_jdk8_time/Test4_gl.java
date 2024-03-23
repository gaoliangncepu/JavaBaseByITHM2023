/*
 * @Description:时区和时区时间
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/25
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test4_gl {
    public static void main(String[] args) {
        //1.ZoneId：时区
        //public static ZoneId systemDefault()：获取系统默认的时区
        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println(systemDefault);
        System.out.println(systemDefault.getId());

        //public static Set<String> getAvailableZoneIds()：获取Java支持的全部时区Id
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        //public static ZoneId of(String ZoneId)：把某个时区id封装成ZoneId对象
        ZoneId zoneId1 = ZoneId.of("Pacific/Rarotonga");
        System.out.println("zoneId1 = " + zoneId1);

        //2.ZonedDateTIme：带时区的日期时间
        // public static ZonedDateTime now() ：获取系统默认时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();//系统默认日期时间时区
        System.out.println("now = " + now);
        ZonedDateTime now2 = ZonedDateTime.now(Clock.systemDefaultZone());//系统默认日期时间时区
        System.out.println("now2 = " + now2);

        // public static ZonedDateTime now(ZoneId zoneId)：获取某个时区的ZoneDateTime对象
        ZonedDateTime now1 = ZonedDateTime.now(zoneId1);//指定时区的日期时间时区
        System.out.println("now1 = " + now1);

        ZonedDateTime now3 = ZonedDateTime.now(Clock.systemUTC());//世界标准时间
        System.out.println("now3 = " + now3);

        //JDK8之前获取时区
//        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
//        System.out.println("instance = " + instance);
//        System.out.println("instance.getTimeZone() = " + instance.getTimeZone().getID());
    }
}
