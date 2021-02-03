package demo.threadDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("=========多线程============");
        MyThread mt = new MyThread("audeson17");
        //mt.setName("audeson");
        mt.start();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
