/*
 * @Description:Arrays工具类常用方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d5_arrays;

import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/02/17
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ArraysTest1_gl {
    public static void main(String[] args) {
        int[] arr = {60, 50, 40, 30, 20, 10};

        //1.public static String toString(类型[] arr)：返回数据内容字符串
        System.out.println(arr.toString());//数组地址
        String arrString = Arrays.toString(arr);
        System.out.println(arrString);//数组内容

        //2.public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引)：拷贝指定范围的数组，包前不包后
        int[] copy = Arrays.copyOfRange(arr, 3, arr.length);
        System.out.println(Arrays.toString(copy));

        //3.public static 类型[] copyOf(类型[] arr, int length)：拷贝数组，指定新数组的长度（多出的截掉，不够的补0）
        int[] copy1 = Arrays.copyOf(arr, 4);
        int[] copy2 = Arrays.copyOf(arr, 8);
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));

        //4.public static void sort(类型[] arr)：对数组内容进行排序（默认升序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //5.public static void setAll(类型[] arr, generator)：把数组中的原数据改为新数据后再存入
        /*Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return arr[operand] / 10;
            }
        });*/
        Arrays.setAll(arr, operand -> arr[operand] / 10);
        System.out.println(Arrays.toString(arr));
    }
}
