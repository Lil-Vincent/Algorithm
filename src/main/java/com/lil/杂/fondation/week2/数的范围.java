package com.lil.杂.fondation.week2;/**
 * @author Lil
 * @date 2021/5/8 9:50
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiao
 * @version 1.0
 * @description: TODO
 * @date 2021/5/8 9:50
 */
public class 数的范围 {

    static int N = 100010;
    static int[] a = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = in.readLine().split(" ");
        int n = Integer.parseInt(cur[0]);
        int q = Integer.parseInt(cur[1]);

        String[] arr = in.readLine().split(" ");
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(arr[i]);

        while (q-- != 0) {
            int target = Integer.parseInt(in.readLine());

            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (a[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }

            if (a[l] == target) System.out.print(l + " ");
            else System.out.print(-1 + " ");

            l = 0;
            r = n - 1;
            while (l < r) {
                int mid = r + l + 1 >> 1;
                if (a[mid] <= target)
                    l = mid;
                else
                    r = mid - 1;
            }

            if (a[l] == target) System.out.println(l);
            else System.out.println(-1);
        }
    }

}
