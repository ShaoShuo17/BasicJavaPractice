package demo.interfaceDemo;

public class MyInterfaceImpl2 implements MyInterface {
    @Override
    public void methodAbs() {
        System.out.println("Impl2");
    }

    @Override
    public void methodDefault1() {
        System.out.println("覆盖重写接口的默认方法1");
    }
}
