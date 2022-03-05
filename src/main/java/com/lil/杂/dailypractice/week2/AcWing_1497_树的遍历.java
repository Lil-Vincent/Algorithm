package com.lil.杂.dailypractice.week2;/**
 * @author Lil
 * @date 2021/5/3 11:12
 */

import java.io.InputStreamReader;
import java.util.*;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/3 11:12
 * @version 1.0
 */
public class AcWing_1497_树的遍历 {
    int n;
    static int[] postorder;
    static int[] inorder;
    static Map<Integer,Integer> pos = new HashMap<>();
    static Map<Integer,Integer> l = new HashMap<>();
    static Map<Integer,Integer> r = new HashMap<>();


    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

        int n = in.nextInt();
        for (int i = 0; i < n; i++) postorder[i] =  in.nextInt();
        for (int i = 0; i < n; i++) {
            postorder[i] = in.nextInt();
            pos.put(inorder[i], i);
        }

        int root = build(0, n - 1, 0, n - 1);
        //bfs(root);
    }

    static int build(int pl, int pr, int il, int ir){
        int root = postorder[pr];
        int k = pos.get(root);

        if (il < k){
            int left = build(pl, k - 1 - il + pl, il, k - 1);
            r.put(root, left);
        }
        if (k < ir) {
            int rihgt = build(k - 1 - il + pl + 1, pr - 1, k + 1, ir);
            r.put(root, rihgt);
        }

        return root;
    }

    private static void bfs(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode node = q.pop();

            System.out.print(node.val + " ");
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
}
