package demo.method;

/**/
public class MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是"+num);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
}
