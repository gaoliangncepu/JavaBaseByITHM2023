/*
 * @Description:模拟线程不安全的取钱模型
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_safe;

import com.itheima.gl.thread_safe.synchronized_lock.Account4_gl;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ThreadTest_gl {
    public static void main(String[] args) {
        /*
        // 没有线程安全机制，线程不安全
        Account1_gl acc1 = new Account1_gl("ICBC-111", 10000);//创建一个账户，代表两个人公共的存款账户
        //创建多个相互独立的取钱线程，执行取钱动作
        new DrawThread_gl("小明", acc1).start();
        new DrawThread_gl("小红", acc1).start();*/

        /*
        // 同步代码块上锁
        Account2_gl acc2 = new Account2_gl("ICBC-112", 10000);
        new DrawThread_gl("小黑2", acc2).start();
        new DrawThread_gl("小白2", acc2).start();
        new DrawThread_gl("小灰2", acc2).start();*/

        /*
        // 同步方法上锁
        Account3_gl acc3 = new Account3_gl("ICBC-113", 10000);
        new DrawThread_gl("小黑3", acc3).start();
        new DrawThread_gl("小白3", acc3).start();
        new DrawThread_gl("小灰3", acc3).start();*/

        // 手动上Lock所
        Account4_gl acc4 = new Account4_gl("ICBC-113", 10000);
        new DrawThread_gl("小黑4", acc4).start();
        new DrawThread_gl("小白4", acc4).start();
        new DrawThread_gl("小灰4", acc4).start();

    }
}
