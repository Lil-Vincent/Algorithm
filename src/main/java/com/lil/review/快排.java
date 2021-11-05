package com.lil.review;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/10 8:36
 */
public class 快排 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
   static void quickSort(int q[], int l, int r) {
       if (l >= r) return;
       int i = l - 1, j = r + 1;
       int x = q[l + r >> 1];
       while (i < j) {
           do i ++; while (q[i] < x);
           do j --; while (q[j] > x);
           if (i < j) {
               int temp = q[i];
               q[i] = q[j];
               q[j] = temp;
           }
       }
       quickSort(q, l, j);
       quickSort(q, j + 1, r);
   }
}
