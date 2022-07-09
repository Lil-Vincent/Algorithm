package com.lil.杂.fondation.A_算法基础;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/07/09 13:39
 **/
public class 高精度_加法 {
    public List add(List<Integer> a, List<Integer> b) {
        List<Integer> C = new ArrayList<>();

        int t = 0, n = a.size(), m = b.size();
        for (int i = 0; i < n || i < m; i++) {
            if (i < n) t += a.get(i);
            if (i < m) t += b.get(i);

            C.add(t % 10);
            t = t / 10;
        }

        if (t != 0) C.add(1);
        return C;
    }
}