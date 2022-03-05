package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/7/20 10:55
 */
public class JZ12数值的整数次方 {
    public static double Power(double base, int exponent) {
        if (exponent < 0) {
            base = 1 / base;
            exponent = - exponent;
        }
        double res = 1;
        for (int i = 0; i < exponent; i++) {
            res *= base;
        }
        return res;
    }
}

