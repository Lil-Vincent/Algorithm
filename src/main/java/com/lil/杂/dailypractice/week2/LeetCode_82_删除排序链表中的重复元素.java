package com.lil.杂.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/4/28 18:10
 */
public class LeetCode_82_删除排序链表中的重复元素 {
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;

        while (p.next != null){
            ListNode q = p.next;
            while (q != null && p.next.val == q.val) q = q.next;
            //中间有一个不同的, p 跳到下一个节点(三个连续不同节点)
            if (p.next.next == q) p = p.next;
            //中间有相同节点, 删除中间节点
            else p.next = q;
        }
        return dummy.next;
    }
}
