package com.lil.杂.PAT;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/8/24 21:00
 *
给定区间 [−2^31,2^31] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。

输入格式：
输入第 1 行给出正整数 T (≤10)，是测试用例的个数。
随后给出 T 组测试用例，每组占一行，顺序给出 A、B 和 C。整数间以空格分隔。

输出格式：
对每组测试用例，在一行中输出 Case #X: true 如果 A+B>C，否则输出 Case #X: false，
其中 X 是测试用例的编号（从 1 开始）。
 */

public class A加B和C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; i ++) {
            long A = in.nextLong();
            long B = in.nextLong();
            long C = in.nextLong();
            if (A + B > C) System.out.println("Case #" + i + ": true");
            else System.out.println("Case #" + i + ": false");
        }
    }
}
