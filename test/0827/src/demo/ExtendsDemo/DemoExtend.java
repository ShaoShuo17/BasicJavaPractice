package demo.ExtendsDemo;

public class DemoExtend {
    public static void main(String[] args) {
        Teacher ma = new Teacher();
        ma.method();
        Assistant kirs = new Assistant();
        kirs.method();
        Employee employee=new Employee();
        System.out.println(employee.num);
        System.out.println(ma.num);
        ma.methodZi();
        ma.methodFu();
        ma.method();
    }
}
