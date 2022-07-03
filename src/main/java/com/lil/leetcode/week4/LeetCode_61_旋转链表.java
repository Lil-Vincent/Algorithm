package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/03 14:46
 **/
public class LeetCode_61_旋转链表 {

    public class ListNode {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) n++;
        k %= n;
        if (k == 0) return head;
        ListNode tail = head;
        for (int i = 0; i < n - k - 1; i++) tail = tail.next;
        ListNode p = head;
        while (p.next != null) p = p.next;
        p.next = head;
        head = tail.next;
        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 7, 8, 9, 10};
//        new ListNode<Integer>(a)
    }
}