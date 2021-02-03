package demo.exceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        readFile("C://a.txt");
    }
    public static void readFile(String filePath)throws FileNotFoundException,IOException {
        if (!filePath.endsWith(".txt")){
            throw new IOException("文件格式不对");
        }
        if (filePath!="C://a.txt"){
            throw new FileNotFoundException("找不到此路径的文件");
        }
        else{
            System.out.println("okk");
        }
    }
}
