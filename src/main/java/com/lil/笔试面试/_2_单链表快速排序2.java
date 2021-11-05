package com.lil.笔试面试;

/**
 * @author Lil
 * @date 2021/10/27 23:20
 */
public class _2_单链表快速排序2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode quickSortList(ListNode head) {
        if (head == null || head.next == null) {
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
            }
            else if (head.val == midVal) {
                mtail.next = head;
                mtail = mid.next;
            }else {
                rtail.next = head;
                rtail = rtail.next;
            }
            head = head.next;
        }

        ltail.next = mtail.next = rtail.next = null;

        //递归
        left.next = quickSortList(left.next);
        right.next = quickSortList(right.next);

        //连接
        getTail(left.next).next = mid.next;
        getTail(left.next).next = right.next;

        return left.next;
    }

    static ListNode getTail(ListNode head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

}
