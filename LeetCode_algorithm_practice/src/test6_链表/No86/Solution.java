package test6_链表.No86;

import data_structure.ListNode;

/**
 * \Date: 2017/12/14
 * \
 * \Description:86. Partition List
 * \给出一个链表以及一个数x，将链表重新整理，使得小于x的元素在前；大于等于x的元素在后。
 * - 如 1->4->3->2->5->2，x=3
 * - 返回 1->2->2->4->3->5
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode little_start = new ListNode(0);
        ListNode little_end = little_start;
        ListNode big_start = new ListNode(0);
        ListNode big_end = big_start;
        ListNode pListNode = head;
        while (pListNode != null) {
            if (pListNode.val < x) {
                little_end.next = pListNode;
                little_end = pListNode;
            } else {//>=x
                big_end.next = pListNode;
                big_end = pListNode;
            }
            pListNode = pListNode.next;
        }

        little_start = little_start.next;
        big_start = big_start.next;

        if (little_start != null) {
            big_end.next = null;
            little_end.next = big_start;
            return little_start;
        } else
            return big_start;

    }
}