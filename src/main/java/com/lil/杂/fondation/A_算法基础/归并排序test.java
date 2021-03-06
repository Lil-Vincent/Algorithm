package com.lil.杂.fondation.A_算法基础;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/4/27 11:36
 */
//1. 递归分截
public class 归并排序test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        mergeSort(q, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(q[i] + " ");
    }

    public static void mergeSort(int q[], int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);

        int i = l, j = mid + 1;
        int k = 0;
        int temp[] = new int[r - l + 1];
        while (i <= mid && j <= r) {
            if (q[i] < q[j])
                temp[k++] = q[i++];
            else
                temp[k++] = q[j++];
        }

        while (i <= mid) q[i++] = temp[k++];
        while (j <= r) q[j++] = temp[k++];

        for (i = l, j = 0; i < r; i++, j++)
            q[i] = temp[j];
    }
}

