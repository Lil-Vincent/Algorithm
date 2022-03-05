package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/7/19 7:44
 */
public class JZ14链表中倒数最后k个结点 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode findKthToTail(ListNode pListHead, int k) {
          int n = 0;
          for (ListNode p = pListHead; p != null; p = p.next) n ++;
          if (k > n) return null;
          ListNode p = pListHead;
          for (int i = 0; i < n - k; i ++) p = p.next;
          return p;
    }

    public ListNode findKthToTail1(ListNode pListHead, int k) {
          int n = 0;
          ListNode p = pListHead;
          while (p != null) {
              p = p.next;
              n ++;
          }
          if (k > n) return null;
          ListNode q = pListHead;
          for (int i = 0; i < n - k; i++) q = q.next;
          return q;
    }
}
