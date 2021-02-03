package demo.collectionsDemo;

import demo.listSetDemo.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 12, 23);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "as", "we", "all", "know");
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("sadf", 21));
        humans.add(new Human("rtw", 41));
        humans.add(new Human("hjfg", 28));
        System.out.println(humans);

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(humans);
    }
}
