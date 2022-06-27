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
        while (k > 0 && nums[k - 1] >= nums[k]) k--;
        System.out.println(k);
        if (k == 0) {
            reverse(nums, 0, n);
        } else {
            int l = k - 1;
            int r = k;
            System.out.println(l);
            System.out.println(r);
            // 等于的情况下自己和自己交换，没有意义
            // while (r <= n && nums[r] >= nums[l]) r++;
            while (r <= n && nums[r] > nums[l]) r++;
            System.out.println(l);
            System.out.println(r);
            swap(nums, l, r - 1);
            reverse(nums, l + 1, nums.length - 1);
        }
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) swap(nums, l++, r--);
    }

    private static void swap(int[] q, int a, int b) {
        int t = q[a];
        q[a] = q[b];
        q[b] = t;
    }

    public static void main(String[] args) {
        int q[] = {5, 1, 1};
        nextPermutation(q);
    }


}

