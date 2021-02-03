package demo.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaArrayDemo {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("吉安娜", 20),
                new Person("安东尼", 56),
                new Person("牧师", 32)
        };
       /* Arrays.sort(arr, new Comparator<Person>() {//普通匿名内部类实现接口
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //Arrays.sort(arr, Comparator.comparingInt(Person::getAge));
        Arrays.sort(arr, (Person o1, Person o2) -> {//lambda表达式简化实现接口
            return o1.getAge() - o2.getAge();
        });

        Arrays.sort(arr, (o1, o2) -> //lambda表达式简化实现接口，省略写法
                o1.getAge() - o2.getAge()
        );

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
