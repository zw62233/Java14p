import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack(){
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int x){
        st.push(x);
        if(minst.isEmpty()|| x <= minst.peek()){
            minst.push(x);
        }
    }
    public void pop(){
        int s1 =st.peek();
        int s2 = minst.peek();
        if(s1 == s2){
            minst.pop();
        }
        st.pop();
    }

    public int getMin(){
        return minst.peek();
    }

    public static void main(String[] args) {

    }
}
