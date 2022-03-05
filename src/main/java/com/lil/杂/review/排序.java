package com.lil.杂.review;

/**
 * @author Lil
 * @date 2021/7/13 15:07
 */
public class 排序 {
    public int[] MySort (int[] arr) {
        return quicksort(arr, 0, arr.length - 1);
    }

    private int[] quicksort(int[] q, int l, int r) {
        if (l >= r) return q;
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
        quicksort(q, l, j);
        quicksort(q, j + 1, r);
        return q;
    }
}
