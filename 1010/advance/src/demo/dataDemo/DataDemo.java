package demo.dataDemo;

import javax.xml.crypto.Data;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        getData();
    }

    private static void getData() {
        Date date = new Date();
        System.out.println(date);//当前系统时间
        Date date1 = new Date(1222222222l);
        System.out.println(date1);//基于时间原点的时间
        long time = date1.getTime();
        System.out.println(time);//基于时间原点经历了多少时间
    }
}
