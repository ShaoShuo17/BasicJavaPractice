package demo.innerClass;

public class Body {//外部类
    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("boooom,"+name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
