package demo.interfaceDemo;

public interface MyInterface {
    //抽象方法
    public abstract void methodAbs();
    //默认方法
    public default void methodDefault1(){
        System.out.println("接口的默认方法1");
        print();
    }
    public default void methodDefault2(){
        System.out.println("接口的默认方法2");
        print();
    }
    //静态方法
    public static void methodStatic(){
        System.out.println("接口的静态方法，直接由接口名称调用，不需要实现类覆盖重写");
        print2();
    }
    //私有方法：普通私有方法。解决默认方法之间重复代码问题
    private void print(){
        System.out.println("普通私有方法");
        System.out.println("只为默认方法服务");
        System.out.println("实现类不应该能访问到它");
    }
    //私有方法：静态私有方法。解决静态方法之间重复代码问题
    private static void print2(){
        System.out.println("静态私有方法只为静态方法服务");
    }
    //接口中的成员常量
    public static final int NUM = 10;
}
