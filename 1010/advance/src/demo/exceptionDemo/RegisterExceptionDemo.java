package demo.exceptionDemo;

import java.util.Scanner;

public class RegisterExceptionDemo {
    static String [] usersname = {"jkl","369","asd"};
    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册名");
        String username = sc.next();
        check(username);
    }
    public static void check(String name) throws RegisterException {
        for (String username : usersname) {
            if (username.equals(name)){
                throw new RegisterException("sorry");
            }
        }
        System.out.println("okk");
    }
}
