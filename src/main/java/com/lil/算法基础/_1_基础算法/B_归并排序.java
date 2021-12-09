package com.lil.算法基础._1_基础算法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/12/08 12:38
 **/
public class B_归并排序 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }

        mergeSort(q, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.print(q[i] + " ");
    }
    public static void mergeSort(int q[], int l, int r){
        if (l >= r)return;

        int mid = l + r >> 1;
        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);

        int i = l, j = mid + 1, k = 0;
        int temp[] = new int[r - l + 1];
        while (i <= mid && j <= r){
            if (q[i] < q[j])
                temp[k++] = q[i++];
            else
                temp[k++] = q[j++];
        }
        while (i <= mid) temp[k ++] = q[i ++];
        while (j <= r)   temp[k ++] = q[j ++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = temp[j];
    }
}
