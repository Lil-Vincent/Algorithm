package com.lil.leetcode.week3;

/**
 * @author Lil
 * @date 2022/04/13 08:42
 **/
public class LeetCode_35_搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}