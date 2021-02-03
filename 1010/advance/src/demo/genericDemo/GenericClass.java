package demo.genericDemo;
//含有泛型的类
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    //含有泛型的方法
    public <E> void methodA(E e){
        System.out.println(e);
    }
    //含有泛型的静态方法
    public static <E> void methosB(E e){
        System.out.println(e);
    }
}
