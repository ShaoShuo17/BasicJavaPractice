package demo.threadSafeDemo;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.state == false) {
                    System.out.println("can't eat it");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("eat it now");
                bz.state = false;
                bz.notify();
                System.out.println("eat over");
            }
        }
    }
}
