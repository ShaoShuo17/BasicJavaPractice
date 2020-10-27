package demo.innerClass;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("实现类覆盖重写方法");
    }

    @Override
    public void methodA() {
        System.out.println("实现类覆盖重写方法methodA");
    }
}
