package demo.javaBean;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("两个数字的和是" + sum);
        int a = num1 > num2 ? num1 : num2;
        System.out.println("请输入第三个数字");
        int num3 = scan.nextInt();
        a = a > num3 ? a : num3;
        System.out.println("三个数字中最大的数字是：" + a);
    }
}
