package demo.array;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTask {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int a = r.nextInt(33) + 1;
            listA.add(a);
            System.out.println(listA.get(i));
        }
        System.out.println("================");
        ArrayList<String> listB = new ArrayList<>();
        listB.add("字母歌");
        listB.add("巴特勒");
        listB.add("卡哇伊");
        listB.add("伊巴卡");
        System.out.println(listB);
        printListB(listB);
        System.out.println("================");
        ArrayList<Integer> listC = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            listC.add(num);
        }
        System.out.println(listC);
        ArrayList<Integer> listD = getListD(listC);
        System.out.println(listD);
    }
    public static void printListB(ArrayList<String> listB){
        System.out.print("{");
        for (int i = 0; i < listB.size()-1; i++) {
            System.out.print(listB.get(i)+"@");
        }
        System.out.println(listB.get(listB.size()-1)+"}");
    }
    public static ArrayList<Integer> getListD(ArrayList<Integer> listC){
        ArrayList<Integer> listD = new ArrayList<>();
        for (int i = 0; i < listC.size(); i++) {
            if (listC.get(i)%2==0){
                listD.add(listC.get(i));
            }
        }
        return listD;
    }
}
