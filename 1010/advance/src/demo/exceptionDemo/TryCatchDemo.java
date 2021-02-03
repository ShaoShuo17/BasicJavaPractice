package demo.exceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            readFile("a.txt");
        } catch (IOException e) {
            System.out.println("catah---allalal  "+e.getMessage());
        }finally {
            //无论是否出现异常，都会执行,finally中避免有return语句
            System.out.println("finally代码块的内容都会执行");
        }
        System.out.println("后续代码");
    }
    public static void readFile(String filePath)throws FileNotFoundException, IOException {
//        if (!filePath.endsWith(".txt")){
//            throw new IOException("文件格式不对");
//        }
        if (filePath!="C://a.txt"){
            throw new FileNotFoundException("找不到此路径的文件");
        }
        else{
            System.out.println("okk");
        }
    }
}
