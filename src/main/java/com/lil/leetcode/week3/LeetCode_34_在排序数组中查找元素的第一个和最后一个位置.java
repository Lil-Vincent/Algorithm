package com.lil.leetcode.week3;

/**
 * @author Lil
 * @date 2022/04/13 00:44
 **/
public class LeetCode_34_在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        if (nums.length == 0 || nums == null) return res;
        int n = nums.length - 1;
        int l = 0, r = n;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        if (target != nums[l]) return res;
        else {
            res[0] = l;
            l = 0;
            r = n;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (nums[mid] <= target) l = mid;
                else r = mid - 1;
            }
            res[1] = l;
        }
        return res;
    }
}