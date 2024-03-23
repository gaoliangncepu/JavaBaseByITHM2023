/*
 * @Description: JVM虚拟机运行时 RunTime
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_math;

import java.io.IOException;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/31
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class RuntimeTest_gl {
    public static void main(String[] args) throws IOException, InterruptedException {
        // public static RunTime getRunTime() 返回与当前Java应用程序关联的运行时对象
        Runtime runtime = Runtime.getRuntime();

        // public int availableProcessors() 获取JVM能够使用的处理器个数
        System.out.println("runtime.availableProcessors() = " + runtime.availableProcessors());

        // public long totalMemory() 返回JVM中的内存总大小(byte)
        System.out.println("runtime.totalMemory() = " + runtime.totalMemory());
        System.out.println("runtime.totalMemory() = " + runtime.totalMemory()/1024.0/1024.0 + "MB");

        // public long freeMemory() 返回JVM中的可用内存大小(byte)
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory() / 1024.0 / 1024.0 + "MB");

        // public Process exec(String command) 启动某个程序，并返回代表该程序的对象
        Process notepadProcess = runtime.exec("E:\\Program Files (x86)\\Notepad++\\notepad++.exe");
        Thread.sleep(10 * 1000);
        notepadProcess.destroy();

        // public void exit(int status) 终止当前运行的JVM，形参作为状态代码；按照管理，非0表示异常终止
        runtime.exit(0);
    }
}
