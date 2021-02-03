package demo.threadSafeDemo;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("eat which baozi");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("good taste");
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("do it in 5s");
                    obj.notify();
                }
            }
        }.start();
    }
}
