package demo.String;

public class StringGet {
    public static void main(String[] args) {
        int length = "dhfaskdglkjasdf".length();
        System.out.println(length);
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        char c = "qwerdf".charAt(3);
        System.out.println(c);

        int low = str3.indexOf("low");
        System.out.println(low);
    }
}
