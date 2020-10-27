package demo.multi;

import demo.ExtendsDemo.Assistant;
import demo.ExtendsDemo.Employee;
import demo.ExtendsDemo.Teacher;

//多态中成员方法的规则：编译看左，运行看右
//多态中成员变量的规则：编译看左，运行还看左
/*向上转型：父类引用指向子类对象,左父右子，一定是安全的.
格式：父类名称 对象名 = new 子类名称(); 但是也有弊端，子类特有方法执行不到。*/
/*对象的向下转型,其实是一个“还原”的动作。
格式：子类名称 对象名 = （子类名称）父类对象；将父类对象还原成本来的子类对象*/
public class Multi {
    public static void main(String[] args) {
        //多态的写法，左父右子
        Employee obj = new Teacher();
        obj.method();
        obj.methodFu();
        System.out.println(obj.num);
        obj.showNum();
        System.out.println("=======================");
        //此时访问不到Teacher类中的methodZi(),采用向下转型，将父类对象正确还原为子类即可访问
        //错误写法，编译不报错，运行报错，类转换异常java.lang.ClassCastException
        //Assistant assistant = (Assistant) obj;//还原错误
        Teacher ma = (Teacher) obj;//注意要正确还原
        ma.methodZi();//可以访问到
    }
}
