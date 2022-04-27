package com.lil.leetcode.week3;

import com.lil.杂.fondation.JC排列数字;

/**
 * @author Lil
 * @date 2022/04/19 15:06
 **/
public class LeetCode_48_旋转图像 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
            }
        }
    }


    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(a);
    }
}