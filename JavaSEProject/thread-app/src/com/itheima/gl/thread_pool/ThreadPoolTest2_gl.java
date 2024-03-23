/*
 * @Description:创建线程池，处理Callable线程
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_pool;

import java.util.concurrent.*;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/05
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ThreadPoolTest2_gl {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        //2.使用线程处理Callable任务
        Future<String> future1 = pool.submit(new MyCallable_gl(100));
        Future<String> future2 = pool.submit(new MyCallable_gl(200));
        Future<String> future3 = pool.submit(new MyCallable_gl(300));
        Future<String> future4 = pool.submit(new MyCallable_gl(400));
        Future<String> future5 = pool.submit(new MyCallable_gl(500));
        Future<String> future6 = pool.submit(new MyCallable_gl(600));
        Future<String> future7 = pool.submit(new MyCallable_gl(700));
        Future<String> future8 = pool.submit(new MyCallable_gl(800));
        Future<String> future9 = pool.submit(new MyCallable_gl(900));

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());
        System.out.println(future6.get());
        System.out.println(future7.get());
        System.out.println(future8.get());
        System.out.println(future9.get());

        pool.shutdown();
    }
}
