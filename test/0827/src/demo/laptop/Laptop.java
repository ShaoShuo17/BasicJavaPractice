package demo.laptop;

public class Laptop {
    public void powerOn() {
        System.out.println("laptop power on");
    }

    public void powerOff() {
        System.out.println("laptop power off");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }

}
