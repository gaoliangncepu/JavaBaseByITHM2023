/*
 * @Description:手动加锁解锁，线程安全
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_safe.synchronized_lock;

import com.itheima.gl.thread_safe.MyAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Account4_gl extends MyAccount{
    //创建一个锁对象（用final修饰，不允许修改，保证是同一个）
    private final Lock lock = new ReentrantLock();

    public Account4_gl() {
    }

    public Account4_gl(String cardId, double money) {
        super(cardId, money);
    }

    @Override
    public void drawMoney(int money) {
        String name = Thread.currentThread().getName();

        try {
            lock.lock();//加锁
            if (super.getMoney() >= money) {
                System.out.println(name + "开始取钱了");
                super.setMoney(super.getMoney() - money);
                System.out.println("线程" + name + "取钱" + money + "元成功，余额" + super.getMoney());
            } else {
                System.out.println("线程" + name + "取钱" + money + "元失败，余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//解锁
        }
    }
}
