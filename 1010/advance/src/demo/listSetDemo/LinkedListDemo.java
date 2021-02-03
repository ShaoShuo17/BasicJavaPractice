package demo.listSetDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("jkl");
        ll.addFirst("caps");
        ll.addLast("knight");
        ll.push("369");
        System.out.println(ll);
        String first = ll.getFirst();
        System.out.println(first);
        String last = ll.getLast();
        System.out.println(last);
        System.out.println(ll.isEmpty());

        String remove = ll.remove();
        System.out.println(remove);
        String s = ll.removeFirst();
        System.out.println(s);
        String s1 = ll.removeLast();
        System.out.println(s1);
        String pop = ll.pop();
        System.out.println(pop);
        System.out.println(ll.isEmpty());
    }
}
