package demo.fileDemo;

import java.io.File;
//判断文件存在，以及是目录或者文件
public class FileJudgeDemo {
    public static void main(String[] args) {
        File f1 = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\fileDemo");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println("------------");
        File f2 = new File("b.txt");
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
