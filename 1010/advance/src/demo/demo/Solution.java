package demo.demo;

import java.util.HashMap;

public class Solution {
    //回文排列
    public boolean canPermutePalindrome(String s) {
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
        int count = 0;
        for(char c:map.keySet()){
            if(map.get(c)%2!=0){
                count++;
            }
        }
        if(count>1){
            return false;
        }else{
            return true;
        }
    }
}
