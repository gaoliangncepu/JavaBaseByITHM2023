/*
 * @Description:可变参数的使用
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_parameter;

import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/13
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class VarargParameterTest_gl {
    public static void main(String[] args) {
        test();
        test(15);
        test(15, 20,25,30);
        test(new int[]{20, 30, 40, 50});
    }

    public static void test(int ...nums) {
        // 在方法体内，本质上就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------------");
    }

    //1.可变参数只能放在形参列表的末尾
//    public static void test2(int ...nums, String name) {}

    //2.一个形参列表可变参数只能有一个
//    public static void test3(int ...nums, String ...names){}
}
