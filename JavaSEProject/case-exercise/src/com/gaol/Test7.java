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
public class Test7 {
    public static void main(String[] args) {
        int count = find(101, 200);
        System.out.println("素数总共有：" + count);
    }

    private static int find(int start, int end) {
        //1.创建局域变量，存放素数的个数
        int count = 0;

        //2.遍历start到end之间的正整数
        for (int i = start; i <= end ; i++) {
            //3.判断当前的数是否是素数
            //定义成独立方法，便于重复调用
            if(judge(i)) {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }

    /**
     * 判断一个数是否是素数（只能被1和自己整除）
     * @param number
     * @return true-是素数；false-不是素数
     */
    private static boolean judge(int number) {
        // 从2开始一直遍历到number的一半，若无可整除的数，则为素数
        for (int i = 2; i <= number/2 ; i++) {
            if (0 == number%i) {
                return false;
            }
        }
        return true;
    }
}
