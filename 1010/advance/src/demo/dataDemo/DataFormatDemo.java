package demo.dataDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatDemo {
    public static void main(String[] args) throws ParseException {
        data1();
        System.out.println("===================");
        data2();
    }

    private static void data2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = sdf.parse("2028-10-11 14-40-12");
        System.out.println(date);
    }

    private static void data1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}
