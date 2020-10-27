package demo.String;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串是" + str1);

        char [] c = {'1','2','3'};
        String str2 = new String(c);
        System.out.println("第二个字符串是"+str2);

        byte [] b = {65,66,67,68};
        String str3 = new String(b);
        System.out.println("第三个字符串是"+str3);

        String str4 = "666";
        System.out.println(str4);
    }
}
