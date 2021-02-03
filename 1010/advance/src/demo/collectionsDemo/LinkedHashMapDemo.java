package demo.collectionsDemo;

import java.util.Hashtable;
import java.util.LinkedHashMap;

//有序
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("a", "a");
        lhm.put("s", "s");
        lhm.put("d", "d");
        lhm.put("f", "f");
        System.out.println(lhm);
        System.out.println("==============");
        //hashtable不允许存储空值空键,存null会报空指针异常NullPointerException
        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("guang","1");
        ht.put(null,"2");
        ht.put("zhao",null);
        System.out.println(ht);

    }
}
