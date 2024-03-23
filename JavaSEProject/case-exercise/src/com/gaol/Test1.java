/*
 * @Description:完成飞机票价的案例
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.demo.gaol;

/**
 * @author GaoL
 * @version 1.0
 * @date 2023/11/27
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Test1 {

    public static void main(String[] args) {
        double price = calculatePrice(1000, 11, "头等舱");
        System.out.println("优惠价是：" + price);
    }

    private static double calculatePrice(double price, int month, String type) {
        //1.判断当前月份是淡季还是旺季
        if (month >= 5 && month <= 10) {
            // 旺季
            //2.判断仓位类型
            switch (type) {
            case "头等舱":
                price *= 0.9;
            	break;
            case "经济舱":
                price *= 0.85;
                break;
            }
        } else {
            // 淡季
            //2.判断仓位类型
            switch (type) {
            case "头等舱":
                price *= 0.7;
                break;
            case "经济舱":
                price *= 0.65;
                break;
            }
        }

        return price;
    }
}
