/*
 * @Description:增强for遍历Collection
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/02
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionDemo02_gl {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");

        // 使用增强for循环遍历集合
        for (String str : c) {
            System.out.println(str);
        }

        // 数组也可以使用增强for循环
//        String[] names = {"迪丽热巴", "古力娜扎", "稀奇哈哈"};
        String[] names = new String[]{"迪丽热巴", "古力娜扎", "稀奇哈哈"};
        for (String name : names) {
            System.out.println(name);
        }
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
    }
}
