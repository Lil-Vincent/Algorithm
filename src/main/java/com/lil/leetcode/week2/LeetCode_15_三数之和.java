package com.lil.leetcode.week2;

import com.lil.杂.fondation.JC排列数字;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/04 16:58
 **/
public class LeetCode_15_三数之和 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        //确定第一个数
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l + 1 < r && nums[l] == nums[l + 1]) l++;
                    while (r - 1 > l && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] > 0) r--;
                else l++;

            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] q = new int[]{-1, 0, 1, 2, -1, -4, -4};
        threeSum(q);
    }
}