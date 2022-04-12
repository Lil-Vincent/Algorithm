package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/02 18:37
 **/
//核心思想就是长度不够高度来凑。
// 思路就是
// 1.用两个使用两个指针分别指向两端往中间靠拢，
// 2.比较两边的数值大小，数值较小则需要移动指针。
public class LeetCode_11_盛最多水的容器 {
    public static int maxArea(int[] h) {
        int i = 0, j = h.length - 1;
        int area = 0;
        int res = 0;
        while (i < j) {
            area = Math.min(h[i], h[j]) * (j - i);
            res = Math.max(res, area);
            if (h[i] > h[j]) j--;
                // if (h[i] <= h[j])i++; 不能用这种方法，减完之后再比较可能出现错误情况
            else i++;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] q = {1, 8, 100, 2, 100, 4, 8, 3, 7};
        maxArea(q);
    }
}


