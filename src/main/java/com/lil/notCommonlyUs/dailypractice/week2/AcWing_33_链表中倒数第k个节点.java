package com.lil.notCommonlyUs.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/5/2 9:18
 */

public class AcWing_33_链表中倒数第k个节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode findKthToTail(ListNode head, int k){
        if (head == null) return null;

        ListNode tail = head;
        int n = 0;
        while (tail != null){
            n++;
            tail = tail.next;
        }

        if (k > n) return null;

        ListNode q = head;
        for (int i = 0; i < n - k; i++) q = q.next;

        return q;
    }
}
