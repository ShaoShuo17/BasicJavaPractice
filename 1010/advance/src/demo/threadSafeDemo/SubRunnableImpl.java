package demo.threadSafeDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SubRunnableImpl implements Runnable {
    private static int ticket = 40;
    Object obj = new Object();
    Lock l = new ReentrantLock();//锁
    @Override
    public void run() {
        while (ticket != 0) {
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(20L);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }

            /*synchronized (obj) {//同步代码块
                if (ticket > 0) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }*/
            //saleTicketStatic();
        }
    }

    public static synchronized void saleTicketStatic() {//静态同步方法
        if (ticket > 0) {
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    /*public synchronized void saleTicket() {//同步方法
        if (ticket > 0) {
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }*/
}
