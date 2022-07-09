package com.lil.杂.fondation.A_算法基础;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/4/26 22:31
 */
public class 第k个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        System.out.println(quickSort(q, 0, n - 1, k));
    }

    public static int quickSort(int[] q, int l, int r, int k) {
        if (l >= r) return q[l];
        int i = l - 1, j = r + 1;
        int x = q[(l + r) >> 1];
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        // 求出 SL 的长度（分界点 - 左边界 + 1）
        int SL = j - l + 1;
        if (k <= SL) return quickSort(q, l, j, k);
        else return quickSort(q, j + 1, r, k - SL);
    }
}
