package com.lil.leetcode.week3;

/**
 * @author Lil
 * @date 2022/04/18 16:54
 **/
public class LeetCode_43_字符串相乘 {
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int A[] = new int[n], B[] = new int[m];
        for (int i = n - 1; i >= 0; i--) A[n - i - 1] = num1.charAt(i) - '0';
        for (int i = m - 1; i >= 0; i--) B[n - i - 1] = num2.charAt(i) - '0';

        int C[] = new int[n + m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i + j] += A[i] + B[j];
            }
        }

        for (int i = 0, t = 0; i < C.length; i++) {
            t += C[i];
            C[i] = t % 10;
            t /= 10;
        }
        System.out.println(C);
        int k = C.length - 1;
        while (k > 0 && C[k] == 0) k--;

        String res = "";
        while (k >= 0) {
            res += C[k];
            k--;
        }

        return res;
    }

    public static void main(String[] args) {
        String a = "2", b = "3";

    }
}