package com.lil.leetcode.week1;

/**
 * @author Lil
 * @date 2022/03/29 15:56
 **/
public class LeetCode_6_Z字形变换 {
    public String convert(String s, int n) {
        if (n == 1) return s;
        char[] str = s.toCharArray();

        String res = "";
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = i; j < str.length; j += 2 * n - 2) {
                    res += str[j];
                }
            } else {
                for (int j = i, k = 2 * n - 2 - i; j < str.length || k < str.length; j += 2 * n - 2, k += 2 * n - 2) {
                    if (j < str.length) res += str[j];
                    if (k < str.length) res += str[k];
                }
            }
        }
        return res;
    }
}