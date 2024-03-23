/*
 * @Description:使用迭代器Iterator遍历Collection
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/02
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionDemo01_gl {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        // c = [赵敏, 小昭, 素素]

        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()) {//判断当前索引位置有无元素
            String ele = iterator.next();//获取当前索引位置的元素值，并将索引值加1
            System.out.println(ele);
        }
    }
}
