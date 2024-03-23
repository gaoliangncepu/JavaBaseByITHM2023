/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_util;

import java.util.Random;
import java.util.StringJoiner;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/12/23
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MyUtilPractice {

    // 构造器私有化
    private MyUtilPractice() {
    }

    public static String createCode(int n) {
        if (3 >= n) {
            System.out.println("验证码至少4位！");
            return null;
        }

        String sourceStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int index = rd.nextInt(sourceStr.length());
            sb.append(sourceStr.charAt(index));
        }
        return sb.toString();
    }
}
