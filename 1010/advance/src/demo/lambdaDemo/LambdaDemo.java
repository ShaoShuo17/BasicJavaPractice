package demo.lambdaDemo;

//使用lambda表达式，实现多线程
public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("lambda create new thread:" + Thread.currentThread().getName());
        }).start();

        new Thread(() ->//只有一行代码可以省略大括号，分号，return，但必须同时省略
                System.out.println("lambda create new thread:" + Thread.currentThread().getName())
        ).start();
    }
}
