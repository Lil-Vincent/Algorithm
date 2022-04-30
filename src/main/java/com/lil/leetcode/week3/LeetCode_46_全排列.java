package com.lil.leetcode.week3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/30 09:37
 **/
public class LeetCode_46_全排列 {
    static public List<List<Integer>> res = new ArrayList<>();
    static public List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        boolean st[] = new boolean[nums.length];
        dfs(nums, 0, st);
        System.out.println(res);
        return res;
    }

    public static void dfs(int[] nums, int u, boolean[] st) {
        int n = nums.length;
        if (u == n) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < n; i++) {
            if (!st[i]) {
                path.add(nums[i]);
                st[i] = true;
                dfs(nums, u + 1, st);
                path.remove((Integer) nums[i]);
                st[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int q[] = {1, 2, 3};
        permute(q);
    }
}