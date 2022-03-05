package com.lil.杂.笔试面试;

/**
 * @author Lil
 * @date 2021/10/27 23:20
 */
public class _2_单链表快速排序 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode quickSortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        int midVal = head.val;
        ListNode left = new ListNode(-1);
        ListNode mid = new ListNode(-1);
        ListNode right = new ListNode(-1);

        ListNode ltail = left, mtail = mid, rtail = right;


        while (head != null) {
            if (head.val < midVal) {
                ltail.next = head;
                ltail = ltail.next;
            }else if (head.val == midVal) {
                mtail.next = head;
                mtail = mtail.next;
            }else {
                rtail.next = head;
                rtail = rtail.next;
            }
            head = head.next;
        }

        //确定结束的节点
        ltail.next = mtail.next = rtail.next = null;

        //递归左节点和右节点
        left.next = quickSortList(left.next);
        right.next = quickSortList(right.next);

        //连接三个
        get_tail(left).next = mid.next;
        get_tail(left).next = right.next;

        return left.next;
    }

    static ListNode get_tail(ListNode head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
