/*
 * @Description:数学运算工具类 Math
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_math;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/31
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MathTest_gl {
    public static void main(String[] args) {
        //1.public static int abs(int/long/float/double a) 取绝对值
        System.out.println("Math.abs(-7) = " + Math.abs(-7));//7
        System.out.println("Math.abs(-22.23f) = " + Math.abs(-22.23f));//22.23
        System.out.println("Math.abs(-22.23) = " + Math.abs(-22.23));//22.23

        //2.public static double ceil(double d) 向上取整
        System.out.println("Math.ceil(-22.23) = " + Math.ceil(-22.23));//-22.0
        System.out.println("Math.ceil(22.23) = " + Math.ceil(22.23));//23.0

        //.public static double floor(double d) 向下取整
        System.out.println("Math.floor(-22.23) = " + Math.floor(-22.23));//-23.0
        System.out.println("Math.floor(22.23) = " + Math.floor(22.23));//22.0

        //.public static long round(double d) 四舍五入
        System.out.println("Math.round(3.4999) = " + Math.round(3.4999));//3
        System.out.println("Math.round(3.50001) = " + Math.round(3.50001));//4
        System.out.println("Math.round(-3.4999) = " + Math.round(-3.4999));//-3
        System.out.println("Math.round(-3.50001) = " + Math.round(-3.50001));//-4

        // 四舍五入，保留两位有效数字
        double d = 3.1415926;
        double v = Math.round(d * 100) / 100.0;
        System.out.println("3.1415926 四舍五入，保留两位有效数字 = " + v);//3.14

        //.public static int/long/float/double max(int/long/float/double a, int/long/float/double b) 取较大值
        //.public static int/long/float/double min(int/long/float/double a, int/long/float/double b) 取较小值
        System.out.println("Math.max(10, 100) = " + Math.max(10, 100));//100
        System.out.println("Math.min(10.01, 10.11) = " + Math.min(10.01, 10.11));//10.01

        //.public static double pow(double a, double x) 幂运算
        System.out.println("Math.pow(10, 5) = " + Math.pow(10, 5));//100000.0
        System.out.println("Math.pow(5, 10) = " + Math.pow(5, 10));//9765625.0

        //.public static souble random() 随机数[0.0, 1.0) 包前不包后
        System.out.println("Math.random() = " + Math.random());
    }
}
