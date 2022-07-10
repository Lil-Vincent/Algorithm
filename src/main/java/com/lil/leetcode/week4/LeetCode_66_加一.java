package com.lil.leetcode.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/07/10 14:47
 **/
public class LeetCode_66_加一 {
    public static int[] plusOne(int[] d) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for (int i = d.length - 1; i >= 0; i--) {
            A.add(d[i]);
        }
        int t = 1;
        for (int i = 0; i < A.size(); i++) {
            t += A.get(i);
            B.add(t % 10);
            t /= 10;
        }
        if (t != 0) B.add(t);
        int[] res = new int[B.size()];
        for (int j = 0; j < B.size(); j++) {
            res[j] = B.get(B.size() - j - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

    }
}