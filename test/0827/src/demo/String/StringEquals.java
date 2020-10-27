package demo.String;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char [] c = {'h','e','l','l','o'};
        String str3 = new String(c);
        String str4 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));

        System.out.println(str3.equals("hello"));//不推荐变量写在前面
        System.out.println("hello".equals(str1));//推荐字符串常量写在前面

        System.out.println(str2.equals(str4));//区分大小写
        System.out.println(str2.equalsIgnoreCase(str4));//忽略大小写
    }
}
