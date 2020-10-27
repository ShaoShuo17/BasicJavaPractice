package demo.hello;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    //    实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
    public boolean isUnique(String astr) {
        boolean bool = true;
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                bool = false;
                break;
            }
        }
        return bool;
    }

    //字符串重排问题
    public boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean tag = false;
        if (s1.length() != s2.length()) {
            tag = false;
        } else {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] == chars2[i]) {
                    tag = true;
                } else {
                    tag = false;
                    break;
                }
            }
        }
        return tag;
    }

    /*      在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
      但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。*/
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                num = nums[i];
                //break;
            }
        }
        return num;
    }

    /*URL化。编写一种方法，将字符串中的空格全部替换为%20。
    假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
            （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）*/
    public String replaceSpaces(String S, int length) {
        char[] s = S.toCharArray();
        int j = S.length() - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[j--] = '0';
                s[j--] = '2';
                s[j--] = '%';
            } else {
                s[j--] = s[i];
            }
        }
        return String.valueOf(s, j + 1, S.length() - j - 1);
    }

    public boolean canPermutePalindrome(String s) {
        boolean flag= true;
        int num = 1;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == chars[i + 1]) {
                i = i + 1;
                flag = true;
            }else {
                if (num==1){
                    num=2;
                }else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }


}

