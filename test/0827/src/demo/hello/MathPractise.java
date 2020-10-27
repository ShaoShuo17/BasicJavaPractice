package demo.hello;

import java.util.Arrays;

public class MathPractise {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int counter = 0;
        for (double i = Math.ceil(min); i <= Math.floor(max); i++) {
            if (Math.abs(i) > 6 || Math.abs(i) <= 2.1) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(counter);
    }
}
