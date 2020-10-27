package demo.redMoney;

import java.util.ArrayList;

public class RedMoneyMain {
    public static void main(String[] args) {
        Manager manager = new Manager("okkc",100);
        Member one = new Member("one",0);
        Member two = new Member("two",0);
        Member three = new Member("three",0);
        manager.show();
        one.show();
        ArrayList<Integer> redlist = manager.send(20,3);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);
        manager.show();
        one.show();
    }
}
