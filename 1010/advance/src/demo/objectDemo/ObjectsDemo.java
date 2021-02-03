package demo.objectDemo;

import java.util.Objects;
//Object类的equals方法可以避免抛出空指针异常
public class ObjectsDemo {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aaa";
//        boolean b = s1.equals(s2);
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }
}
