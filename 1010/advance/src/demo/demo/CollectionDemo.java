package demo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
//Collection集合类共有方法
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);
        collection.add("fghj");
        collection.add("hgf");
        System.out.println(collection);
        collection.add("ewtr");
        collection.add("oiu");
        System.out.println(collection);
        boolean oiu = collection.remove("oiu");
        System.out.println(oiu);
        System.out.println(collection);
        boolean b = collection.contains("jkl");
        System.out.println(b);
        boolean b1 = collection.contains("hgf");
        System.out.println(b1);
        boolean b2 = collection.isEmpty();
        System.out.println(b2);
        int size = collection.size();
        System.out.println(size);
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        collection.clear();
        System.out.println(collection.isEmpty());
    }
}
