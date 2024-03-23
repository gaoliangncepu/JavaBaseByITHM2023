/*
 * @Description:选择排序
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
public class Test2_gl {
    public static void main(String[] args) {
        int[] source = new int[]{5, 2, 4, 7, 6};

        for (int i = 1; i < source.length; i++) {
            //i = 1 2 3 4
            //i = 1        0     j = 1 2 3 4
            //i = 2        1     j = 2 3 4
            //i = 3        2     j = 3 4
            //i = 4        3     j = 4
            for (int j = i; j < source.length; j++) {
                if (source[i-1] < source[j]) {
                    int temp = source[j];
                    source[j] = source[i-1];
                    source[i-1] = temp;
                }
            }
        }

        System.out.println("降序：" + Arrays.toString(source));

        for (int i = 0; i < source.length-1; i++) {
            //i= 0 1 2 3
            //i=0   0   j=1 2 3 4
            //i=1   1   j=2 3 4
            //i=2   2   j=3 4
            //i=3   3   j=4
            for (int j = i+1; j < source.length; j++) {
                if (source[i] > source[j]) {
                    int temp = source[j];
                    source[j] = source[i];
                    source[i] = temp;
                }
            }
        }
        System.out.println("升序：" + Arrays.toString(source));
    }
}
