/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_api;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyThread_gl extends Thread {
    // 创建含参构造器，为线程设置名字
    public MyThread_gl(String name) {
        super(name);
    }

    @Override
    public void run() {
        //
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 50; i++) {
            System.out.println("线程：" + currentThread.getName() + "执行了" + i);
        }
    }
}
