/*
 * @Description:懒汉式单例设计模式
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d6_singleInstance;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/12/23
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class BPractice {
    //2、定义私有类变量存储类对象
    private static BPractice instance;

    //1、私有化构造器
    private BPractice() {
    }

    //3、对外提供获取类变量的类方法
    public static BPractice getInstance() {
        return null == instance?instance=new BPractice():instance;
    }
}
