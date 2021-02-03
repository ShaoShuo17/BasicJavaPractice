package demo.objectDemo;

import java.util.ArrayList;
import java.util.Random;

public class ObjectToStringDemo {
    public static void main(String[] args) {
        Person person = new Person("adk",22);
        String s = person.toString();
        System.out.println(s);
        System.out.println(person);
        Random r = new Random();
        System.out.println(r);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
