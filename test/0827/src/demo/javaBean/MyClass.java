package demo.javaBean;
//直接在类当中写：
//static{
//        静态代码块的内容
//        }
public class MyClass {
    //静态不能直接访问非静态
    //静态方法中不能使用this关键字
    int num;
    static int numStatic;
    public void method(){
        System.out.println("这是一个普通的成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
//        System.out.println(num);//静态不能直接访问非静态
    }
    //特点：当第一次用到本类时，静态代码块执行唯一的一次
    //静态内容总是优先于非静态的
    static {
        System.out.println("静态代码块执行！");
    }
}
