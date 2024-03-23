/*
 * @Description:冒泡排序
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_algorithm;

import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/08
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test1_gl {
    public static void main(String[] args) {
        int[] source = new int[]{5, 2, 4, 7, 6};

        //1.控制比较的轮次：size-1=4
        for (int i = 1; i < source.length; i++) {
            // i = 1  2  3  4   次数
            // 第一轮  i=1       4
            // 第二轮  i=2       3
            // 第三轮  i=3       2
            // 第四轮  i=4       1

            //2.控制每轮比较的次数
            for (int j = 0; j < source.length-i; j++) {
                //j = 0  1  2  3
                //第一次  j=0  source[0] source[1]
                //第二次  j=1  source[1] source[2]
                //第三次  j=2  source[2] source[3]
                //第四次  j=3  source[3] source[4]
                if (source[j] > source[j+1]) {
                    // 判断当前位置的元素值，是否大于后一个位置处的元素值，如果大则交换。
                    int temp = source[j];
                    source[j] = source[j+1];
                    source[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(source));
    }
}
