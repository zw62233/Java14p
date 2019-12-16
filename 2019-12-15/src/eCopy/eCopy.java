package eCopy;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}
public class eCopy {
    public ListNode copy(ListNode head){
        ListNode nhead = null;
        ListNode p = null;
        ListNode cur = head;
        if(head == null ){
            return null;
        }
        while(cur.next != null){
            ListNode node = cur;
            if(nhead == null){
                nhead = node;
                p = nhead;
            }
            p.next = node;
            cur = cur.next;
        }
        return nhead;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        eCopy a = new eCopy();
       ListNode nh= a.copy(n1);
    }
}
