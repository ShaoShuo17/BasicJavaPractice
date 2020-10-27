package demo.innerClass;

/*分类：
成员内部类
局部内部类（包含匿名内部类）*/
public class InnerClassDemo {
    public static void main(String[] args) {
        Body body = new Body();
        body.setName("ccoola");
        body.methodBody();
        System.out.println("===============");
        Body.Heart bh = new Body().new Heart();
        bh.beat();
        System.out.println("=================");
        Outer.Inner oi = new Outer().new Inner();
        oi.methodInner();
        System.out.println("=================");
        Outer outer = new Outer();
        outer.methodOuter();
    }
}
