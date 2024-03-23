/*
 * @Description:Map集合的遍历：key遍历、value遍历、Entry遍历、foreEach遍历
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d5_map_traverse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/14
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class MapTest123_gl {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);

        //1.按key遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Double aDouble = map.get(key);
            System.out.println(key + "=>" +aDouble);
        }

        //2.按value遍历
        Collection<Double> values = map.values();
        values.forEach(System.out::println);

        //3.按Entry遍历
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + "==》" + entry.getValue());
        }

        //4.forEach遍历
        /*map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String key, Double value) {
                System.out.println(key + "===>" + value);
            }
        });*/

        map.forEach((k,v) -> System.out.println(k + "===>" + v));

    }
}
