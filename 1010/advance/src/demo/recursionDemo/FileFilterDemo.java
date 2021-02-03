package demo.recursionDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilterDemo {
    public static void main(String[] args) {
        File file = new File("C:\\SoftWare\\IDEASpace\\1010\\advance\\src\\demo\\recursionDemo");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() ||name.toLowerCase().endsWith(".java");
            }
        });*/
        File[] files = dir.listFiles((File d, String name) ->
                new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java")
        );
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            }
            System.out.println(file);
        }
    }
}
