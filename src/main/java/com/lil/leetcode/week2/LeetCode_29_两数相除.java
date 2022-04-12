package com.lil.leetcode.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/10 11:56
 **/
//通过第一个for循环确定答案的二进制位数，通过第二个for循环确定每个位数上取0还是取1
public class LeetCode_29_两数相除 {
    public static int divide(int x, int y) {
        List<Long> exp = new ArrayList<Long>();
        long a = x, b = y;
        boolean flag = false;//表示是不是负数
        if (a < 0 && b > 0 || a > 0 && b < 0) flag = true;

        for (long i = b; i < a; i = i + i) {
            exp.add(i);
        }

        long res = 0;
        for (int i = exp.size() - 1; i >= 0; i--) {
            if (a >= exp.get(i)) {
                a -= res;
                res += 1 >> i;
            }
        }

        if (flag) res = -res;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) res = Integer.MAX_VALUE;
        System.out.println();
        return (int) res;
    }

    public static void main(String[] args) {
        divide(200, 18);
    }
}