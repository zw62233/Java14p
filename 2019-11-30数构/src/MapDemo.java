import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("QAQ","QWQ");
        map.put("Q","A");
        map.put("哈希辣妈","马达啦");
        for(Map.Entry<String,String> Entry : map.entrySet()){
            System.out.println(Entry.getKey()+"--->"+Entry.getValue());
        }
        System.out.println("=================================================");
        map.put("迈特凯","夜凯！！");
        map.put("QAQ","sblx");
        for(Map.Entry<String,String> Entry : map.entrySet()){
            System.out.println(Entry.getKey()+"--->"+Entry.getValue());
        }

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("Q"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("===============================================");
        System.out.println(map.containsKey("Q"));
        System.out.println(map.containsKey("QSAQ"));
        System.out.println(map.containsKey("QAQ"));
        System.out.println(map.containsValue("sblx"));

    }
}
