package demo.listSetDemo;
//传递不确定数量参数,可变参数
public class VarArgsDemo {
    public static void main(String[] args) {
        int i = add(2, 3, 5, 6);
        System.out.println(i);
    }

    private static int add(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
