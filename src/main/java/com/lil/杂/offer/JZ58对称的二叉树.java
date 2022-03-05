package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/7/26 2:05
 */
public class JZ58对称的二叉树 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return dfs(root.left, root.right);
        }

        private boolean dfs(TreeNode p, TreeNode q) {
            if (p == null || q == null) return p == null && q == null;
            if (p.val != q.val) return false;
            return dfs(p.left, q.right) && dfs(p.right, q.left);
        }
    }
}
