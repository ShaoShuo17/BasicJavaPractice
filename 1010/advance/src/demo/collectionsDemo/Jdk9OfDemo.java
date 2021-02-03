package demo.collectionsDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jdk9OfDemo {
    public static void main(String[] args) {
        List<String> list = List.of("d", "d", "gf");//使用of方法之后不能再添加元素
        System.out.println(list);
        //list.add("hgj");//UnsupportedOperationException不支持操作异常
        //System.out.println(list);
        Set<String> set = Set.of("sdf", "as", "rtr");//set使用of不能有重复元素,
        // IllegalArgumentException: duplicate element: as
        System.out.println(set);

        Map<String, Integer> map = Map.of("sd", 20, "asdf", 52, "trr", 32);
        //map.put("sdfg",24);//UnsupportedOperationException
        System.out.println(map);
    }
}
