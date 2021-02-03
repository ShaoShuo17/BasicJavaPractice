package demo.listSetDemo;

import java.util.ArrayList;
import java.util.List;
//list的子集有:ArrayList,LinkedList
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("karsa");
        list.add("world");
        System.out.println(list);
        list.add(2,"369");
        System.out.println(list);
        String remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list);
        String keep = list.set(0, "keep");
        System.out.println(keep);
        System.out.println(list);
        String s = list.get(2);
        System.out.println(s);
        System.out.println(list);
    }
}
