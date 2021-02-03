package demo.fileDemo;

import java.io.File;

public class FileGetDemo {
    public static void main(String[] args) {
        File f1 = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\fileDemo");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        String path = f1.getPath();
        System.out.println(path);
        String name = f1.getName();
        System.out.println(name);
        long length = f1.length();
        System.out.println(length);
        System.out.println("--------------------");
        File f2 = new File("b.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
        String path1 = f2.getPath();
        System.out.println(path1);
        String name1 = f2.getName();
        System.out.println(name1);
        long length1 = f2.length();
        System.out.println(length1);
    }
}
