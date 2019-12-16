public class CopyList {
    public Node copy(Node head){
        Node nhead = null;
        Node nlast = null;

        Node cur = head;


        while(cur != null){
           Node node = new Node(cur.val);
           if(nhead == null){
               nhead = node;
           }else{
               nlast.next = node;
           }
            cur = cur.next;
        }

        return nhead;
    }
}
