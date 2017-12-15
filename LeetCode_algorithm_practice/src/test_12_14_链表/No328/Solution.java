package test_12_14_链表.No328;

import data_structure.ListNode;

/**
 * \Date: 2017/12/14
 * \
 * \Description:
 * \
 * 给出一个链表，将链表重新整理，使得所有索引为奇数的节点排在索引为偶数的节点前面。
 * 如 1->2->3->4->5->NULL
 * 返回 1->3->5->2->4->NULL
 * 第一个节点的索引为1
 * 奇数索引的节点和偶数索引的节点在重新整理后要保持相对顺序。
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;//链表当前节点
        int i = 1;
        ListNode odd = new ListNode(0);//奇数链表头
        ListNode oddEnd = odd;//奇数链表尾
        ListNode even = new ListNode(0);//偶数链表头
        ListNode evenEnd = even;//偶数链表尾
        while (current != null) {
            if (i % 2 == 1) {
                oddEnd.next = new ListNode(current.val);
                oddEnd = oddEnd.next;
            } else {
                evenEnd.next = new ListNode(current.val);
                evenEnd = evenEnd.next;
            }
            i++;
            current = current.next;
        }
        oddEnd.next = even.next;
        return odd.next;
    }
}
