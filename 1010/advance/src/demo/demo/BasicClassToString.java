package demo.demo;

public class BasicClassToString {
    public static void main(String[] args) {
        String s = 100+"";
        System.out.println(s+"sadf");
        String s1 = Integer.toString(200);
        System.out.println(s1+"jkl");
        String s2 = String.valueOf(300);
        System.out.println(s2+"uiop");
        int i = Integer.parseInt("300");
        System.out.println(i+100);
    }
}
