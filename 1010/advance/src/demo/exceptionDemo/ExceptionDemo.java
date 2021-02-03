package demo.exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2020-10-10");//解析异常，抛出即可，或者try/catch代码块
        System.out.println(date);

        int [] arr = {1,2,3,4};
        try {
            System.out.println(arr[4]);//索引越界异常
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("try/catch可以执行后续代码");
    }
}
