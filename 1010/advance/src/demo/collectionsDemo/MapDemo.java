package demo.collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String asd = map.put("asd", "15");
        System.out.println(asd);
        String asd1 = map.put("asd", "465");
        System.out.println(asd1);
        map.put("drose", "bulls");
        map.put("dwade", "heat");
        map.put("kobe", "lakers");
        System.out.println(map);
        String remove = map.remove("asd");
        System.out.println(remove);
        System.out.println(map);
        String drose = map.get("drose");
        System.out.println(drose);
        boolean kobe = map.containsKey("kobe");
        System.out.println(kobe);
        System.out.println("==========第一种遍历方法===========");
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + ":" + map.get(next));
        }
        System.out.println("==========第二种遍历方法===============");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
