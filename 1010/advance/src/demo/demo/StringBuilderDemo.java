package demo.demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        sb2.append(" world");
        System.out.println(sb2);
        String string = sb2.toString();
        System.out.println(string);
    }
}
