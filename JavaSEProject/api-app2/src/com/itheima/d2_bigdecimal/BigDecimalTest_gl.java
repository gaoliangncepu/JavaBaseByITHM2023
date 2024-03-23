/*
 * @Description:BigDecimal的使用
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/31
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class BigDecimalTest_gl {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 1;
        double d = 0.32;
        double e = 1.015;
        double f = 1.301;

        //1.把浮点型数据封装成BigDecimal对象，再来参与运算
        // 1).public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。 注意：不推荐使用这个，
        BigDecimal bigDecimal_a = new BigDecimal(a);
        BigDecimal bigDecimal_b = new BigDecimal(b);
        BigDecimal decimal_add = bigDecimal_a.add(bigDecimal_b);//0.3000000000000000166533453693773481063544750213623046875
        System.out.println(decimal_add);

        // 2).public BigDecimal(String val) 得到的BigDecimal对象是可以精确计算浮点型数据的。 可以使用。
        BigDecimal bigDecimal_A = new BigDecimal(Double.toString(a));
        BigDecimal bigDecimal_B = new BigDecimal(Double.toString(b));
        BigDecimal decimal_ADD = bigDecimal_A.add(bigDecimal_B);//0.3
        System.out.println(decimal_ADD);

        // 3).public static BigDecimal valueOf(double val) 得到的BigDecimal对象是可以精确运算的。是最好的方案。
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal add = a1.add(b1);//加法：0.3
        System.out.println(add);

        BigDecimal c1 = BigDecimal.valueOf(c);
        BigDecimal d1 = BigDecimal.valueOf(d);
        BigDecimal subtract = c1.subtract(d1);//减法：0.68
        System.out.println(subtract);

        BigDecimal e1 = BigDecimal.valueOf(e);
        BigDecimal multiply = e1.multiply(BigDecimal.valueOf(100));//乘法：101.500
        System.out.println(multiply);

        BigDecimal f1 = BigDecimal.valueOf(f);
        BigDecimal divide = f1.divide(BigDecimal.valueOf(100));//除法：0.01301
        System.out.println(divide);

        BigDecimal a11 = BigDecimal.valueOf(0.1);
        BigDecimal a22 = BigDecimal.valueOf(0.3);
        BigDecimal a33 = a11.divide(a22,  2, RoundingMode.HALF_UP); // divide(另一个BigDecimal对象，精确几位，舍入模式) : 除法，可以设置精确几位。0.33
        System.out.println(a33);

        double divideDoubleVue = divide.doubleValue();
        double a33DoubleVue = a33.doubleValue();
        System.out.println(divideDoubleVue);
        System.out.println(a33DoubleVue);
    }
}
