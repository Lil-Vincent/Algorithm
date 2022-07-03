package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/02 19:18
 **/
public class LeetCode_60_第k个排列 {
    public static String getPermutation(int n, int k) {
        String ans = "";
        boolean[] status = new boolean[n * 2];
        for (int i = 0; i < n; i++) {
            int q = 1;
            for (int j = 1; j <= n - i - 1; j++) {
                q *= j;
            }
            for (int num = 1; num <= n; num++) {
                if (!status[num]) {
                    if (k > q) {
                        k -= q;
                    } else {
                        ans += Integer.toString(num);
                        status[num] = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        getPermutation(4, 10);
    }
}