package demo.recursionDemo;

import java.io.File;

public class RecursionListDirDemo {
    public static void main(String[] args) {
        File file = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\recursionDemo");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            }
            String string = file.toString().toLowerCase();
            if (string.endsWith(".java")) {
                System.out.println(file);
            }
        }
    }
}
