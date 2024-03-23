/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_create;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程一：extends Thread
        MyThread_gl myThread_gl = new MyThread_gl();
        myThread_gl.start();

        // 创建线程二：implements Runnable
        MyRunnable_gl myRunnable_gl = new MyRunnable_gl();
        new Thread(myRunnable_gl).start();//把任务对象交给一个Thread对象处理

        // 创建线程二：简化写法【主推】
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("创建线程二：简化写法" + i);
            }
        }).start();

        // 创建线程三：implements Callable
        MyCallable_gl myCallable_gl = new MyCallable_gl(100);
        FutureTask<String> futureTask = new FutureTask<String>(myCallable_gl);//实现了Runnable接口，通过get()方法获取线程返回结果

        new Thread(futureTask).start();//把任务对象交给一个Thread对象处理

        // 注意：如果执行到这儿，假如上面的线程还没有执行完毕
        // 这里的代码会暂停，等待上面线程执行完毕后才会获取结果，程序也不会往后执行
        String result = futureTask.get();// 获取线程执行完毕后返回的结果。
        System.out.println("子线程返回结果：" + result);

        for (int i = 0; i < 500; i++) {
            System.out.println("主线程main输出" + i);
        }
    }
}
