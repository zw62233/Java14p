public class CopyrNode {
    public static rNode cpoyrNode(rNode head){
        if (head == null) {
          return null;
        }
        rNode cur = head;

        while(cur != null){//穿成一条链表（复制与被复制的）
            rNode node = new rNode();
             node.val = cur.val;

             node.next = cur.next;
             cur.next = node;

             cur = cur.next;
        }//配置Random引用
        cur = head;
        while (cur != null){
            if(cur.Random != null) {
                cur.next.Random = cur.Random.next;
            }
            cur = cur.next.next;
        }
        //解开两条链表
        cur = head;
        rNode nhead = head.next;
        while(cur != null){
            rNode node = cur.next;

            cur.next = node.next;
            if(node.next != null){
            node = node.next.next;
            }

            cur = cur.next;
        }

     return nhead;
    }
}
