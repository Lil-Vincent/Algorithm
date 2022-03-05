package com.lil.算法基础._2_数据结构;

/**
 * @author Lil
 * @date 2022/03/04 23:57
 **/
public class D_队列 {

    public static int N = 100010;
    public static int q[] = new int[N];
    public static int hh, tt = -1;


    //向队尾插入一个元素
    void push(int x) {
        q[++ tt] = x;
    }

    //对头弹出一个数
    void pop() {
        hh ++;
    }

    // 查询对头元素
    void query() {
        int res = q[hh];
    }
}