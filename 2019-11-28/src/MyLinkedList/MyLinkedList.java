package MyLinkedList;

public class MyLinkedList implements MyList {

    private Node head;

    @Override
    public void pushFront(int elemet) {
         Node node = new Node();
         node.val = elemet;
         node.next = head;
         head = node;
    }

    @Override
    public void popFront() {
       head = head.next;
    }
}
