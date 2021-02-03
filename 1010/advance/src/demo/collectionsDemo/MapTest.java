package demo.collectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//统计一个字符串中字符出现的次数
public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer value = map.get(aChar);
                value++;
                map.put(aChar, value);
            } else {
                map.put(aChar, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
