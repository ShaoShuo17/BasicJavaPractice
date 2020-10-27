package demo.multi;

import demo.ExtendsDemo.Assistant;
import demo.ExtendsDemo.Employee;
import demo.ExtendsDemo.Teacher;

/*对象 instanceof 类名称，将得到一个bool值结果,用于向下转型时类型判断*/
public class InstanceofDemo {
    public static void main(String[] args) {
        Employee lee = new Assistant();
        lee.method();
        methodE(lee);
    }

    public static void methodE(Employee lee) {
        if (lee instanceof Teacher) {
            Teacher ma = (Teacher) lee;
            ma.teach();
        } else {
            Assistant assist = (Assistant) lee;
            assist.assist();
        }
    }
}
