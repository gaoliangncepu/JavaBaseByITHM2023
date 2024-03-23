/*
 * @Description:创建线程池，处理Runnable线程
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
public class ThreadPoolTest1_gl {
    public static void main(String[] args) {
        /*public ThreadPoolExecutor(int corePoolSize,
        int maximumPoolSize,
        long keepAliveTime,
        TimeUnit unit,
        BlockingQueue<Runnable> workQueue,
        ThreadFactory threadFactory,
        RejectedExecutionHandler handler)*/
        // new 创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        // Runnable任务对象
        Runnable target = new MyRunnable_gl();

        pool.execute(target);// 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
        pool.execute(target);// 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
        pool.execute(target);// 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！

        pool.execute(target);// 放入任务队列等待执行
        pool.execute(target);// 放入任务队列等待执行
        pool.execute(target);// 放入任务队列等待执行
        pool.execute(target);// 放入任务队列等待执行
        pool.execute(target);// 放入任务队列等待执行

        pool.execute(target);//创建临时线程对象
        pool.execute(target);//创建临时线程对象

        pool.execute(target);//到了新任务的拒绝时机

        pool.shutdown();//等着线程池的任务全部执行完毕后，关闭线程池
        pool.shutdownNow();//立即关闭线程池，不管任务是否执行完毕
    }
}
