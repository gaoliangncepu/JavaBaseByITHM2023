/*
 * @Description:取钱线程
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_safe;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class DrawThread_gl extends Thread{
    private MyAccount acc;

    public DrawThread_gl(String name, MyAccount acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(10000);
    }
}
