package com.lil.算法基础._2_数据结构;

import com.sun.xml.internal.ws.streaming.TidyXMLStreamReader;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/02/25 22:04
 **/
public class A_单链表 {
    /**
     * 数组模拟单链表，如何模拟。e代表的是这个数的值，ne代表的是这个数的下一个数的位置
     * 重点理解：
     *
     *  3 -> 5 -> 4 -> 2 -> 1
     *  e[0] = 3, e[1] = 5, e[2] = 4
     *  ne[0] = 1, ne[1] = 2, ne[3] = 4
     *  idx只是记录下使用的节点，相当于临时拿过来用的一个数。因为链表不是连续的，只需要指向对就可以了.
     */
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int head,idx;
    public static void main(String[] args) {

    }

    static void init() {
        head = -1;
        idx = 0;
    }
    static void add_to_head (int x) {
        e[idx] = x;
        ne[idx] = head;
        head = idx;
        idx ++;
    }
    static void add (int x, int k) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx;
        idx ++;
    }

    static void remove (int k) {
        ne[k] = ne[ne[k]];
    }
}