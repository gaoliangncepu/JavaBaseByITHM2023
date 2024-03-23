/*
 * @Description:同步代码块，线程安全
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_safe.synchronized_code;

import com.itheima.gl.thread_safe.MyAccount;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Account2_gl extends MyAccount {
    public Account2_gl() {
    }

    public Account2_gl(String cardId, double money) {
        super(cardId, money);
    }

    @Override
    public void drawMoney(int money) {
        String name = Thread.currentThread().getName();

        // 同步代码块：用synchronized代码块包住核心冲突代码，需要指定一把锁（公共的锁）
        synchronized (this) {//this代表一把公共锁，必须是不同线程均可访问的同一个对象
            if (super.getMoney() >= money) {
                System.out.println(name + "开始取钱");
                super.setMoney(super.getMoney() - money);
                System.out.println("线程" + name + "取钱" + money + "元成功，余额" + super.getMoney());
            } else {
                System.out.println("线程" + name + "取钱" + money + "元失败，余额不足");
            }
        }
    }
}
