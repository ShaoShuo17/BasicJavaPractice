package demo.listSetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhsd = new LinkedHashSet<>();//存取有序
        lhsd.add("uiop");
        lhsd.add("sdf");
        lhsd.add("vcb");
        lhsd.add("sdf");
        System.out.println(lhsd);
    }
}
