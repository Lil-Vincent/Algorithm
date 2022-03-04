package com.lil.leetcode;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2022/03/03 19:30
 **/
public class LeetCode_1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(target - a)) {
                return new int[]{map.get(target - a), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}