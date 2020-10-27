package demo.String;

public class StringConvert {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = "hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str1 = "hello world,hello world";
        String o = str1.replace("o", "0");
        System.out.println(o);
        String s = str1.replace("lo", "10");
        System.out.println(s);
    }
}
