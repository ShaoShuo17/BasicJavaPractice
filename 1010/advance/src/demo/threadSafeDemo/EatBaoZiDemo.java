package demo.threadSafeDemo;

public class EatBaoZiDemo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        bz.state = false;
        BaoZiPu bzp = new BaoZiPu(bz);
        ChiHuo ch = new ChiHuo(bz);
        bzp.start();
        ch.start();
    }
}
