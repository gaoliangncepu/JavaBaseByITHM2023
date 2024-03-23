/*
 * @Description: 创建线程一：extends Thread
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_create;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyThread_gl extends Thread {
    // run() 方法体内的内容即为新线程要干的事儿，通过Thread.start启动，而不是直接调用run()方法
    @Override
    public void run() {
        System.out.println("创建线程一：extends Thread");
    }
}
