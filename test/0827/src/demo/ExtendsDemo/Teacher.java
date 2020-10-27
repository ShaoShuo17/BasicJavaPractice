package demo.ExtendsDemo;

public class Teacher extends Employee {
    public int num = 20;

    public Teacher() {
        System.out.println("子类构造方法");
    }
    @Override
    public void showNum(){
        System.out.println(num);
    }

    public void methodZi(){
        int num =30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println("子类方法执行");
    }
    @Override
    public void method(){
        System.out.println("子类重名方法执行");
    }

    public void teach(){
        System.out.println("teach");
    }


}
