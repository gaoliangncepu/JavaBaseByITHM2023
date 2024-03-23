/*
 * @Description:LinkedList集合的使用
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_collection_list;

import java.util.LinkedList;
import java.util.List;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/10
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class ListTest3_gl {
    public static void main(String[] args) {
        //1.队列（先进先出）
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("第1号人");
        queue.addLast("第2号人");
        queue.addLast("第3号人");
        queue.addLast("第4号人");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst()); //NoSuchElementException

        //栈（后进先出）
        LinkedList<String> stack = new LinkedList<>();
        //压栈
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack);
        //出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        //压栈
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);
        //出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
