package com.lil.leetcode;

/**
 * @author Lil
 * @date 2022/03/18 02:53
 **/


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

public class LeetCode_2_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummary = new ListNode(-1);
        ListNode cur = dummary;
        int t = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }

            cur.next = new ListNode(t % 10);
            cur = cur.next;
            t = t / 10;
        }
        if (t != 0) {
            cur.next = new ListNode(t);
        }
        return dummary.next;
    }

}