import java.util.Arrays;

public class Stack {
    int[] arr;
    int size;

    public Stack(){
        size = 0;
    }

    public void push(int val){
        if(size == arr.length){
            arr = Arrays.copyOf(arr,2*size);
        }
        arr[size++]  = val;
    }
    public void pop(){
        if(size > 0){
            --size;
        }
    }
    public int peek(){
        return arr[size - 1];
    }
    public int  getSize(){
        return size;
    }

    public static void main(String[] args) {

    }
}
