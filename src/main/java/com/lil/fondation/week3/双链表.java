package com.lil.fondation.week3;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/19 10:22
 */
public class 双链表 {
    static int m;
    static int idx;
    static int N=100010;
    static int[] l = new int[N], r = new int[N], e = new int[N];
    //初始化
    static void init(){
        //0 表示左端点, 1 表示右端点
        r[0] = 1;//0 号点的右边是 1 号点
        l[1] = 0;//1 号点的左边是 0 号点
        idx = 2;
    }
    //第k个点的右边插入x
    //要是再k的左边插入x可以   addAtRight(int l[k], int x)
    static void add(int k, int x){
        e[idx]=x;
        r[idx]=r[k];
        l[idx]=k;
        l[r[k]]=idx;
        r[k]=idx;
        idx++;
    }
    //删除第k个点
    static void delete(int k){
        l[r[k]]=l[k];
        r[l[k]]=r[k];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        init();
        while (n -- != 0) {
            String str = in.next();
            if (str.equals("L")){
                int x = in.nextInt();
                add(0, x);
            }else if (str.equals("R")){
                int x = in.nextInt();
                add(l[1], x);
            }else if (str.equals("D")){
                int k = in.nextInt();
                delete(k + 1);
            }else if (str.equals("IL")){
                int k = in.nextInt();
                int x = in.nextInt();
                add(l[k + 1], x);
            }else {
                int k = in.nextInt();
                int x = in.nextInt();
                add(k + 1, x);
            }
        }
        for(int i = 0; r[i] != 1; i = r[i])
            System.out.print(e[r[i]]+" ");
    }

}
