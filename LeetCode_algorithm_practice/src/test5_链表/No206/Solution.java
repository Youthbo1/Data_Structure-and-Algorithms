package test5_链表.No206;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;//当前
    }

    public ListNode create(int[] arr,int n ){
        if(n==0)
            return null;

        ListNode head=new ListNode(arr[0]);

        ListNode curNode=head;
        for (int i = 1; i <n ; i++) {
            curNode.next=new ListNode(arr[i]);
            curNode=curNode.next;
        }

        return head;
    }

    public void printList(ListNode head){
        ListNode curNode=head;
        while (curNode!=null){
            System.out.print(curNode.val+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;

        ListNode head=new Solution().create(a,n);
        new Solution().printList(head);

        ListNode head2=new Solution().reverseList(head);
        new Solution().printList(head2);

    }
}
