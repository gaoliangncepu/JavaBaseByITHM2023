/*
 * @Description:同步方法，线程安全
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_safe.synchronized_method;

import com.itheima.gl.thread_safe.MyAccount;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Account3_gl extends MyAccount {
    public Account3_gl() {
    }

    public Account3_gl(String cardId, double money) {
        super(cardId, money);
    }

    // 同步方法：给线程核心方法加上synchronized修饰
    @Override
    public synchronized void drawMoney(int money) {
        String name = Thread.currentThread().getName();

        if (super.getMoney() >= money) {
            System.out.println(name + "开始取钱");
            super.setMoney(super.getMoney() - money);
            System.out.println("线程" + name + "取钱" + money + "元成功，余额" + super.getMoney());
        } else {
            System.out.println("线程" + name + "取钱" + money + "元失败，余额不足");
        }
    }
}
