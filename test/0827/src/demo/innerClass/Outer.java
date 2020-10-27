package demo.innerClass;

public class Outer {
    int num = 10;

    public class Inner {//成员内部类
        int num = 20;

        public void methodInner() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

    public void methodOuter() {
        class Inner2 {//局部内部类
            int num = 40;

            public void methodInner2() {
                System.out.println(num);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.methodInner2();
    }
}
