package com.lil.leetcode.week3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/30 09:37
 **/
public class LeetCode_46_全排列_copy {
    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> res = new ArrayList<>();


    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean st[] = new boolean[n];
        dfs(nums, 0, st);
        System.out.println(res);
        return res;
    }

    /**
     * add函数加入List中
     */
    public static void dfs(int[] nums, int u, boolean[] st) {
        int n = nums.length;
        if (u == n) res.add(new ArrayList<>(path));
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