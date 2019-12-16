public class PalindromeList {
    public int getLength(Node head){
        int len = 0;
        Node cur = head;
        while(cur != null){
            cur = cur.next;
            len++;
        }
        return len;
    }
    public Node getMiddle(Node head){
        Node cur = head;
        int len = 0;
        while(len == getLength(head)/2){
            cur = cur.next;
            len++;
        }
        return cur;
    }
    public Node reverseList(Node head){
        Node rhead = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;

            cur.next = rhead;
            rhead = cur;

            cur = cur.next;
        }

        return rhead;
    }
    public boolean chkPalindrome(Node a){
        Node middle = getMiddle(a);
        Node rHead = reverseList(middle);
        Node c1 = a;
        Node c2 = rHead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }

            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }
}
