/*
 * @Description:使用基本字节流复制文件
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/21
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CopyTest_gl {
    public static void main(String[] args) {
        try (
                //1.创建字节输入流管道，指向源文件
                FileInputStream fis = new FileInputStream("file-io-app\\src\\itheima03.txt");
                //2.创建字节输出流管道，指向目标文件
                FileOutputStream fos = new FileOutputStream("file-io-app\\src\\itheima03_2copy.txt");
                ){
            byte[] buffer = new byte[1024];//缓冲字节数组，1KB
            int len;//记录每次读入的字节数
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);//读入多少，倒出去多少
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
