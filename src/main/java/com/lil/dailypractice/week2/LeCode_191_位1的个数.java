package com.lil.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/4/25 10:20
 */
public class LeCode_191_位1的个数 {
    public static int lowbit(int x) {
        return x & -x;
    }
    int hammingWeight(int n) {
        int cut = 0;
        while (n != 0) {
            n -= lowbit(n);
            cut++;
        }
        return cut;
    }
}
