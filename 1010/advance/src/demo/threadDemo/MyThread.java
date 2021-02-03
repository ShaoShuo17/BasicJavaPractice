package demo.threadDemo;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
        for (int i = 0; i < 5; i++) {
            System.out.println("run" + i);
        }
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);
//        String name = thread.getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
