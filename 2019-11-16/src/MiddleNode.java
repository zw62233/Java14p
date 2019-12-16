public class MiddleNode {
    public Node middleNode(Node head){
        int len = 0;
        Node cur = head;
        while(cur != null){
            len +=1;
            cur = cur.next;
        }
        System.out.println("链表长:"+len);

        return head;
    }


    public static void main(String[] args) {

    }
}
