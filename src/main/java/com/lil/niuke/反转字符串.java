package com.lil.niuke;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/8/25 22:58
 */
public class 反转字符串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String solve = solve(str1);
        System.out.println(solve);
    }

    public static String solve (String str) {
        // write code here
        char[] ans = str.toCharArray();
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i -1] = str.charAt(i);
        }
        return new String(ans);
    }
}
