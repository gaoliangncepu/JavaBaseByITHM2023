/*
 * @Description:Lambda表达式遍历Collection
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/02
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionDemo03_gl {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("殷素素");
        c.add("周芷若");

        // default void forEach(Consumer<? super T> action):结合Lambda表达式遍历集合
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        c.forEach((String str) -> {
//            System.out.println(str);
//        });

//        c.forEach((str) -> {
//            System.out.println(str);
//        });

//        c.forEach(str -> {
//            System.out.println(str);
//        });

//        c.forEach(str -> System.out.println(str));

        c.forEach(System.out::println);
    }
}
