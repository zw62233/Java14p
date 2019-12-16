class Node{
    int val;
    Node next;

    public Node(int val){
        this.val  = val;
    }
    public Node(int val,Node Next){
        this.val =val;
        this.next = next;
    }
}
public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue(){
        front = null;
        rear = null;
        int size = 0;
    }
    public void offer(int val){
        Node node = new Node(val);
        if(rear == null){
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
        size++;
    }
    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        Node oldHead = front;
        front = front.next;
        if (front == null) {
        rear = null;
        }
        size--;
        return oldHead.val;
    }

    public boolean IsEmpty (){
        return front == null;
    }

}
