package com.lil.leetcode;

import jdk.jfr.internal.tool.Main;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2022/03/03 19:30
 **/
public class LeetCode_1_两数之和 {
    public static void main(String[] args) {
        int[] q = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(q, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}