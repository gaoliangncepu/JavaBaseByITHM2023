/*
 * @Description:Thread常用方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_api;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        //1.指定、获取线程名称
        new MyThread_gl("线程一").start();//1.1通过含参构造器指定
        new MyThread_gl("线程二").start();

        //2.获取当前执行的线程对象
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());//1.3获取线程名称

        mainThread.setName("主线程/最牛的线程");//1.2通过setName()方法设置

        for (int i = 0; i < 10; i++) {
            System.out.println(mainThread.getName() + "执行了" + i);
        }

        //3.线程等待
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------"+ i +"------------");
            if (3 == i) {
                Thread.sleep(5 * 1000);//线程等待5秒后继续执行
            }
        }

        //4.线程优先执行
        MyThread_gl thread1 = new MyThread_gl("1号线程");
        MyThread_gl thread2 = new MyThread_gl("2号线程");
        MyThread_gl thread3 = new MyThread_gl("3号线程");
        thread1.start();
        thread2.start();
        thread2.join();//join()方法：让当前调用这个方法的线程先执行完
        thread3.start();

    }
}
