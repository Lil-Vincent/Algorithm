package com.lil.leetcode.week3;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_46_全排列 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        boolean st[] = new boolean[nums.length];
        dfs(0, path, nums, st);
        System.out.print(res);
        return res;
    }
    public static void dfs (int u, List<Integer> path, int nums[],boolean st[]) {
        if (u == nums.length) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i ++) {
            if (!st[i]) {
                path.add(nums[i]);
                st[i] = true;
                dfs(u + 1, path, nums, st);
                path.remove((Integer) nums[i]);
                st[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        permute(nums);
    }
}
