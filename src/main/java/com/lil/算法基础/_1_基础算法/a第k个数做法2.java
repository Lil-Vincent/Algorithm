package com.lil.算法基础._1_基础算法;

import java.util.Scanner;

//复杂度 n
public class a第k个数做法2 {
    static int quick_sort (int[] q, int k, int l, int r) {
        if (l >= r) return q[l];
        int x = q[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do i ++; while (q[i] < x);
            do j --; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        int SL = j - l + 1;
        if (k <= SL) return quick_sort(q, k, l, j);
        else return quick_sort(q, k - SL, j + 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        System.out.println(quick_sort(q, k, 0, n - 1));
    }
}
