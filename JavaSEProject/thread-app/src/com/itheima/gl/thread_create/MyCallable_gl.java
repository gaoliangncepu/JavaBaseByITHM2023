/*
 * @Description:创建线程三：implements Callable
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_create;

import java.util.concurrent.Callable;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/04
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyCallable_gl implements Callable {
    private int n;

    public MyCallable_gl(int n) {
        this.n = n;
    }

    // call() 方法体内内容即为新线程要干的事儿，通过Thread.start启动，而不是直接调用call()方法
    // call() 方法能将子线程处理结果返回给主调
    @Override
    public Object call() throws Exception {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        Thread.sleep(5000);

        return "Callable线程计算1-"+ n +"的和="+ sum;
    }
}
