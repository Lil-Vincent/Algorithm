package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/06/29 22:47
 **/
public class LeetCode_55_跳跃游戏 {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        for (int i = 0, j = 0; i < n; i++) {
            if (i < j) return false;
            j = Math.max(i, nums[i] + i);
        }
        return true;
    }


    public static void main(String[] args) {
        int[] q = {3, 2, 1, 0, 4};
        canJump(q);
    }
}