/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_communication;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ThreadTest_gl {
    public static void main(String[] args) {
        //需要3个生产者线程，负责生产包子，每个线程每次只能生产1个包子放在桌子上
        //创建2个消费者线程，负责吃包子，每个线程每次只能吃1个包子
        //桌子是大家都能访问的公共对象
        Desk_gl desk_gl = new Desk_gl();

        //创建3个生产者线程
        new Thread(() -> {
            while (true) {
                desk_gl.put();
            }
        }, "厨师1").start();

        new Thread(() -> {
            while (true) {
                desk_gl.put();
            }
        }, "厨师2").start();

        new Thread(() -> {
            while (true) {
                desk_gl.put();
            }
        }, "厨师3").start();

        // 创建2个消费者线程
        new Thread(() -> {
            while (true) {
                desk_gl.get();
            }
        }, "顾客1").start();

        new Thread(() -> {
            while (true) {
                desk_gl.get();
            }
        }, "顾客2").start();
    }
}
