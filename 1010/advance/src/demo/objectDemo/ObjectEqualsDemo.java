package demo.objectDemo;

public class ObjectEqualsDemo {
    public static void main(String[] args) {
        Person one = new Person("马儿扎哈",30);
        Person two = new Person("真皮沙发",18);
        boolean b = one.equals(two);
        System.out.println(b);
    }
}
