package demo.interfaceDemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        MyInterfaceImpl impl1 = new MyInterfaceImpl();
        impl1.methodAbs();
        impl1.methodDefault1();
        impl1.methodDefault2();
        System.out.println("====================");
        MyInterfaceImpl2 mi2 =new MyInterfaceImpl2();
        mi2.methodAbs();
        mi2.methodDefault1();
        System.out.println("====================");
        MyInterface.methodStatic();
        System.out.println(MyInterface.NUM);
    }
}
