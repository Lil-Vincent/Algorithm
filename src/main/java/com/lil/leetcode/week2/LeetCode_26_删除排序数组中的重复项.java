package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/09 19:16
 **/
//i走在前，j按顺序走走在后面。判断是否遇到新的元素，如果是新的元素则放到j里面， 如果不是的话则不管
public class LeetCode_26_删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] q = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(q);
    }
}