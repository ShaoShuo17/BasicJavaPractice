package demo.exceptionDemo;

import java.util.List;

//多异常处理方法
public class MutiExceptionDemo {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        List<Integer> list = List.of(1, 2, 3);
        //System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
    }
}
