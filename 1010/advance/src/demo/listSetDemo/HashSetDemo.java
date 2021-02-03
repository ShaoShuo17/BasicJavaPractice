package demo.listSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//在使用add方法时调用hashCode方法和equals方法来避免重复元素添加
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(6);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
