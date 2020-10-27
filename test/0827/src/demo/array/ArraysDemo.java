package demo.array;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] a = {10,20,30};
        String str = Arrays.toString(a);
        System.out.println(str);

        int [] b = {21,3,52,42,115,17,19,523};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        String [] s = {"dsf","sdg","ytr"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        String string ="saagr1354g4ads4";
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
//        有关于util包里的Math数学类静态方法使用
        System.out.println(Math.abs(21));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-6));

        System.out.println(Math.ceil(6.3));
        System.out.println(Math.ceil(6.9));

        System.out.println(Math.floor(6.3));
        System.out.println(Math.floor(6.9));

        System.out.println(Math.round(6.3));
        System.out.println(Math.round(6.9));
    }
}
