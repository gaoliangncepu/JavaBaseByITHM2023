/*
 * @Description:Map集合常用方法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d4_map;

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
public class MapTest2_gl {
    public static void main(String[] args) {
        //1.添加元素 public <K,V> V put(K key, V value)
        Map<String, Integer> map1 = new HashMap<>();
        System.out.println(map1.put("手表", 100));
        map1.put("手表", 220);
        map1.put("手机", 2);
        System.out.println(map1.put("Java", 2));
        map1.put(null, null);
        System.out.println(map1);

        //2.获取集合大小（元素个数） public int size()
        System.out.println(map1.size());

        //3.清空集合 public void clear()
//        map1.clear();

        //4.判断是否为空 public boolean isEmpty()
        System.out.println(map1.isEmpty());

        //5.根据键取值 public V get(Object key)
        System.out.println(map1.get("手表"));
        Integer val = map1.get(null);
        System.out.println(val);

        //6.根据键删除整个元素（返回对应的元素值） public V remove(Object key)
        System.out.println(map1.remove("手表"));
        System.out.println(map1);

        //7.判断是否包含某个键 public boolean containsKey(Object key)
        System.out.println(map1.containsKey("手表")); // false
        System.out.println(map1.containsKey("手机")); // true
        System.out.println(map1.containsKey("java")); // false
        System.out.println(map1.containsKey("Java")); // true

        //8.判断是否包含某个值 public boolean containsValue(Object value)
        System.out.println(map1.containsValue(2)); // true
        System.out.println(map1.containsValue("2")); // false

        //9.获取全部键 public Set(K) keySet()
        Set<String> keySet = map1.keySet();
        System.out.println(keySet);

        //10.获取全部值 public Collection<V> values()
        Collection<Integer> values = map1.values();
        System.out.println(values);

        //11.Map集合的值整体复制（倒入）
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("java1", 10);
        map2.put("java2", 20);
        Map<String,Integer> map3 = new HashMap<>();
        map3.put("java3", 10);
        map3.put("java2", 30);
        map3.putAll(map2);
        System.out.println(map2);
        System.out.println(map3);
    }
}
