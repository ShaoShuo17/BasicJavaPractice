package demo.interfaceDemo;
//类与类是单继承的。类可以实现多个接口；接口之间是多继承的。
public interface MyInterfaceB extends MyInterface, MyInterfaceA {
    public abstract void methodB();
}
