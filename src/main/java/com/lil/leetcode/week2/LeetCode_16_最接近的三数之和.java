package com.lil.leetcode.week2;

import java.util.Arrays;
import java.util.jar.JarEntry;

/**
 * @author Lil
 * @date 2022/04/05 22:02
 **/
public class LeetCode_16_最接近的三数之和 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 100010;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(res - target)) res = sum;
                if (sum > target) {
                    r--;
                    continue;
                } else if (sum < target) {
                    l++;
                    continue;
                } else {
                    return target;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int q[] = {-1, 2, 1, -4};
        int target = 1;
        threeSumClosest(q, target);
    }
}