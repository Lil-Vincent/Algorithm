package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/08 20:51
 **/


public class LeetCode_19_删除链表的倒数第N个节点 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int n = 0;
        for (ListNode p = dummy; p != null; p = p.next) n++;

        ListNode p = dummy;
        for (int i = 0; i < n - k - 1; i++) p = p.next;

        p.next = p.next.next;

        return dummy.next;

    }

}