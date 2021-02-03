package demo.demo;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 99; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
        System.out.println("=================");
        int [] before = {1,2,3,4,5,6};
        int[] after = {7,8,9,10,11};
        System.arraycopy(before,1,after,1,2);
        System.out.println(Arrays.toString(after));
        //System.arraycopy();
    }
}
