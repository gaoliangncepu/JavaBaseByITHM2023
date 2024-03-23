/*
 * @Description:Java中字符的编码和解码
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/20
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test_gl {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String str = "a测试b123@#$";
        byte[] bytes1 = str.getBytes();//默认使用平台编码字符集
        System.out.println(Arrays.toString(bytes1));
        System.out.println(bytes1.length);

        byte[] bytes2 = str.getBytes("GBK");//使用指定的编码字符集
        System.out.println(Arrays.toString(bytes2));
        System.out.println(bytes2.length);

        //2.解码
        String str2 = new String(bytes1);//默认使用平台编码字符集
        System.out.println(str2);
        String str3 = new String(bytes1,"GBK");//使用指定的编码字符集
        System.out.println(str3);
        String str4 = new String(bytes2);//默认使用平台编码字符集
        System.out.println(str4);
        String str5 = new String(bytes2,"GBK");//使用指定的编码字符集
        System.out.println(str5);
    }
}
