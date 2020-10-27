package demo.interfaceDemo;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void methodAbs() {
        System.out.println("Impl1");
    }

    @Override
    public void methodDefault2() {
        System.out.println("覆盖重写接口的默认方法2");
    }
}
