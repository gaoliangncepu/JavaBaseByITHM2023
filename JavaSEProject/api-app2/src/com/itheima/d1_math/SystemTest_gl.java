/*
 * @Description:System类
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_math;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/31
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class SystemTest_gl {
    public static void main(String[] args) throws FileNotFoundException {
        //1.public static void exit(int status) 终止当前运行的JVM，形参用作状态代码; 按照惯例，非0表示异常终止。【底层调用的runtime.exit()】
//        System.exit(0); //人为终止虚拟机，不要使用

        //2.public static long currentTimeMillis() 当前系统日期时间累计毫秒值（从Java纪元开始的）
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 改变输出位置
        System.setOut(new PrintStream("F:\\temp\\out.txt"));
        for (int i = 0; i < 1000; i++) {
            System.out.println("输出了：" + i);
        }

        // 计算时间差值（评估性能）
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println((currentTimeMillis1 - currentTimeMillis) / 1000.0 + "s");
    }
}
