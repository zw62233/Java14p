public class Partition {
    public Node partition(Node head ,int x){
        Node cur = head;
        Node shead = null;
        Node slast = null;
        Node bhead = null;
        Node blast = null;

        while (cur != null) {
            if (cur.val < x) {
                if (shead == null) {
                    shead = cur;
                } else {
                     slast.next = cur;
                }
              slast = cur;

            } else {
                if (bhead == null) {
                    bhead = cur;
                } else {
                     blast.next = cur;
                }
              blast = cur;
            }
            cur = cur.next;
        }
        //if一方为空
        if(shead == null){
            return bhead;
        }
        if(bhead == null){
            return shead;
        }
        slast.next = bhead;
        return shead;
    }
    public static void main(String[] args) {
        Node a5 = new Node(25);
        Node a4 = new Node(20);
        Node a3 = new Node(15);
        Node a2 = new Node(10);
        Node a1 = new Node(5);


    }
}
