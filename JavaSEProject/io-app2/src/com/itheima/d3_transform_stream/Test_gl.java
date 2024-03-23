/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_transform_stream;

import java.io.*;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/19
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test_gl {
    public static void main(String[] args) {
//        readLocalFile("E:\\temp\\100_UTF8.txt", "GBK");
//        readLocalFile("E:\\temp\\100_UTF8.txt", "utf-8");
//        readLocalFile("E:\\temp\\100_GBK.txt", "GBK");
//        readLocalFile("E:\\temp\\100_GBK.txt", "utf-8");
        readLocalFile("io-app2/src/itheima06.txt", "GBK");

        writeToLocalFiles("io-app2\\src\\gl_GBK.txt", "GBK");
    }

    private static void readLocalFile(String path, String charset) {
        //排除特殊情况 new File(null)会不会抛异常
        if (null != path && !"".equals(path)) {
            File file = new File(path);
            if (file.exists()) {
                try (
                        //1.创建字节输入流管道与本地文件接通（文件的字符集编码生成的字节流）
                        InputStream is = new FileInputStream(path);

                        //2.创建字符输入转换流（将字节输入流按照文件编码方式解码转化成字符输入流）
                        InputStreamReader isr = new InputStreamReader(is, charset);

                        //3.把字符输入流包装成字符输入缓冲流
                        BufferedReader br = new BufferedReader(isr);
                ) {
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeToLocalFiles(String path, String charset) {
        //排除特殊情况 new File(null)会不会抛异常
        if (null != path && !"".equals(path)) {
            File file = new File(path);
            try (
                    //1.创建字节输出流与目标文件接通
                    FileOutputStream fos = new FileOutputStream(path);
                    //2.使用字符输出转换流按目标字符集将字节流转换成字符流
                    Writer osw = new OutputStreamWriter(fos, charset);
                    //3.将字符流包装成字符缓冲流
                    BufferedWriter bw = new BufferedWriter(osw);
                    ){
                bw.write("我是中国人abc");
                bw.newLine();
                bw.write("我爱你中国123");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
