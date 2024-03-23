/*
 * @Description:使用HashSet去重内容相同的不同对象（对象相同的判断）
 * @Update:
 * @UpdateRemark:需重写对象的hashCode()和equals()方法
 */
package com.itheima.d4_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/11
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class SetTest3_gl {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        Student s1 = new Student("至尊宝", 28, 169.6);
        Student s2 = new Student("蜘蛛精", 23, 169.6);
        Student s3 = new Student("蜘蛛精", 23, 169.6);
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        Student s4 = new Student("牛魔王", 48, 169.6);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.println(studentSet);
    }
}
