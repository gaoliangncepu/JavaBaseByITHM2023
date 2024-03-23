/*
 * @Description:数组定义：静态数组、动态数组
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.gaol;

import java.util.Scanner;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/28
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ArrayDefine {
    public static void main(String[] args) {
//        arrayDemo();
//        arrayTest4();
        arrayTest6();
    }

    private static void arrayDemo() {
        int a = 10;//方法体内的变量（局域变量），值直接存储在栈内存
        System.out.println(a);

        int[] arr1 = new int[]{};
        System.out.println(arr1.length);

        // 动态初始化数组
        int[] arr2 = new int[3];
        System.out.println(arr2.length);
        arr2[0] = 11;
        arr2[1] = 22;
        arr2[2] = 33;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 静态初始化数组
        int[] arr3 = new int[]{1,2,3,4,5};
        System.out.println(arr3.length);
        int[] arr4 = {1,2,3,4,5};
        System.out.println(arr4.length);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        // 二维数组
        String[][] strArr = new String[4][2];
        System.out.println(strArr.length);
    }

    /**
     * 完成对数组的元素求和
     */
    private static void arrayTest4() {
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("员工的销售总额：" + sum);
    }

    /**
     * 完成评为打分的案例
     */
    private static void arrayTest6() {
        //1.定义一个动态初始化的数组，负责后期存储6个评为的打分
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);
        //2.遍历数组中的每个位置，录入评委的打分，存入数组中
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个评委的打分：");
            scores[i] = sc.nextDouble();
        }

        double sum = 0.0;
        //3.遍历数组中的，每个元素并求和
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("选手的最终得分是：" + sum/ scores.length);
    }
}
