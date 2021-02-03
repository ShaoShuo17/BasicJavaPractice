package demo.collectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSaveOwnClass {
    public static void main(String[] args) {
        HashMap<String,Person> map = new HashMap<>();
        map.put("上",new Person("廉颇",52));
        map.put("中",new Person("嬴政",23));
        map.put("下",new Person("马克",26));
        map.put("野",new Person("李白",32));
        map.put("辅",new Person("孙膑",36));
        //map.put("辅",new Person("牛魔",41));
        Set<Map.Entry<String, Person>> entries = map.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("======================");
        HashMap<Person,String> civilization = new HashMap<>();
        civilization.put(new Person("成吉思汗",36),"蒙古");
        civilization.put(new Person("秦始皇",23),"中国");
        civilization.put(new Person("维多利亚",28),"大英帝国");
        civilization.put(new Person("成吉思汗",36),"欧罗巴");
        Set<Map.Entry<Person, String>> entries1 = civilization.entrySet();
        for (Map.Entry<Person, String> civic : entries1) {
            System.out.println(civic);
        }
    }
}
