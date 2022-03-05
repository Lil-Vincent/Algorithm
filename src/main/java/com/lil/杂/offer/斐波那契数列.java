package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/9/8 21:22
 */
public class 斐波那契数列 {
    public int printFB(int n) {
        int a =0, b = 1;
        while (n -- > 0) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
