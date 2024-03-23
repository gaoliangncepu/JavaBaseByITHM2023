/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gl.thread_pool;

import java.util.concurrent.Callable;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/05
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyCallable_gl implements Callable<String>{
    private int n;

    public MyCallable_gl(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        //线程任务：计算1-n的和返回
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        Thread.sleep(2 * 1000);
        return Thread.currentThread().getName() + "计算1-" + n + "的和为：" + sum;
    }
}
