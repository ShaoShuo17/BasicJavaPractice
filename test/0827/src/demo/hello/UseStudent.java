package demo.hello;

public class UseStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "lucian";
        student.setAge(23);
        print(student);
        Student one = getStudent();
        print(one);
        one.sayHello("pack");
    }

    //以类作为方法参数
    public static void print(Student student) {
        System.out.println(student.name);
        System.out.println(student.getAge());
    }

    //以类作为方法返回值
    public static Student getStudent() {
        Student stu = new Student(28,true);
        stu.name="Oen";
        return stu;
    }
}
