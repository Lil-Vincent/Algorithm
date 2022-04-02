package com.lil.leetcode.week1;

import java.awt.image.Kernel;

/**
 * @author Lil
 * @date 2022/03/31 20:41
 **/
public class LeetCode_8_字符串转换整数atoi {
    public static int myAtoi(String s) {
        char[] str = s.toCharArray();
        int k = 0;
        while (k < str.length && str[k] == ' ') k++;
        if (k == str.length) return 0;


        int minus = 1;
        int res = 0;
        if (str[k] == '-') {
            minus = -1;
            k++;
        } else if (str[k] == '+') {
            k++;
        }

        while (k < str.length && str[k] >= '0' && str[k] <= '9') {
            int x = str[k] - '0';
            if (minus > 0 && res > (Integer.MAX_VALUE - x) / 10) return Integer.MAX_VALUE;
            if (minus < 0 && -res < (Integer.MIN_VALUE + x) / 10) return Integer.MIN_VALUE;
            if (minus < 0 && res * 10 - x == Integer.MAX_VALUE + 1) return Integer.MIN_VALUE;
            res = res * 10 + str[k] - '0';
            k++;
        }

        res *= minus;
        if (res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
        if (res < Integer.MIN_VALUE) res = Integer.MIN_VALUE;
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        myAtoi("-91283472332");
        int res1 = Integer.MAX_VALUE;
        int rs2 = Integer.MIN_VALUE;
        System.out.println(res1);
        System.out.println(rs2);
    }
}