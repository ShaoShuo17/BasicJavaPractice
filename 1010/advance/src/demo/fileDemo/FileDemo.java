package demo.fileDemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//File类静态的成员变量pathSeparator
        System.out.println(pathSeparator);
        String separator = File.separator;//File类静态的成员变量separator
        System.out.println(separator);
        //File类的三种构造方法
        File f1 = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\fileDemo");
        System.out.println(f1);
        File f2 = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\","demo");
        System.out.println(f2);
        File parent = new File("sadf:");
        File f3 = new File(parent,"jkl;");
        System.out.println(f3);
    }
}
