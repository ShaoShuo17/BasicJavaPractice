package demo.demo;

public class BaoZhuangClass {
    public static void main(String[] args) {
        Integer a = new  Integer(100);//已过时
        System.out.println(a);
        Integer b = Integer.valueOf(200);//装箱静态方法
        System.out.println(b);
        int c = b.intValue()+100;//拆箱方法
        System.out.println(c);
        Integer d = 1;//自动装箱
        System.out.println(d);
        int e = d + 1;//自动拆箱
        System.out.println(e);
    }
}