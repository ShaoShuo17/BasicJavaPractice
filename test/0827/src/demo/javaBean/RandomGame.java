package demo.javaBean;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("your guess");
        int guess = scanner.nextInt();
        while (true) {
            if (guess > num) {
                System.out.println("too big ,guess again");
                guess = scanner.nextInt();
            } else if (guess == num) {
                System.out.println("bingo");
                break;
            } else {
                System.out.println("too samll,guess again");
                guess = scanner.nextInt();
            }
        }
        System.out.println("over!");
    }
}
