package com.lil.leetcode;

import jdk.jfr.internal.tool.Main;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2022/03/03 19:30
 **/
public class LeetCode_1_两数之和 {
    public static void main(String[] args) {
        int[] q = {1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};
        int target = 11;
        int[] ints = twoSum(q, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}