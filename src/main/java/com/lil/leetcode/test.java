package com.lil.leetcode;


import java.util.ArrayList;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 * @author Lil
 * @date 2022/03/22 15:16
 **/
public class test {
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) A.add(digits[i]);
        int t = 1;
        for (int i = 0; i < A.size(); i++) {
            t += A.get(i);
            B.add(t % 10);
            t /= 10;
        }
        if (t != 0) B.add(t);
        int[] res = new int[B.size()];
        for (int i = 0; i < B.size(); i++) {
            res[i] = B.get(B.size() - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] q = {9, 1};
        int[] b = plusOne(q);
        plusOne(b);
    }

}