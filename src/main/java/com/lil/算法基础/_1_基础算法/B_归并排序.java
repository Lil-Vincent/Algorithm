package com.lil.算法基础._1_基础算法;

import java.util.Scanner;
/**
 * @author Lil
 * @date 2021/11/27 11:36
 */
public class B_归并排序 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        mergeSort(q, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(q[i] + " ");
    }

    private static void mergeSort(int[] q, int l, int r) {

        if (l >= r) return;
        int mid = l + r >> 1, i = l, j = mid + 1;
        mergeSort(q, i, mid);
        mergeSort(q, j, r);

        int[] temp = new int[r - l + 1];
        int k = 0;
        while (i <= mid && j <= r) {
            if (q[i] < q[j]) temp[k ++] = q[i ++];
            else temp[k ++] = q[j ++];
        }
        while (i <= mid) temp[k ++] = q[i ++];
        while (k <= r) temp[k ++] = q[j ++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = temp[j];
    }


}