/*
 * @Description:找到指定范围内的素数
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.demo.gaol;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/30
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test7_2 {
    public static void main(String[] args) {
        //1.定义整型变量存放素数个数
        int count = 0;

        //2.定义for循环遍历差早范围内的每个正整数
        out://外部循环标签
        for (int i = 101; i <= 200; i++) {

            for (int j = 2; j <= i/2 ; j++) {
                if (0 == i%j) {
                    continue out;//结束外部循环当次执行，进入下一次执行
                }
            }

            System.out.println(i);
            count++;
        }

        System.out.println("素数的总个数：" + count);
    }
}
