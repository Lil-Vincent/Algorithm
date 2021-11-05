package com.lil.dailypractice.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/4/27 15:53
 */
//1. 构造树
//2. 遍历树
class Main {
    static int n;
    static int[] inorder;
    static int[] postorder;
    static Map<Integer, Integer> map = new HashMap<>();
    static Map<Integer, Integer> l = new HashMap<>();
    static Map<Integer, Integer> r = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 后序
        postorder = new int[n];
        // 中序
        inorder = new int[n];
        for (int i = 0; i < n; i++) { postorder[i] = sc.nextInt();}
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
            map.put(inorder[i], i);
        }
        int root = build(0, n - 1, 0, n - 1);
        bfs(root);
    }
    static int build(int pl, int pr, int il, int ir) {
        int root = postorder[pr];
        //中序遍历中根节点所在下标
        int idx = map.get(root);
        if (il < idx) {
            int left = build(pl, idx - 1 - il + pl, il, idx - 1);
            l.put(root, left);
        }
        if (idx < ir) {
            int rihgt = build(idx - 1 - il + pl + 1, pr - 1, idx + 1, ir);
            r.put(root, rihgt);
        }
        return root;
    }
    static void bfs(int root) {
        int[] d = new int[n];
        int hh = 0, tt = -1;
        d[++tt] = root;
        while (tt >= hh) {
            int poll = d[hh++];
            System.out.print(poll + " ");
            if (l.containsKey(poll)) {
                d[++tt] = l.get(poll);
            }
            if (r.containsKey(poll)) {
                d[++tt] = r.get(poll);
            }
        }
    }
}