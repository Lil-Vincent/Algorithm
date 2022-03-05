package com.lil.杂.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2021/7/28 20:44
 */
public class JZ24二叉树中和为某一值的路径 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> findPath(TreeNode root, int sum) {
            dfs(root, 0, sum);
            return res;
        }
        void dfs (TreeNode root, int sum, int target) {
            if (root == null) return;
            path.add(root.val);
            sum += root.val;
            if (root.left == null && root.right == null && sum == target) {
                res.add(new ArrayList<>(path));
            } else {
                if (root.left !=null) dfs(root.left, sum, target);
                if (root.right != null) dfs(root.right, sum, target);
            }
            path.remove(path.size() - 1);
        }
    }

    class Solution2 {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> findPath(TreeNode root, int sum) {
            dfs (root, 0, sum);
            return res;
        }

        void dfs(TreeNode root, int sum, int target) {
            if (root == null) return;
            path.add(root.val);
            sum += root.val;
            if (root.left == null && root.right == null && sum == target) {
                res.add(new ArrayList<>(path));
            }else {
                dfs(root.left, sum, target);
                dfs(root.right, sum, target);
            }
            path.remove(path.size() - 1);
        }
    }


}
