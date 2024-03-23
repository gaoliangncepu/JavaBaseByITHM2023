/*
 * @Description:文件字节流（基本字节流）
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_byte_stream;

import java.io.*;
import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/20
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test_gl {
    public static void main(String[] args) {
        try (
                //1.创建文件字节输入流管道，与源文件接通
                InputStream is1 = new FileInputStream("file-io-app\\src\\itheima01.txt");
                InputStream is2 = new FileInputStream("file-io-app\\src\\itheima02.txt");
                InputStream is3 = new FileInputStream("file-io-app\\src\\itheima03.txt");
                //5.创建文件字节输出流管道，与目标文件接通
                OutputStream os = new FileOutputStream("file-io-app/src/itheima04out.txt");//覆盖管道
//                OutputStream os = new FileOutputStream("file-io-app/src/itheima04out.txt", true);//追加管道
                ){
            //2.开始读取文件的字节数据--每次读取1个字节
//            int read = is1.read();//返回读到字节的整型值，没有数据时返回-1
//            System.out.println(read);
//            System.out.println((char) read);

            // 前文已经读取过的内容，后文就读不到了
            // 循环读取
            // 读取数据的性能很差，读取汉字会乱码（无法避免的），读取ASCII码对应的字符不会乱码（1Byte）
            int readInt;
            while ((readInt = is1.read()) != -1) {
//                System.out.print(readInt);
                System.out.print((char) readInt);
            }
            System.out.println("\r\n");

            //3.读取文件的字节数据--每次读取指定长度的字节数组
//            byte[] bytes = new byte[3];//缓存数组
//            int read = is2.read(bytes);//返回读到的字节数，读不到有效内容时返回-1
//            System.out.println(Arrays.toString(bytes));
//            System.out.println(new String(bytes));
//            System.out.println("当次读取的字节数量：" + read);

            //循环读取
            //性能得到了明显提升！（理论上，性能随缓冲数组长度的增加而改善，但有上限）
            //也无法避免读取汉字乱码问题。

            byte[] bytes = new byte[3];//缓存数组
            int len;
            while ((len = is2.read(bytes)) != -1) {
                //注意：读多少，倒多少
                String str = new String(bytes, 0, len);
                System.out.print(str);
            }

            //4.读取文件中的字节数据--一次性读取全部字节到一个字节数组中
            //解决了中文乱码问题，但是占用内存空间，当文件太大时无法使用
            File file = new File("file-io-app\\src\\itheima03.txt");
            byte[] buffer = new byte[(int) file.length()];
            int length = is3.read(buffer);
            String string = new String(buffer);
            System.out.println(string);
            System.out.println(file.length());
            System.out.println(length);

            //6.向本地文件写出字节
            os.write(97);//97就是一个字节
            os.write('b');//'b'也是一个字节
            os.write(new byte[]{99, 'd', 'e'});//写出字节数组
            os.write("\r\n".getBytes());
            os.write("abc我爱你中国def".getBytes());
            os.write("\r\n".getBytes());
            byte[] bytes1 = "123测试看看截取写出bkldk".getBytes();
            os.write(bytes1, 0, 5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
