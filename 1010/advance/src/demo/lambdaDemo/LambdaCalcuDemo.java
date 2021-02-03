package demo.lambdaDemo;

public class LambdaCalcuDemo {
    public static void main(String[] args) {
        useCalc(20, 30, new Calculator() {//匿名内部类
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        useCalc(120, 130, (int a, int b) -> {//lambda表达式
            return a + b;
        });
        useCalc(120, 130, (a, b) -> //lambda表达式，省略模式
                a + b
        );
    }

    private static void useCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("计算结果是" + result);
    }
}
