package demo.dataDemo;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(1));
        calendar.set(1,2088);
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        calendar.add(2,2);
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        Date time = calendar.getTime();
        System.out.println(time);
    }


}
