import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C 语言");
        courses.add("Java SE");

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        list.add(6);
        list.add(0,7);
        list.addAll(list2);

        list.remove(0);
        list.remove("6");

        System.out.println(list.get(4));
        list.set(0,8);

        System.out.println(list.contains("6"));

    }
}
