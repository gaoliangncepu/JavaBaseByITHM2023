/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_communication;

import java.util.ArrayList;
import java.util.List;

/**
 * 桌子对象，用于存放包子
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Desk_gl {
    private List<String> list = new ArrayList<>();

    /**
     * 做包子
     */
    public synchronized void put() {
        String name = Thread.currentThread().getName();

        try {
            // 判断是否已有包字
            if (0 == list.size()) {
                list.add(name + "做了一个包子");
                System.out.println(name + "做了一个包子");
                Thread.sleep(2*1000);

                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {// 有包子，不用做了
                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void get() {
        String name = Thread.currentThread().getName();

        try {
            // 判断是否已有包字
            if (1 == list.size()) {
                System.out.println(name + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(2*1000);

                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {// 没包子
                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
