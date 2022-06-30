package com.lil.leetcode.week4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Lil
 * @date 2022/06/30 23:18
 **/
public class LeetCode_56_合并区间 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0) return new int[0][0];
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });

        int l = intervals[0][0], r = intervals[0][1];
        ArrayList<int[]> list = new ArrayList();
        list.add(new int[]{l, r});
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] > list.get(list.size() - 1)[1]) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                list.get(list.size() - 1)[1] = Math.max(intervals[i][1], list.get(list.size() - 1)[1]);
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
        int[][] a = {
                {1, 3}, {9, 6}, {8, 10}, {15, 18}
        };

    }
}