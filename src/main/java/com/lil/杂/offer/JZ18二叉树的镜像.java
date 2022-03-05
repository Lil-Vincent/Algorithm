package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/7/24 13:24
 */
public class JZ18二叉树的镜像 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void mirror(TreeNode root) {
            if (root == null) return;
            mirror(root.left);
            mirror(root.right);
            swap(root);
        }

        private void swap(TreeNode root) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}
