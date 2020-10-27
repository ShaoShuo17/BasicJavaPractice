package demo.method;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1,2,3,4));
    }

    public static int getSum(int a, int b) {
        System.out.println("2个参数");
        int result = a + b;
        return result;
    }

    public static int getSum(int a, int b, int c) {
        System.out.println("3个参数");
        int result = a + b + c;
        return result;
    }

    public static int getSum(int a, int b, int c, int d) {
        System.out.println("4个参数");
        int result = a + b + c + d;
        return result;
    }
}
