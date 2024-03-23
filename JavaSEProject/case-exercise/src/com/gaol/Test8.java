/*
 * @Description:双色球系统
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.demo.gaol;

import java.util.Random;
import java.util.Scanner;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/30
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test8 {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumber();
        System.out.println("您投注的号码：");
        printArray(userNumbers);

        int[] luckNumbers = createLuckNumber();
        System.out.println("中奖的号码：");
        printArray(luckNumbers);

        judge(userNumbers, luckNumbers);
    }

    private static void printArray(int[] userNumbers) {
        if (null == userNumbers || 0 == userNumbers.length)
            return;

        System.out.print("[");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(i == userNumbers.length -1 ? userNumbers[i] : userNumbers[i] + ", ");
        }
        System.out.println("]");
    }

    private static boolean exist(int number, int[] numbers) {
        if (null == numbers)
            return false;

        for (int i = 0; i < numbers.length; i++) {
            //下面这一段判断有助于提高性能，减少不必要的循环
            if (0 == numbers[i]) {
                break;
            }
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * 1.设计一个方法，用于让用户投注一组号码并返回（前6个是红球号码，最后1个是蓝球号码）
     * @return
     */
    private static int[] userSelectNumber() {
        //2.创建一个整型数组，用于存储用户投注的7个号码
        int[] numbers = new int[7];//{0,0,0,0,0,0, 0}

        Scanner sc = new Scanner(System.in);
        //3.遍历前6个位置，让用户依次投注6个红球号码
        for (int i = 0; i < numbers.length-1; i++) {
            while (true) {
                //4.提示用户投注当前次序的号码（1-33之间）
                System.out.println("请您输入第" + (i+1) + "个红球投注号码（1-33之间），不能重复投注：");
                int number = sc.nextInt();
                //5.判断用户投注号码是否在1-33之间
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认！");
                } else {
                    //6.判断用户投注号码是否重复投注
                    if (exist(number, numbers)) {
                        System.out.println("对不起，您当前输入的红球号码前面选择过，重复了，请确认！");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }

        //7.提示用户投注蓝球号码
        while (true) {
            System.out.println("请您输入最后1个蓝球号码（1-16）：");
            int number = sc.nextInt();

            if (1 > number || 16 < number) {
                System.out.println("对不起，您输入的蓝球号码范围不对！");
            } else {
                numbers[6] = number;
                break;// 蓝球号码录入成功，结束死循环
            }
        }
        return numbers;
    }

    /**
     * 2、设计一个方法，随机产生一组中奖号码（6个红球号码（1-33之间，不重复），1个篮球号码（1-16之间））
     * @return
     */
    private static int[] createLuckNumber() {
        //1.创建一个整型数组存放中奖号码
        int[] luckNumbers = new int[7];

        //2.随机产生1-33之间的6个正整数，不重复时放入数组中
        Random rd = new Random();
        for (int i = 0; i < luckNumbers.length-1; i++) {
            while (true) {
                int luckNumber = rd.nextInt(33) + 1;

                if (!exist(luckNumber, luckNumbers)) {
                    luckNumbers[i] = luckNumber;
                    break;
                }
            }
        }

        //3.随机产生1-16之间的正整数，放入数组最后一个元素位置
        luckNumbers[6] = rd.nextInt(16) + 1;

        return luckNumbers;
    }

    /**
     * 3.创建方法，判断中奖情况
     * @param userNumbers
     * @param luckNumbers
     */
    private static void judge(int[] userNumbers, int[] luckNumbers) {
        //1.创建局域变量，记录号码投中数量
        int redNum = 0;
        int blueNum = 0;

        //1.遍历用户投注号码中的红球号码，与中奖号码比对，记录红球号码正确数
        for (int i = 0; i < userNumbers.length-1; i++) {
            for (int j = 0; j < luckNumbers.length-1; j++) {
                if (luckNumbers[j] == userNumbers[i]) {
                    redNum++;
                    break;
                }
            }
        }

        blueNum = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redNum);
        System.out.println("您命中的蓝球数量是：" + blueNum);

        // 4、判断中奖详情，并输出结果
        if(redNum == 6 && blueNum == 1){
            System.out.println("恭喜您，中奖1000万，可以开始享受人生了~~~");
        }else if(redNum == 6 && blueNum == 0){
            System.out.println("恭喜您，中奖500万，可以稍微开始享受人生了~~~");
        }else if(redNum == 5 && blueNum == 1){
            System.out.println("恭喜您，中奖3000元，可以出去吃顿小龙虾了~");
        }else if(redNum == 5 && blueNum == 0 || redNum == 4 && blueNum == 1){
            System.out.println("恭喜您，中了小奖：200元~");
        }else if(redNum == 4 && blueNum == 0 || redNum == 3 && blueNum == 1){
            System.out.println("中了10元~");
        }else if( redNum < 3 && blueNum == 1){
            System.out.println("中了5元~");
        }else {
            System.out.println("感谢您对福利事业做出的巨大贡献~~~");
        }
    }
}
