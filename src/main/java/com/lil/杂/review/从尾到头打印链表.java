package com.lil.杂.review;


/**
 描述
 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 输入：
 {1,2,3}
 复制
 返回值：
 [3,2,1]

 示例2
 输入：
 {67,0,24,58}

 返回值：
 [58,24,0,67]

 */
public class 从尾到头打印链表 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            list.add(0, tmp.val);
            tmp = tmp.next;
        }
        return list;
    }*/

 /*   //递归
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }*/

    //使用栈
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode a = head, b = a.next;
        while (b == null) {
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        head.next = null;
        return a;
    }
}
