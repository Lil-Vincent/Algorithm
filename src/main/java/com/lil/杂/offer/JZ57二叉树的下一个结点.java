package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/7/16 11:24
 * 9. 二叉树的下一个节点
 *    题目
 *    提交记录
 *    讨论
 *    题解
 *    视频讲解
 *
 * 给定一棵二叉树的其中一个节点，请找出中序遍历序列的下一个节点。
 *
 * 注意：
 *
 * 如果给定的节点是中序遍历序列的最后一个，则返回空节点;
 * 二叉树一定不为空，且给定的节点一定不是空节点；
 * 样例
 * 假定二叉树是：[2, 1, 3, null, null, null, null]， 给出的是值等于2的节点。
 *
 * 则应返回值等于3的节点。
 *
 * 解释：该二叉树的结构如下，2的后继节点是3。
 *   2
 *  / \
 * 1   3
 */
public class JZ57二叉树的下一个结点 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode father;
        TreeNode(int x) { val = x; }
    }
    public TreeNode inorderSuccessor(TreeNode p) {
        // 情况1:
        // 这个点有右子树, 那么这个点的后继就是右子树的最左边的节点就是这个树的后继
        if (p.right != null) {
            p = p.right;
            while (p.left != null) p = p.left;
            return p;
        }

        // 情况2:
        // 这个点没有右子树, 但是这个点是父节点的左子树, 则输出父节点
        // 情况3:
        // 这个点没有右子树, 并且这个点是父节点的右子树, 则往上递归, 找到某个点是父节点的左儿子
        while (p.father != null && p == p.father.right) p = p.father;
        return p.father;
    }
}
