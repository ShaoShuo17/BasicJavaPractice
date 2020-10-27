package demo.javaBean;

public class AboutStatic {
    public static void main(String[] args) {
        Student one = new Student("oska", 21);
        Student.room = "101";
        Student two = new Student("vyena", 23);
        System.out.println("姓名：" + one.getName() + ",年龄：" + one.getAge() + ",教室：" + Student.room + ",学号：" + one.getId());
        System.out.println("姓名：" + two.getName() + ",年龄：" + two.getAge() + ",教室：" + Student.room + ",学号：" + two.getId());
        //静态方法和静态成员变量属于类，不推荐用对象使用静态方法
        System.out.println(Student.room);
        System.out.println(Student.getIdCounter());
        MyClass mc = new MyClass();
        mc.method();
        MyClass.methodStatic();

        myMethod();
    }

    public static void myMethod() {
        System.out.println("对于本类当中的静态方法，可以省略类名称");
    }
}
