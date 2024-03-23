/*
 * @Description:了解哈希值
 * @Update:
 * @UpdateRemark:Java中所有对象均可调用Object的hashCode()方法获取其哈希值</br>
 *              public int hashCode()</br>
 *              同一个对象多次调用hashCode()方法返回的哈希值是同一个</br>
 *              不同对象的哈希值一般不同，但也有可能相同（哈希碰撞）
 */
package com.itheima.d4_collection_set;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/11
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class SetTest2_gl {
    public static void main(String[] args) {
        Student s1 = new Student("蜘蛛精",25, 169.5);
        Student s2 = new Student("紫霞",22, 166.5);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
