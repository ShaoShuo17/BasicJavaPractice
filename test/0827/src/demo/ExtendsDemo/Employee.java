package demo.ExtendsDemo;

public class Employee {
    public int num = 10;

    public Employee() {
        System.out.println("父类构造方法");
    }

    public void methodFu(){
        System.out.println(num);
        System.out.println("父类方法执行");
    }

    public void method() {
        System.out.println("父类重名方法执行");
    }

    public void showNum(){
        System.out.println(num);
    }

}
