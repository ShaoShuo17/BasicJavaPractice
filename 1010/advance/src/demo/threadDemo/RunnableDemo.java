package demo.threadDemo;

import demo.threadSafeDemo.SubRunnableImpl;

public class RunnableDemo {
    public static void main(String[] args) {
        SubRunnableImpl sbi = new SubRunnableImpl();
        Thread thread = new Thread(sbi);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}