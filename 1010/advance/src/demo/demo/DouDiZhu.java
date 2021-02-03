package demo.demo;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("🃏");
        poker.add("🃏");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
//                System.out.print(color+number+"  ");
            }
        }
        System.out.println(poker);
        Collections.shuffle(poker);
        System.out.println(poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> ontable = new ArrayList<>();
        for (int i = 0; i < poker.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(poker.get(i));
            } else if (i % 3 == 1) {
                player2.add(poker.get(i));
            } else {
                player3.add(poker.get(i));
            }
        }
        ontable.add(poker.get(poker.size() - 1));
        ontable.add(poker.get(poker.size() - 2));
        ontable.add(poker.get(poker.size() - 3));
        System.out.println(player1.size());
        System.out.println(player1);
        System.out.println(player2.size());
        System.out.println(player2);
        System.out.println(player3.size());
        System.out.println(player3);
        System.out.println(ontable);
    }
}
