package com.lil.notCommonlyUs.fondation.week3;

import java.io.*;

public class 模拟队列 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static final int N = 100010;
    static int[] q = new int[N];
    static int hh = 0, tt =-1;

    // 入队
    public static void push(int val) {
        q[++tt] = val;
    }

    // 出队
    public static void pop() {
        hh++;
    }

    // 判断队列是否为空
    public static boolean empty() {
        return hh > tt;
    }

    // 查询队头元素
    public static int query() {
        return q[hh];
    }

    // 查询队尾元素
    public static int queryToTail() {
        return q[tt];
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