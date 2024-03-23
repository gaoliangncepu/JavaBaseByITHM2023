/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_pool;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/05
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyRunnable_gl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "==> Runnable接口式线程");

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
