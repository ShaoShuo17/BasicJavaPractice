package demo.laptop;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        USB usbMouse = new Mouse();
        laptop.useDevice(usbMouse);
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);
        laptop.powerOff();
    }
}
