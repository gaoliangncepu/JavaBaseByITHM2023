/*
 * @Description:初步体验Stream流的方便与快捷
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/03
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class StreamTest1_gl {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
        System.out.println(names);

        // 找出姓张，且是3个字的名字，存入到一个新集合中去。
        List<String> subList = new ArrayList<>();
        names.forEach(str -> {
            if (str.startsWith("张") && str.length() == 3)
                subList.add(str);
        });
        System.out.println(subList);

        List<String> subList2 = names.stream().filter(str -> str.startsWith("张") && str.length() == 3).collect(Collectors.toList());
        System.out.println(subList2);
    }
}
