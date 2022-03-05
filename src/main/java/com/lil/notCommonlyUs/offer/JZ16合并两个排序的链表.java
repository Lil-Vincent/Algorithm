package com.lil.notCommonlyUs.offer;

/**
 描述
 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 示例1
 输入：
 {1,3,5},{2,4,6}

 返回值：
 {1,2,3,4,5,6}

 */
public class JZ16合并两个排序的链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode i = l1, j = l2;
        while (i != null && j != null) {
            if (i.val < j.val) {
                cur.next = i;
                cur = i;
                i = i.next;
            }
            else {
                cur.next = j;
                cur = j;
                j = j.next;
            }
        }
        if (i != null) cur.next = i;
        if (j != null) cur.next = j;
        return dummy.next;
    }
}
