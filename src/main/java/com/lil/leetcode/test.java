package com.lil.leetcode;

/**
 * @author Lil
 * @date 2022/03/22 15:16
 **/
public class test {
    public static void main(String[] args) {
        String[] str = {"1234", "abc", "cde"};
        int length = str.length;
        int length1 = str[0].length();
    }

    static void test(int x) {
        if (x != 1) {
            System.out.println(x);
            test(x - 1);
            System.out.println(x);
        }
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tot = nums1.length + nums2.length;
        if (tot % 2 == 0) {
            int left = find(nums1, 0, nums2, 0, tot / 2);
            int right = find(nums2, 0, nums2, 0, tot / 2 + 1);
            return (left + right) / 2.0;
        } else {
            return find(nums1, 0, nums2, 0, tot / 2 + 1);
        }
    }

    int find(int[] nums1, int i, int[] nums2, int j, int k) {
        return 0;
    }
}