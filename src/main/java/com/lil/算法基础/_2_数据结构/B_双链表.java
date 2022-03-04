package com.lil.算法基础._2_数据结构;

/**
 * @author Lil
 * @date 2022/03/04 21:46
 **/
public class B_双链表 {
    public static int N = 100100;
    static int e[] = new int[N], l[] = new int[N], r[] = new int[N];
    static int idx;

    void init() {
        //0表示左端点，1表示右端点
        r[0] = 1;
        l[1] = 0;
        idx = 2;
    }


    void add (int x, int k) {
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx;
        idx ++;
    }

    void remove (int k) {
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }


}