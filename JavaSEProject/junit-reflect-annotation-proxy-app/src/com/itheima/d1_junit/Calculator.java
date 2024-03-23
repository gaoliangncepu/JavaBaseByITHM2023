package com.itheima.d1_junit;

public class Calculator {
    public String name;
    public void printNumber(String name){
        System.out.println("名字长度是：" + name.length());
    }

    public double divide(int a, int b){
        return a / b;
    }
}
