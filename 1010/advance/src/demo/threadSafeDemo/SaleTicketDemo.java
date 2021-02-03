package demo.threadSafeDemo;

public class SaleTicketDemo {
    public static void main(String[] args) {
        SubRunnableImpl sbi = new SubRunnableImpl();
        Thread t1 = new Thread(sbi);
        Thread t2 = new Thread(sbi);
        Thread t3 = new Thread(sbi);
        t2.start();
        t3.start();
        t1.start();
    }
}
