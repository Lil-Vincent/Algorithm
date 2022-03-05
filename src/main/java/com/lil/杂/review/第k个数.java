package com.lil.杂.review;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/10 11:32
 */
/*
215. 数组中的第K个最大元素
给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
示例 1:
输入: [3,2,1,5,6,4] 和 k = 2
输出: 5
示例 2:
输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4
提示：
1 <= k <= nums.length <= 104
-104 <= nums[i] <= 104
 */
public class 第k个数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k1 = in.nextInt();
        int k = n - k1 + 1;
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        quickSort(q, 0, n -1, k);
    }

    static int quickSort(int q[], int l, int r, int k) {
        if (l == r) return q[l];
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
        int SL = j - l + 1;
        if (k < SL) return quickSort(q, l, j, k);
        else return quickSort(q, j + 1, r, k - SL);
    }
}
