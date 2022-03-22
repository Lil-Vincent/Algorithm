package com.lil.算法基础._2_数据结构;

/**
 * @author Lil
 * @date 2022/03/22 22:33
 * <p>
 * <p>
 * <p>
 * 高效存储和查找字符串
 **/


public class H_Trie树 {
    public static int N = 100010;
    int son[][] = new int[N][26], cnt[] = new int[N], idx;

    void insert(char str[]) {
        int p = 0;
        for (int i = 0; i < str.length; i++) {
            int u = str[i] - 'a';
            if (son[p][u] == 0) son[p][u] = ++idx;
            p = son[p][u];//p移动到下一个点
        }

        cnt[p]++;
    }

    int query(char str[]) {
        int p = 0;
        for (int i = 0; i < str.length; i++) {
            int u = str[i] - 'a';
            if (son[p][u] == 0) return 0;
            p = son[p][u];
        }
        return cnt[p];
    }
}  