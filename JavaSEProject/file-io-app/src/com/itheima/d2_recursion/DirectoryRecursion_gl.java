/*
 * @Description:文件搜索（文件夹多级遍历）
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_recursion;

import java.io.File;
import java.io.IOException;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/20
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class DirectoryRecursion_gl {
    public static void main(String[] args) {
        String dir = "F:/Tech";
        String fileName = "jdk-11中文api修订版.CHM";
        searchLocalFile(new File(dir), fileName);
    }

    private static void searchLocalFile(File resourceDir, String fileName) {
        if (null == resourceDir || !resourceDir.exists() || null == fileName || "".equals(fileName)) return;

        if (resourceDir.isFile()) {
            if (resourceDir.getName().contains(fileName)) {
                String absolutePath = resourceDir.getAbsolutePath();
                System.out.println("找到了：" + absolutePath);
                Runtime runtime = Runtime.getRuntime();
                try {
                    Process process = runtime.exec("hh.exe " + absolutePath);//打开一个CHM文件
                    int exitCode = process.waitFor();
                    System.out.println("Exit code: " + exitCode);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            File[] files = resourceDir.listFiles();

            if (null != files && 0 < files.length) {
                for (File file : files) {
                    searchLocalFile(file, fileName);
                }
            }
        }
    }
}
