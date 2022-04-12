package com.lil.leetcode.week3;


/**
 * @author Lil
 * @date 2022/04/12 13:51
 **/
//1. 尽可能保证后面的位数先变动 2.从后往前遍历，如果说是降序'\'则说明左边的端点不可能再做改变，因为已经是这段区间的最大值，需要找到一个端点小于前面的这个端点
// q[i - 1] > q[i]
public class LeetCode_31_下一个排列 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int k = n;
        if (nums == null || n == 0) return;
        while (k - 1 >= 0 && nums[k - 1] >= nums[k]) k--;
        if (k == 0) {
            reverse(nums, 0, n);
            return;
        }
        int r = n, l = k - 1;
        while (nums[l] <= nums[r]) r--;
        swap(nums, l, r);
        reverse(nums, l + 1, n);
    }

    public static void swap(int nums[], int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public static void reverse(int nums[], int l, int r) {
        // 原本是降序。换了之后也是降序
        while (l < r) {
            swap(nums, l, r);
            r--;
            l++;
        }
    }

    public static void main(String[] args) {
        int[] q = {2, 3, 5, 4, 1};
        nextPermutation(q);
    }

}