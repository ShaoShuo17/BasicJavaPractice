package demo.genericDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        //withoutGeneric();//不使用泛型存在弊端
        withGeneric();
        //泛型通配符的使用
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");

        printArray(list1);
        printArray(list2);
    }

    private static void printArray(ArrayList<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void withGeneric() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hjk");
        list.add("12");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            System.out.println(next.length());
        }
    }

    private static void withoutGeneric() {
        ArrayList list = new ArrayList();
        list.add("hjk");
        list.add(12);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            String s = (String) next;
            System.out.println(s.length());
        }
    }
}
