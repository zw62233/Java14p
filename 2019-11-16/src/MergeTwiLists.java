public class MergeTwiLists {
    private static Node mergeTwoLists(Node list1,Node list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        Node nhead = null;//新链表的头节点 尾节点
        Node nlast = null;

        Node cur1 = list1;//定义了两个引用,用来遍历
        Node cur2 = list2;

        while(list1 == null && list2 == null){
            if(cur1.val <= cur2.val){
                if(nhead == null){   //第一次插入
                    nhead = cur1;
                }else{
                    nlast.next = cur1;
                }
                nlast = cur1;
                cur1 = cur1.next;
            }else {
                if(nhead == null){
                    nhead = cur2;
                }else{
                    nlast.next = cur2;
                }
                nlast = cur2;
                cur2 = cur2.next;
            }
        }

        //有一个链表为空了
        if(cur1 != null){
            nlast.next = cur1;
        }else{
            nlast.next = cur2;
        }

        return nhead;
    }


    public static void main(String[] args) {
        Node a5 = new Node(5);
        Node a4 = new Node(4,a5);
        Node a3 = new Node(3,a4);
        Node a2 = new Node(2,a3);
        Node a1 = new Node(1,a2);

        Node b3 = new Node(23);
        Node b2 = new Node(25,b3);
        Node b1 = new Node(26,b2);

        Node r = mergeTwoLists(a1,b1);
        printList(r);
    }

    private static void printList(Node r) {
        for (Node cur = r;cur != null;cur = cur.next) {
            System.out.println(cur);
        }
    }
}
