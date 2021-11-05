package com.lil.offer;

/**
 * @author Lil
 * @date 2021/7/14 22:57
 */
public class 数组中重复的数字JZ50 {
    public int duplicateInArray(int[] nums) {
        int n = nums.length;
        for (int x : nums) {
            if (x < 0 || x >= n) return -1;
        }

        for (int i = 0; i < n; i++) {
            while (nums[nums[i]] != nums[i]) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
            if (nums[i] != i) return nums[i];
        }

        return -1;
    }
}
