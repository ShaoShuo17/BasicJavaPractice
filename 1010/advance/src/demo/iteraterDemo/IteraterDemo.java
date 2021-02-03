package demo.iteraterDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteraterDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("hjk");
        coll.add("uio");
        coll.add("hfn");
        coll.add("uye");
        System.out.println(coll);

        Iterator<String> it = coll.iterator();
        for (int i = 0; i < coll.size(); i++) {
            boolean b = it.hasNext();
            if (b == true) {
                String s = it.next();
                System.out.println(s);
            }
        }
    }
}
