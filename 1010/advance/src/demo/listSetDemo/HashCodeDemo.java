package demo.listSetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {
    public static void main(String[] args) {
        Human human = new Human();
        int i = human.hashCode();
        System.out.println(i);
        System.out.println(human);
        System.out.println("===================");
        Set<Human> humanSet = new HashSet<>();
        Human one = new Human("jkl", 21);
        Human two = new Human("jkl", 21);
        Human three = new Human("369", 20);
        System.out.println(one == two);
        System.out.println(one.equals(two));
        System.out.println("=================");
        humanSet.add(one);
        humanSet.add(two);
        humanSet.add(three);
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        for (Human human1 : humanSet) {
            System.out.println(human1);
        }
    }
}
