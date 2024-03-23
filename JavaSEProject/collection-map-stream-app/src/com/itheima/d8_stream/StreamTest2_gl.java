/*
 * @Description:掌握Stream流的创建
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d8_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/03
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class StreamTest2_gl {
    public static void main(String[] args) {
        //1.获取List集合的Stream流对象
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println);

        //2.获取Set集合的Stream流
        Set<String> nameSet = new HashSet<>();
        Collections.addAll(nameSet, "刘德华","张曼玉","蜘蛛精","马德","德玛西亚");
        Stream<String> stream2 = nameSet.stream();
        stream2.forEach(System.out::println);

        //3.获取Map集合的Stream流
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);

        Set<String> keys = map.keySet();
        Stream<String> keyStream = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> valueStream = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> entryStream = entries.stream();
        entryStream.filter(e -> e.getKey().contains("巴")).forEach(e -> System.out.println(e.getKey() + "----->" + e.getValue()));

        // 获取数组的Stream流
        String[] namesArray = names.toArray(new String[]{});
        Stream<String> stream3 = Arrays.stream(namesArray);
        stream3.forEach(e -> System.out.println(e));

        Stream<String> namesArray1 = Stream.of(namesArray);
        namesArray1.forEachOrdered(e -> System.out.println(e));
    }
}
