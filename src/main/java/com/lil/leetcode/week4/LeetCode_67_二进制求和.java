package com.lil.leetcode.week4;

import java.util.ArrayList;

/**
 * @author Lil
 * @date 2022/07/10 15:20
 **/
public class LeetCode_67_二进制求和 {
    public String addBinary(String a, String b) {
        char[] A = a.toCharArray(), B = b.toCharArray();
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        ArrayList<Integer> E = new ArrayList<>();

        for (int i = A.length; i >= 0; i++) {
            C.add(A[i] - '0');
        }
        for (int i = B.length; i >= 0; i++) {
            D.add(B[i] - '0');
        }
        int t = 0;
        for (int i = 0; i < C.size() || i < D.size(); i++) {
            if (i < C.size()) t += C.get(i);
            if (i < D.size()) t += D.get(i);
            E.add(t % 2);
            t /= 2;
        }
        if (t != 0) E.add(t);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < E.size(); i++) {
            str.append(E.get(E.size() - i - 1));
        }
        return str.toString();
    }
}