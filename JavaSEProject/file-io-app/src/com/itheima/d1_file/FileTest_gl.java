/*
 * @Description:File对象创建、操作、参数获取
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/19
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class FileTest_gl {
    public static void main(String[] args) throws IOException {
        //1.创建File对象，代表指向的文件/文件夹
//        File file = new File(null); //传参不允许为null
        File file1 = new File("E:\\temp\\100.dcd");//绝对路径
        File file2 = new File("file-io-app/src/aa.txt");//相对路径：默认是从WorkingDirectory下开始
        File file3 = new File("E:" + File.separator + "temp" + File.separator + "100.dcd");
        File dir1 = new File("E:/temp");
        System.out.println(file1.length());
        System.out.println(file2.length());
        System.out.println(file3.length());
        System.out.println(dir1.length());

        //File对象指向不存在的文件/文件夹
        File dir2 = new File("E:/temp2");
        File file4 = new File("file-io-app/temp/100.txt");
        System.out.println(dir2.exists());
        System.out.println(file4.exists());

        //2.FIle对象属性获取
        System.out.println(dir2.isFile());
        System.out.println(dir2.isDirectory());
        System.out.println(file4.isFile());
        System.out.println(file4.isDirectory());
        System.out.println(dir2.getName());
        System.out.println(file4.getName());
        System.out.println(dir2.getPath());//E:\temp2
        System.out.println(file4.getPath());//file-io-app\temp\100.txt
        System.out.println(dir2.getAbsolutePath());//E:\temp2
        System.out.println(file4.getAbsolutePath());//F:\Code\IDEA\Learning\JavaBase_Heima2023\JavaSEProject\file-io-app\temp\100.txt

        long time = file2.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));

        System.out.println(file2.canRead());//true
        System.out.println(file2.canWrite());//false
        System.out.println(file2.canExecute());//true
        System.out.println(file2.isHidden());//true

        //3.FIle对象操作
        File dir3 = new File("file-io-app/temp/local");
        System.out.println(dir3.mkdir());//false
        System.out.println(dir3.mkdirs());//首次执行时返回true，当文件夹存在时重复创建返回false

        File file5 = new File("file-io-app/temp/other/100.txt");
//        System.out.println(file5.createNewFile());//所在文件夹不存在时抛IOException
        File file6 = new File("file-io-app/temp/local/100.txt");
        System.out.println(file6.createNewFile());//所首次执行时返回true，当文件夹存在时重复创建返回false

        System.out.println(dir3.delete());//非空文件夹不允许直接删除
        System.out.println(file6.delete());
        System.out.println(dir3.delete());

        //4.文件夹遍历
        File file7 = new File("file-io-app/src");
        System.out.println(Arrays.toString(file7.list()));
        String[] fileNameList = file7.list();
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }

        File[] fileList = file7.listFiles();
        for (File file : fileList) {
            System.out.println(file.getPath());
        }
    }
}
