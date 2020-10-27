package demo.javaBean;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println(num);
        for (int i = 0; i < 10; i++) {
            int s=random.nextInt(20);
            System.out.println(s);
        }
    }
}
