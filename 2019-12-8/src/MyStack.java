
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> a;
    public MyStack(){
        a = new LinkedList<>();
    }
    public void push(int x){
        a.offer(x);
    }
    public int pop(){
        int sz = a.size();
        while(sz > 1){
            a.offer(a.poll());
        }
        return a.poll();
    }
    public int top (){
        int sz = a.size();
        while(sz > 1){
            a.offer(a.poll());
        }
        int s = a.poll();
        a.offer(s);
        return s;
    }
    public boolean IsEmpty(){
        return a.isEmpty();
    }
}
