package com.lil.offer;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2021/7/16 10:29
 */
public class JZ4重建二叉树1111 {

    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }
    int[] pre;
    int[] in;
    HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] pre, int[] in) {
        this.pre = pre;
        this.in = in;

        map = new HashMap<Integer, Integer>();
        for (int i = 0; i < in.length; i++) map.put(in[i], i);

        return dfs(0, pre.length -1, 0, in.length - 1);
    }

    private TreeNode dfs(int pl, int pr, int il, int ir) {
        if (pl > pr) return null;
        TreeNode root = new TreeNode(pre[pl]);
        int k = map.get(root.val);
        root.left = dfs(pl + 1, pl + k - il, il, k);
        root.right = dfs(pl + k - il + 1, pr, k + 1, ir);
        return root;
    }
}
