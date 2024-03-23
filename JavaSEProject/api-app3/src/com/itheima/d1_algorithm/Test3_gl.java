/*
 * @Description:二分查找法
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d1_algorithm;

import java.util.Arrays;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/09
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test3_gl {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(binarySearch(arr, 150));

        System.out.println(binarySearch(arr, 102));

        System.out.println(Arrays.binarySearch(arr, 127));
    }

    public static int binarySearch(int[] arr, int search) {
        if (search < arr[0] || search > arr[arr.length-1]) return -1;

        int left = 0;
        int right = arr.length-1;
        int mid;

        while (left <= right) {
            mid = (left + right)/2;

            if (search < arr[mid]) {
                right = mid-1;
            } else if (search > arr[mid]) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
