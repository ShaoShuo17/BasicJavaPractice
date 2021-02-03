package demo.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDiZhuV2 {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int index = 0;
        poker.put(index, "🃏");
        pokerIndex.add(index);
        index++;
        poker.put(index, "🃏");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> ontable = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer key = pokerIndex.get(i);
            if (i >= 51) {
                ontable.add(key);
            } else if (i % 3 == 0) {
                player1.add(key);
            } else if (i % 3 == 1) {
                player2.add(key);
            } else  {
                player3.add(key);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(ontable);

        lookPoker("player1",poker,player1);
        lookPoker("player2",poker,player2);
        lookPoker("player3",poker,player3);
        lookPoker("ontable",poker,ontable);
    }

    private static void lookPoker(String name, HashMap<Integer, String> poker,ArrayList<Integer> list) {
        System.out.print(name+" :{");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println("}");
    }
}
