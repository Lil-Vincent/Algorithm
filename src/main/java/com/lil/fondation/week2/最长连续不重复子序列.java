package com.lil.fondation.week2;/**
 * @author Lil
 * @date 2021/5/12 10:00
 */

import javax.xml.soap.Node;
import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/12 10:00
 * @version 1.0
 */
public class 最长连续不重复子序列 {
    static int N = 100010;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q[] = new int[n];
        int s[] = new int[N];

        for (int i = 0; i < n; i++) q[i] = in.nextInt();

        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            s[q[i]]++;

            while (j < i && s[q[i]] > 1){
                s[q[j]]--;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
    }
}
