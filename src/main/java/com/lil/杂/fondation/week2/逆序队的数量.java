package com.lil.杂.fondation.week2;/**
 * @author Lil
 * @date 2021/5/7 10:47
 */

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/7 10:47
 * @version 1.0
 */
public class 逆序队的数量 {
    static int[] order;
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            order[i] = in.nextInt();
        }
    }

    public int findInverse(int[] order){
        return 0;
    }
}
