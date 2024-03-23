/*
 * @Description:数组的操作：数组元素求最值、数组反转、随机数组
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gaol;

import java.util.Random;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/29
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};

//        array_Max(faceScores);
//        array_convert(faceScores);
        array_random(faceScores);
    }

    /**
     * 数组元素求最值
     */
    private static void array_Max(int[] arrs) {
        //3.排除特殊情况
        if (null == arrs || 0 == arrs.length) {
            return;
        }

        //2.定义变量存放最大值
        int max = arrs[0];

        //1.从第二个元素开始遍历数组，挨个与max比较大小，若比max大，则把值赋给max
        for (int i = 1; i < arrs.length; i++) {
            if (max < arrs[i])
                max = arrs[i];
        }

        System.out.println("最大值是：" + max);
    }

    /**
     * 完成数组反转
     * 依次成对对调对称位置的元素
     * @param arrs
     */
    private static void array_convert(int[] arrs) {
        //3.排除特殊情况
        if (null == arrs || 1 >= arrs.length) {
            return;
        }

        //1.同时从前向后和从后向前依次遍历数组，互换堆成位置的两个元素值
        for (int i = 0,j= arrs.length-1; i < j; i++,j--) {
            int temp = arrs[j];
            arrs[j] = arrs[i];
            arrs[i] = temp;
        }

        //2.遍历数组，以数组形式打印数组内容
        System.out.print("[");
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(i== arrs.length-1 ? arrs[i] : arrs[i] + ",");
        }
        System.out.println("]");
    }

    /**
     * 打乱数组中的元素顺序/随机数组
     * @param arrs
     */
    private static void array_random(int[] arrs) {
        //3.排除特殊情况
        if (null == arrs || 1 >= arrs.length) {
            return;
        }

        Random random = new Random();
        //1.遍历数组，每次随机一个索引位置，交换遍历位置与索引位置元素的值
        for (int i = 0; i < arrs.length; i++) {
            int index = random.nextInt(arrs.length);

            int temp = arrs[index];
            arrs[index] = arrs[i];
            arrs[i] = temp;
        }

        //2.遍历数组并打印输出
        System.out.print("[");
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(i== arrs.length-1 ? arrs[i] : arrs[i] + ",");
        }
        System.out.println("]");
    }
}
