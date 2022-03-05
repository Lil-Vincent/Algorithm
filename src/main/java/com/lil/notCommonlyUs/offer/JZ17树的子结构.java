package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/7/23 17:32
 */
public class JZ17树的子结构 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {
           if (pRoot1 == null || pRoot2 == null) return false;
           if (isPart(pRoot1, pRoot2) == true) return true;
           else return hasSubtree(pRoot1.left, pRoot2.left) || hasSubtree(pRoot1.right, pRoot2.right);
        }

        private boolean isPart(TreeNode root1, TreeNode root2) {
            if (root2 == null) return true;
            if (root1 == null) return false;
            else {
                if (root1.val == root2.val)
                    return isPart(root1.left, root2.left) && isPart(root1.right, root2.right);
                else return false;
            }
        }
    }
}
