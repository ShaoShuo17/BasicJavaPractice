package demo.laptop;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("keyboard open");
    }

    @Override
    public void close() {
        System.out.println("keyboard close");
    }

    public void type() {
        System.out.println("keyboard type");
    }
}
