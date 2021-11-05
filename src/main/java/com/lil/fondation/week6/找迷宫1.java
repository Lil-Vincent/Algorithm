package com.lil.fondation.week6;

/**
 * @author Lil
 * @date 2021/7/13 12:35
 */
import javax.swing.tree.TreeNode;
import java.util.*;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 找迷宫1 {
    static int row = 0;
    static int col = 0;
    static int[][] matrix = null;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        col = scan.nextInt();

        matrix = new int[row][col];

        //保存地图
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println(bfs());

    }


    public static int bfs(){
        Queue<Node> q = new LinkedList();//维护队列，用于保存路径
        int[][] dis = new int[row][col];//表示从左上角开始到达当前位置走了多远距离
        //上下左右
        int[] r = new int[]{1,0,-1,0};
        int[] c = new int[]{0,1,0,-1};
        //将起点添加进队列
        q.offer(new Node(0, 0));

        while(!q.isEmpty()){
            //每次都处理队列的头结点
            Node curHead = q.poll();
            //当扫描到了右下角的位置时说明搜索完毕，退出循环
            if(curHead.x == row - 1 && curHead.y == col - 1){
                break;
            }

            //进行上下左右的查找
            for(int i=0; i<4; i++){
                int newx = curHead.x + r[i];
                int newy = curHead.y + c[i];

                //当新位置在合法范围内并且新位置的元素为0且没有被访问过的请情况下才可以继续查找
                if(newx >= 0 && newx < row && newy >= 0 && newy < col && dis[newx][newy] == 0 && matrix[newx][newy] == 0){
                    //将新节点添加进队列
                    q.offer(new Node(newx, newy));
                    //记录距离
                    dis[newx][newy] = dis[curHead.x][curHead.y] + 1;
                }
            }
        }

        return dis[row - 1][col - 1];
    }

    class Solution {
        public boolean searchArray(int[][] array, int target) {
            int n = array.length, m = array[0].length;
            if (n == 0 || m == 0) {
                return false;
            }
            int i = 0;
            int j = m - 1;
            while (i < n && j >= 0) {
                if (array[i][j] == target) return true;
                if (array[i][j] > target) j--;
                else i++;
            }
            return false;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> map;

    public TreeNode dfs(int[] preorder,int[] inorder, int pl, int pr, int il, int ir) {
        if (pl > pr) return null;
        TreeNode res = new TreeNode(preorder[pl]);
        int k = map.get((preorder[pl])) - il;
        res.left = dfs(preorder,inorder,pl + 1, pl + k, il, il + k - 1);
        res.right = dfs(preorder,inorder,pl + k + 1, pr, il + k + 1, ir);
        return res;


    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        return dfs(preorder,inorder,0, preorder.length - 1, 0, inorder.length - 1);
    }

    }

