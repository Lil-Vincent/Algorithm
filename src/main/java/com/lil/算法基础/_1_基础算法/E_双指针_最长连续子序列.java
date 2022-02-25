package com.lil.算法基础._1_基础算法;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/12/23 18:59
 **/
public class E_双指针_最长连续子序列 {
    static int N = 10010;
    static int s[] = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < n; i ++) a[i] = in.nextInt();

        int res = 0;
        for (int i = 0, j = 0; i < n; i ++) {
            s[a[i]] ++;
            while (j <= i && s[a[i]] > 1) {
                s[a[j]] --;
                j ++;
            }
            res = Math.max(res, i - j + 1);
        }

        System.out.println(res);

    }
}