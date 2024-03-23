/*
 * @Description:银行账户抽象类（测试用）
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
public abstract class MyAccount {
    private String cardId;
    private double money;

    public MyAccount() {
    }

    public MyAccount(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "MyAccount{" +
                "cardId='" + cardId + '\'' +
                ", money=" + money +
                '}';
    }

    public abstract void drawMoney(int i);
}
