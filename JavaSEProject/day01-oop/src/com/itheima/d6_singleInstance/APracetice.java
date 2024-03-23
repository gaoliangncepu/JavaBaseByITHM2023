/*
 * @Description:饿汉式单例设计模式
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
public class APracetice {
    //2、静态私有成员变量记录对象
    private static APracetice instance = new APracetice();

    //1.私有化构造器
    private APracetice() {
    }

    //3、提供获取成员变量的静态方法
    public static APracetice getInstance() {
        return instance;
    }
}
