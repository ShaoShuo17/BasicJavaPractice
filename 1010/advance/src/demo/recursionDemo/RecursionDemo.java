package demo.recursionDemo;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(jiecheng(5));
    }

    private static int jiecheng(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jiecheng(n - 1);
        }
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + sum(i - 1);
        }
    }

}
