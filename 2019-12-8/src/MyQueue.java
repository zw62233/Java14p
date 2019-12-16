import java.util.Stack;

public class MyQueue {
    Stack<Integer>  st1;
    Stack<Integer>  st2;
    public MyQueue(){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    public void push(int x){
        st1.push(x);
    }
    public void pop(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.pop();
    }
    public int peek(){
       if(st2.isEmpty()) {
           while (!st1.isEmpty()) {
               st2.push(st1.pop());
           }
       }
        return st2.peek();
    }
    public boolean IsEmpty(){
        return st1.isEmpty()&&st2.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(55);
        queue.push(56);
        queue.push(57);
        queue.push(58);

        System.out.println(queue.peek());//55
        queue.pop();
        queue.push(59);
        queue.push(60);

        System.out.println(queue.peek());//56
    }
}
