package com.lil.leetcode.week2;

import java.util.List;
import java.util.zip.DeflaterOutputStream;

/**
 * @author Lil
 * @date 2022/04/09 14:59
 **/
public class LeetCode_24_两两交换链表中的节点 {
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

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        System.out.println("dummy.val" + dummy.val);

        for (ListNode p = dummy; p.next != null && p.next.next != null; ) {

            ListNode a = p.next, b = a.next;
            System.out.println("p:" + p.val);
            System.out.println("a:" + a.val);
            System.out.println("b:" + b.val);
            System.out.println("=========================");
            p.next = b;
            a.next = b.next;
            b.next = a;
            p = a;
            System.out.println(p.val + " " + p.next.val + " " + b.next.next.val);
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }

}