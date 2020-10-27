package demo.String;

public class StringPool {
    public static void main(String[] args) {
        //直接创建的STR在字符串常量池中
        String str1 = "abc";
        String str2 = "abc";
        char[] c = {'a', 'b', 'c'};
        //NEW的STR不在字符串常量池中
        String str3 = new String(c);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str2);
    }
}
