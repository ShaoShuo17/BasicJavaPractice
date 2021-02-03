package demo.exceptionDemo;

//父类异常什么样，子类异常就什么样
public class Fu {
    public void show1() throws NullPointerException, ClassCastException {
    }

    public void show2() throws IndexOutOfBoundsException {
    }

    public void show3() throws IndexOutOfBoundsException {
    }

    public void show4() {
    }
}

class Zi extends Fu {
    @Override
    public void show1() throws NullPointerException, ClassCastException {
    }

    @Override
    public void show2() throws ArrayIndexOutOfBoundsException {
    }

    public void show3() {
    }

    public void show4() {
    }
}
