package demo.hello;

public class Student {
    String name;
    private int age;//私有成员变量
    private boolean male;

    //    无参构造方法
    public Student() {
        System.out.println("无参构造方法执行");
    }

    //    有参构造方法
    public Student(int age, boolean male) {
        this.age = age;
        this.male = male;
        System.out.println("有参构造方法执行");
    }

    public void sayHello(String name) {
        System.out.println("hello," + name + ".I am " + this.name);
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void show() {
        System.out.println("我叫" + name + ",今年" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("非法数据");
        } else {
            this.age = age;
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
