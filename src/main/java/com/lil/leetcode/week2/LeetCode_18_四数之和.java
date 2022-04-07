package com.lil.leetcode.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/07 21:43
 **/
public class LeetCode_18_四数之和 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = n - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l + 1 < r && nums[l] == nums[l + 1]) l++;
                        while (r - 1 > l && nums[r] == nums[r - 1]) r--;
                        r--;
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] q = {2, 2, 2, 2, 2};
        int n = 8;
        fourSum(q, n);
    }
}