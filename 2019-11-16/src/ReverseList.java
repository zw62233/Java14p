public class ReverseList {
    public static Node reverseList(Node head){

         Node nhead = null;//新建链表,nhead是头节点
         Node p1 = head;

         while(p1 != null) {
            Node p2 = p1.next;
            nhead = p1;
            p1 = p2;
         }
         return nhead;
    }

    public static void main(String[] args) {
         Node head = bulidList();
         Node reHead = reverseList(head);
         printList(head);
    }

    private static Node bulidList() {
        Node head = null;
        Node a1 = new Node(55);
        Node a2 = new Node(56,a1);
        Node a3 = new Node(57,a2);
        return head;
    }

    private static void printList(Node head) {
            for (Node cur = head;cur != null;cur = cur.next) {
                System.out.println(cur);
            }
    }
}
