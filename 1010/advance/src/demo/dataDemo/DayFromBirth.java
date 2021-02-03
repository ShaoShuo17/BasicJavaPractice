package demo.dataDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayFromBirth {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String birth = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        long time0 = date.getTime();
        System.out.println(time0);//基于时间原点的出生时间
        Date data1 = new Date();
        System.out.println(data1);//当前系统时间
        long time1 = data1.getTime();
        System.out.println(time1);//基于时间原的当前时间
        long day = (time1 - time0) / 86400000;
        System.out.println(day);

    }
}
