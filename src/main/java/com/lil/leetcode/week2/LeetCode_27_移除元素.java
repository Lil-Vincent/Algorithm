package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/09 21:02
 **/
public class LeetCode_27_移除元素 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] == val) nums[k++] = nums[i];
        }
        return k;
    }
}