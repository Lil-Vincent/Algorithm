package com.lil.leetcode.week3;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2022/04/18 14:47
 **/
//把数组映射到 0 - n(n为数组到长度)， 下标和数一样。遍历， 遍历到第一个nuims[i] != i 的数字，则返回 i + 1， 如果遍历完都没有的话 返回  n + 1
// 2.思路二： 数组里面的数字放到哈希表中， 从1开始枚举查询哈希表中是否存在这个数字， 不存在则返回这个数字
public class LeetCode_39_组合总和_dfs_X {
//    public int firstMissingPositive(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        int res = 1;
//        while (map.containsKey(res)) res++;
//
//        return res;
//    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 1;


        for (int i = 0; i < n; i++) {
            if (nums[i] != Integer.MIN_VALUE) nums[i] -= 1;
        }

        for (int i = 0; i < n; i++) {
            while (nums[i] >= 0 && nums[i] < n && nums[i] != nums[nums[i]] && nums[i] != i) {
                swap(nums, i, nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) return i + 1;
        }
        return n + 1;
    }

    public static void swap(int[] q, int a, int b) {
        int t = q[a];
        q[a] = q[b];
        q[b] = t;
    }

    public static void main(String[] args) {
        int q[] = {7, 8, 9, 11, 12};
        firstMissingPositive(q);
    }
}