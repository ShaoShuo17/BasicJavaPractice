package demo.array;

public class Array {
    public static void main(String[] args) {
        int[] score = new int[10];
        String[] str = new String[]{"hello", "world", "time", "homie", "skr"};
        int[] num = {1, 2, 3};
        score[2] = 20;
        System.out.println(str[2]);
        System.out.println(score[2]);
        System.out.println(num[2]);
        //str.fori
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
