import java.util.ArrayList;

public class Test{
    public static void main(String[] args) {
        try{
            new ArrayList<>().get(2);
        }catch (RuntimeException e){
            throw new MyException("下标越界");
        }
    }
}
