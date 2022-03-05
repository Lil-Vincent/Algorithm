package com.lil.notCommonlyUs.fondation.week3;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/18 11:21
 */
@SuppressWarnings("all")
public class 单链表 {
    public static int N = 100000;
    public static int e[] = new int[N];
    public static int ne[] = new int[N];
    static int head = -1;
    static int idx = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0) {
            String str = in.next();
            if (str.equals("H")) {
                int x = in.nextInt();
                insertHead(x);
            } else if (str.equals("D")) {
                int k = in.nextInt();
                if (k == 0) head = ne[head];
                else delete(k - 1);
            } else if (str.equals("I")) {
                int k = in.nextInt();
                int x = in.nextInt();
                insert(k - 1, x);
            }
        }

        for (int i = head; i != -1; i = ne[i]) {
            System.out.print(e[i] + " ");
        }
    }
    //初始化
    public static void init(){
        head = -1;
        idx = 0;
    }
    // 将x插到下标是k的点后面
    public static void insert(int k, int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx ++;
    }
    // 将x插到头节点后面
    public static void insertHead(int x) {
       e[idx] = x;
       ne[idx] = head;
       head = idx ++;
    }
    // 将下标是k的点后面的点删掉
    public static void delete(int k) {
       ne[k] = ne[ne[k]];
    }
}

