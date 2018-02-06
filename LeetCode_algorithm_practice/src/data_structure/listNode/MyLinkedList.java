package data_structure.listNode;


public class MyLinkedList {
    ListNode head = null;

    //插入数据 尾部
    public void addListNode(int d) {
        ListNode newListNode = new ListNode(d);
        if (head == null) {
            head = newListNode;
            return;
        }

        ListNode tmp = head;
        //遍历到尾部空节点
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newListNode;
    }

    public int length() {
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    public Boolean deleteListNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        ListNode preListNode = head;
        ListNode curListNode = preListNode.next;

        while (curListNode != null) {
            if (i == index) {
                preListNode.next = curListNode.next;
                return true;
            }
            preListNode = curListNode;
            curListNode = curListNode.next;
            i++;
        }
        return true;
    }

    public ListNode create(int[] arr, int n) {
        if (n == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);

        ListNode curListNode = head;
        for (int i = 1; i < n; i++) {
            curListNode.next = new ListNode(arr[i]);
            curListNode = curListNode.next;
        }

        return head;
    }

    public void printList(ListNode head) {
        ListNode curListNode = head;
        while (curListNode != null) {
            System.out.print(curListNode.val + "->");
            curListNode = curListNode.next;
        }
        System.out.println("NULL");
    }

    public ListNode orderList() {
        ListNode nextNode = null;
        int temp = 0;
        ListNode curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.val > nextNode.val) {
                    temp = curNode.val;
                    curNode.val = nextNode.val;
                    nextNode.val = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    //翻转链表
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;//当前
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;

        ListNode head = new MyLinkedList().create(a, n);
        new MyLinkedList().printList(head);

        ListNode head2 = new MyLinkedList().reverseList(head);
        new MyLinkedList().printList(head2);

    }
}
