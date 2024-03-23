/*
 * @Description:评委打分案例：去掉1个最高分，去掉1个最低分，计算平均分
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.demo.gaol;

import java.util.Scanner;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/30
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("最终得分是：" + getAverageScore(6));
    }

    private static double getAverageScore(int number) {
        //1.初始化一个指定长度的动态数组，存放评委打分（由键盘依次输入）
        double[] scores = new double[number];

        //2.定义键盘扫描对象
        Scanner sc = new Scanner(System.in);

        //3.使用for循环录入6个评委打分，放入数组中
        for (int i = 0; i < number; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            scores[i] = sc.nextDouble();
        }

        //4.将评委打分情况整体打印出来
        print(scores);

        //5.定义变量存放最大值、最小值、求和值
        double sum = 0;
        double max = scores[0];
        double min = scores[0];

        //6.遍历数组，寻找最值并求和
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            sum += score;

            if (score > max)
                max = score;

            if (score < min)
                min = score;
        }

        //计算分数
        return (sum - max - min) / (number - 2);
    }

    /**
     * 方法：打印数组
     * @param scores
     */
    private static void print(double[] scores) {
        if (null == scores || 0 == scores.length) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(i== scores.length-1 ? scores[i] : scores[i] + ", ");
        }
        System.out.println("]");
    }
}
