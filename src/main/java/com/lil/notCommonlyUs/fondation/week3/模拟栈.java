package com.lil.notCommonlyUs.fondation.week3;

import java.io.*;

public class 模拟栈 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static final int N = 100010;
    static int[] stk = new int[N];
    static int tt = -1;

    // 入栈
    public static void push(int val) {
        stk[++ tt] = val;
    }

    // 出栈
    public static void pop() {
        tt --;
    }

    // 判断栈是否为空
    public static boolean empty() {
        return tt == -1;
    }

    // 查询栈顶元素
    public static int query() {
        return stk[tt];
    }

    public static void main(String[] args) throws IOException {
        int m = Integer.parseInt(reader.readLine());

        while (m-- > 0) {
            String[] s = reader.readLine().split(" ");
            if (s[0].equals("push")) {
                push(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop")) {
                pop();
            } else if (s[0].equals("query")) {
                System.out.println(query());
            } else {
                if (empty()) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}