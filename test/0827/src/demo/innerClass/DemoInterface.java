package demo.innerClass;

import java.util.ArrayList;
import java.util.List;
//接口作为方法的参数或返回值
public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//左父右子，多态写法
        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("jkl");
        list.add("jdc");
        list.add("lgd");
        list.add("lkj");
        return list;
    }
}
