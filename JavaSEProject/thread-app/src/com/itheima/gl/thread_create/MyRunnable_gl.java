/*
 * @Description:创建线程二：implements Runnable
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
public class MyRunnable_gl implements Runnable{
    // run() 方法体内的内容即为新线程要干的事儿，通过thread(runnable).start启动，而不是直接调用run()方法
    @Override
    public void run() {
        System.out.println("创建线程二：implements Runnable");
    }
}
