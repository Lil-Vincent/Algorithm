package com.lil.offer;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

/**
 * @author Lil
 * @date 2021/7/16 10:29
 */
public class JZ4重建二叉树 {

    int[] preorder, inorder;
    HashMap<Integer, Integer> map;
    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        return dfs( 0, preorder.length -1, 0, inorder.length - 1);
    }

    private TreeNode dfs(int pl, int pr, int il, int ir) {
        if (pl > pr) return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int k = map.get(root.val);
        root.left = dfs(pl, pl + k - il, il, k);
        root.right = dfs(pl + k - il + 1, pr, k + 1, ir);
        return root;
    }
}
