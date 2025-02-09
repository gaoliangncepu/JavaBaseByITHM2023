package com.itheima.d1_junit;

import org.junit.*;
import org.junit.Test;

/**
 * 测试类
 */
public class StringUtilTest {
    @Before //每个测试方法执行前都要执行一次
    public void test1(){
        System.out.println("---> test1 Before 执行了---------");
    }

    @BeforeClass //所有测试方法执行前优先仅执行1次
    public static void test11(){
        System.out.println("---> test11 BeforeClass 执行了---------");
    }

    @After // 每个测试方法执行后都要执行一次
    public void test2(){
        System.out.println("---> test2 After 执行了---------");
    }

    @AfterClass // 所有测试方法都执行完后最后仅执行一次
    public static void test22(){
        System.out.println("---> test22 AfterClass 执行了---------");
    }

    @org.junit.Test // 测试方法
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }

    @Test // 测试方法
    public void testGetMaxIndex(){
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        // 断言机制：程序员可以通过预测业务方法的结果。
        Assert.assertEquals("方法内部有bug!", 4, index2);
    }
}
