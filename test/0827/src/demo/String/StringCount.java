package demo.String;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scan.next();
        char[] array = str.toCharArray();
        int big = 0, small = 0, num = 0, other = 0;
        for (int i = 0; i < array.length; i++) {
            if ('A' <= array[i] && array[i] <= 'Z') {
                big++;
            }else if ('a' <= array[i] && array[i] <= 'z'){
                small++;
            }else if ('0' <= array[i] && array[i] <= '9'){
                num++;
            }else {
                other++;
            }
        }
        System.out.println("big:"+big);
        System.out.println("small:"+small);
        System.out.println("num:"+num);
        System.out.println("other:"+other);
    }
}
