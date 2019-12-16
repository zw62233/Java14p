import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDome {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add("卡裂！");
        list.add("Q尾");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for(String s : list){
            System.out.println(s);
        }
        Object[] objarr = list.toArray();
        System.out.println(objarr);


        Collection<String> list2 = new LinkedList<>();
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());

        list2.add("哈希辣妈");
        list2.add("五里瓦马达啦");

        for(String l : list2){
            System.out.println(l);
        }
        list2.remove("五里瓦马达啦");
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());

    }
}
