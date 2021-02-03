package demo.lambdaDemo;

public class LambdaCookDemo {
    public static void main(String[] args) {
        useCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("匿名内部类重写接口方法");
            }
        });

        useCook(() -> {//无参数无返回值的lambda表达式
            System.out.println("lambda表达式简化接口方法重写");
        });

        useCook(() ->//无参数无返回值的lambda表达式，省略写法
                System.out.println("lambda表达式简化接口方法重写")
        );
    }

    private static void useCook(Cook cook) {
        System.out.println("use cook");
        cook.makeFood();
    }
}
