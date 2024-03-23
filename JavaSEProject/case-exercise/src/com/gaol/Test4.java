/*
 * @Description:数字加密程序
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
public class Test4 {
    public static void main(String[] args) {
        System.out.println("加密后的结果是：" + encrypt(1983));
    }

    /**
     * 数字加密程序实现
     * @param number 待加密数据
     * @return
     */
    private static String encrypt(int number) {
        String encryptedStr = "";
        //1.把输入的数字拆分成一个一个的数字，放入数组中，才可以对齐进行加密操作
        int[] numbers = split(number);

        //2.遍历数组，对每一位数字进行加密逻辑操作
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5)%10;
        }

        // 反转数组
        reverse(numbers);

        //3.将加密处理的新数组每一位拼接起来生成字符串
        for (int i = 0; i < numbers.length; i++) {
            encryptedStr += numbers[i];
        }

        return encryptedStr;
    }

    private static void reverse(int[] arr) {
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * 将4位正整数拆分为单个数字的字符串
     * @param number
     * @return
     */
    private static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number/1000;
        numbers[1] = (number/100)%10;
        numbers[2] = (number/10)%10;
        numbers[3] = number%10;

        return numbers;
    }
}
