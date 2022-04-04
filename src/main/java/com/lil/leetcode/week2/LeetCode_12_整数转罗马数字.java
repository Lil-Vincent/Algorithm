package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/03 15:37
 **/
public class LeetCode_12_整数转罗马数字 {
    public static String intToRoman(int num) {
        int q[] = {
                1000,
                900, 500, 400, 100,
                90, 50, 40, 10,
                9, 8, 5, 4, 1
        };
        String a[] = {
                "M",
                "CM", "D", "CD", "C",
                "XC", "L", "XL", "X",
                "IX", "VII", "V", "IV", "I"
        };

        String res = "";
        for (int i = 0; i < q.length; i++) {
            while (num >= q[i]) {
                res += a[i];
                num -= q[i];
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        intToRoman(58);
    }
}