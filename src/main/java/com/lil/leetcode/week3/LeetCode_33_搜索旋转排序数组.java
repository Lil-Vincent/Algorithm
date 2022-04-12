package com.lil.leetcode.week3;


/**
 * @author Lil
 * @date 2022/04/12 13:51
 **/
//1. 尽可能保证后面的位数先变动 2.从后往前遍历，如果说是降序'\'则说明左边的端点不可能再做改变，因为已经是这段区间的最大值，需要找到一个端点小于前面的这个端点
// q[i - 1] > q[i]
public class LeetCode_33_搜索旋转排序数组 {
    public static int search(int[] nums, int target) {
        int n = nums.length - 1;
        int l = 0, r = n;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] >= nums[0]) l = mid;
            else r = mid - 1;
        }

        if (target >= nums[0]) l = 0;
        else {
            l = r + 1;
            r = n;
        }

        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }

        if (nums[l] == target) return nums[l];
        else return -1;
    }

    public static void main(String[] args) {
        int[] q = {4, 5, 6, 7, 0, 1, 2};
        search(q, 0);
    }

}