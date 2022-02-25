package com.lil.算法基础._2_数据结构;

import com.sun.xml.internal.ws.streaming.TidyXMLStreamReader;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/02/25 22:04
 **/
public class A_单链表 {
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
        // 是头节点相当于虚构出的一个节点x, ne[x] = head = 0
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