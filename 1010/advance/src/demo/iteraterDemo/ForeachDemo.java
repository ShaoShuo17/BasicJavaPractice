package demo.iteraterDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//增强for循环foreach
public class ForeachDemo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int a :arr){
            System.out.println(a);
        }

        Collection<String> coll = new ArrayList<>();
        coll.add("sadf");
        coll.add("cbn");
        coll.add("rew");
        coll.add("hgjj");
        for (String s :coll){
            System.out.println(s);
        }
    }
}
