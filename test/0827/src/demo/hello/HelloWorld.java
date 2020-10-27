package demo.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,world!!");
        Student stu = new Student();
        System.out.println(stu.getAge());
        System.out.println(stu.name);
        stu.show();
        System.out.println("================");
        stu.setAge(23);
        stu.name = "JD";
        stu.setMale(true);
        System.out.println(stu.getAge());
        System.out.println(stu.name);
        System.out.println(stu.isMale());
        stu.show();
    }
}
