package demo.genericDemo;

public class GenericClassMain {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();//默认object类型
        gc.setName("asfd");
        Object name = gc.getName();
        System.out.println(name);

        GenericClass<Integer> gc2 = new GenericClass<>();//创建对象是指定为整数类型
        gc2.setName(64);
        Integer name1 = gc2.getName();
        System.out.println(name1);

        gc.methodA(12);
        gc2.methodA("adsf");
        GenericClass.methosB(2.36);
        //对于含有泛型的接口的使用
        GenericInterfaceImpl gii = new GenericInterfaceImpl();
        gii.method("sdg");
        //在创建实现类对象时才决定泛型类型
        GenericInterfaceImpl2<Integer> gii2 = new GenericInterfaceImpl2<>();
        gii2.method(123);
    }
}
