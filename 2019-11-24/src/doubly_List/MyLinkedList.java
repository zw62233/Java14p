package doubly_List;

public class MyLinkedList {
    Node head;
    Node last;
    int size = 0;

    public void pushFront(int val){
        Node node = new Node(val);
        if(size == 0 ){
            head = last =node;
        }
        node.next = head;
        head = node;

        size++;
    }
    public void popFront(){
        if(size == 0){
            throw new RuntimeException("空的");
        }
        if(size == 1){
            head = last =null;
        }
        head = head.next;
        head.prve = null;
        size --;
    }
    public void pushBack(int val){
        Node node = new Node(val);
        if(size == 0){
            head = last =node;
        }
        node.prve = last;
        last.next = node;
        last = node;

        size++;
    }
    public void popBack(){
        if(size == 0){
            throw new RuntimeException("空的");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

