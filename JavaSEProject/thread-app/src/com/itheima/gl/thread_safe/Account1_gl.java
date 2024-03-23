/*
 * @Description:未采取线程安全措施，线程不安全
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
public class Account1_gl extends MyAccount{

    public Account1_gl() {
    }

    public Account1_gl(String cardId, double money) {
        super(cardId, money);
    }

    @Override
    public void drawMoney(int money) {
        String name = Thread.currentThread().getName();

        if (super.getMoney() >= money) {
            System.out.println(name + "开始取钱了");
            super.setMoney(super.getMoney() - money);
            System.out.println("线程" + name + "取钱" + money + "元成功，余额" + super.getMoney());
        } else {
            System.out.println("线程" + name + "取钱" + money + "元失败，余额不足");
        }
    }
}
