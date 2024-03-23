/*
 * @Description:生成指定位数的随机验证码，每位字符可以是数字、大小写字母
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.demo.gaol;

import java.util.Random;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/27
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(generateCheckCode(3));

    }

    /**
     * 输入数据：验证码的位数
     * 返回数据：验证码
     */
    private static String generateCheckCode(int length) {
        String checkCode = "";
        Random random = new Random();

        // 1.for循环产生每一位随机数
        for (int i = 0; i < length; i++) {
            // 2.每个数位的字符类型随机确定，使用0、1、2分别代表数字、小写字母、大写字母
            int type = random.nextInt(3);
            switch (type) {
            case 0:
                checkCode += random.nextInt(10);
                break;
            case 1:
                char lowerChar = (char) (random.nextInt(26)+97);
                checkCode += lowerChar;
                break;
            case 2:
                char upperChar = (char) (random.nextInt(26)+65);
                checkCode += upperChar;
                break;
            }

        }

        return checkCode;
    }
}
