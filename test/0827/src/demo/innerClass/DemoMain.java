package demo.innerClass;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImpl();
        obj.method();

        MyInterface face = new MyInterface() {//可以避免创建实现类
            @Override
            public void method() {
                System.out.println("匿名内部类实现接口方法");
            }

            @Override
            public void methodA() {
                System.out.println("匿名内部类实现接口方法methodA");
            }
        };
        face.method();
        face.methodA();
    }
}
