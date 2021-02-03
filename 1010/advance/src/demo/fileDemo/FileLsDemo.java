package demo.fileDemo;

import java.io.File;

//遍历目录
public class FileLsDemo {
    public static void main(String[] args) {
        File f1 = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\fileDemo");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("============");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
