package demo.innerClass;

public class Weapon {
    private String code;
    private int shanghai;

    public Weapon() {
    }

    public int getShanghai() {
        return shanghai;
    }

    public void setShanghai(int shanghai) {
        this.shanghai = shanghai;
    }

    public Weapon(String code, int shanghai) {
        this.code = code;
        this.shanghai = shanghai;
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
