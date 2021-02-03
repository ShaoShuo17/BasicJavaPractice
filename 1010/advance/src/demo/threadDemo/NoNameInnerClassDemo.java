package demo.threadDemo;

public class NoNameInnerClassDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" override Thread");
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " override Runnable");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }
}
