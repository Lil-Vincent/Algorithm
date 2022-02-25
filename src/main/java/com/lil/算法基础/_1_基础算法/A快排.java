package com.lil.算法基础._1_基础算法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Member;
import java.util.Scanner;
/**
 * Lil
 * 📅
 */

public class A快排 {
    static void quick_sort (int[] q, int l, int r) {
       if (l >= r) return;
       int x = q[l + r >> 1], i = l - 1, j = r + 1;
       while (i < j) {
           do i ++; while (q[i] <= x);
           do j --; while (q[j] > x);
           if (i < j) {
               int temp = q[i];
               q[i] = q[j];
               q[j] = temp;
           }
       }
       quick_sort(q, l, j);
       quick_sort(q, j + 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) q[i] = in.nextInt();


        quick_sort(q, 0, n - 1);

        System.out.println("1");
        for (int i = 0; i < n; i++) System.out.print(q[i] + " ");

    }
}
