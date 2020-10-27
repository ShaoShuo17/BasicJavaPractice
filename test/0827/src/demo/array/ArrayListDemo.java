package demo.array;

import demo.javaBean.Student;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //正常泛型只允许使用引用类型
        ArrayList<Student> al = new ArrayList<>();
        Student one = new Student("迪丽热巴", 22);
        Student two = new Student("马儿扎哈", 34);
        Student three = new Student("伊戈达拉", 30);
        Student four = new Student("古力娜扎", 25);
        System.out.println(al);
        al.add(one);
        al.add(two);
        al.add(three);
        al.add(four);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i).getName());
            System.out.println(al.get(i).getAge());
        }
        //基本类型只允许使用包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
