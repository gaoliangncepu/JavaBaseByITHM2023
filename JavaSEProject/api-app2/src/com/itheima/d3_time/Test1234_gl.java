/*
 * @Description:Date、Calendar、SimpleDateFormater
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/30
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test1234_gl {
    public static void main(String[] args) throws ParseException {
        //1.Date
        Date date = new Date();
        System.out.println("date = " + date);//当前系统日期：Tue Jan 30 21:07:16 CST 2024

        long milliTime = date.getTime();
        System.out.println("milliTime = " + milliTime);//从Java纪元开始的累计毫秒数（1970-1-1 00:00:00.000）

        milliTime += 3 * 1000;
        Date date1 = new Date(milliTime);//3秒后的日期时间对象
        System.out.println("date1 = " + date1);

        date.setTime(milliTime);//修改日期时间对象，原始日期时间对象就丢失了
        System.out.println("newdate = " + date);

        //2.Calendar
        Calendar calendar = Calendar.getInstance();//当前系统日历对象（包含日期时间信息）
        System.out.println("calendar1 = " + calendar);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("year = " + year);//2024
        System.out.println("month = " + month);//0（从0开始）
        System.out.println("dayOfYear = " + dayOfYear);//30（对应日历号）
        System.out.println("dayOfMonth = " + dayOfMonth);//30
        System.out.println("dayOfWeek = " + dayOfWeek);//3
        System.out.println("hour = " + hour);//hh（12时制）
        System.out.println("minute = " + minute);//MM
        System.out.println("second = " + second);//ss
        System.out.println("millisecond = " + millisecond);//SSS

        Date calendarTime = calendar.getTime();//获得日历中的日期对象
        System.out.println("calendarTime = " + calendarTime);

        TimeZone timeZone = calendar.getTimeZone();//获取时区对象
        System.out.println("timeZone = " + timeZone);
        System.out.println("timeZone.getID() = " + timeZone.getID());
        System.out.println("timeZone.getDisplayName() = " + timeZone.getDisplayName());

        long timeInMillis = calendar.getTimeInMillis();//获取累计毫秒值
        System.out.println("timeInMillis = " + timeInMillis);

        //直接修改日期时间
        Calendar calendar1 = Calendar.getInstance();//当前系统日历对象（包含日期时间信息）
        calendar1.set(Calendar.YEAR, 2028);//2028年
        calendar1.set(Calendar.MONTH, 11);//12月
        System.out.println("1calendar.getTime() = " + calendar1.getTime());

        calendar1.set(2030, 11, 11, 11, 11, 11);
        System.out.println("2calendar.getTime() = " + calendar1.getTime());

        //增减日期时间
        calendar1.add(Calendar.YEAR, 1);
        calendar1.add(Calendar.MONTH, -3);
        calendar1.add(Calendar.MINUTE, 15);
        System.out.println("3calendar.getTime() = " + calendar1.getTime());

        //3.SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-dd.ss.SSS");
        System.out.println("date = " + date);
        String formatedDate = simpleDateFormat.format(date);
        System.out.println("formatedDate = " + formatedDate);
        String formatedMillis = simpleDateFormat.format(timeInMillis);
        System.out.println("formatedMillis = " + formatedMillis);

        String dateStr = "2022-12-12 12:12:11";
        // 指定的时间格式必须与被解析的时间格式一模一样，否则程序会出bug.
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(dateStr);// SimpleDateFormat解析字符串时间 成为日期对象
        System.out.println("d2 = " + d2);

        //4.日期时间的比较
        String formatDate1 = simpleDateFormat.format(date1);
        System.out.println("formatedDate = " + formatedDate);
        System.out.println("formatedMillis = " + formatedMillis);
        System.out.println("formatDate1 = " + formatDate1);
        System.out.println("d2 = " + dateStr);
        System.out.println("date1.equals(date) = " + date1.equals(date));
        System.out.println("d2.before(date) = " + d2.before(date));
        System.out.println("millis.after(date) = " + calendarTime.after(date));
        //也可以换算成绝对毫秒值去比较大小

        System.out.println("calendar1.after(calendar) = " + calendar1.after(calendar));
        System.out.println("calendar1.before(calendar) = " + calendar1.before(calendar));
        System.out.println("calendar1.equals(calendar) = " + calendar1.equals(calendar));
    }
}
