package demo.array;

import demo.javaBean.Student;

public class ObjactArray {
    public static void main(String[] args) {
        Student [] array = new Student[3];
        System.out.println(array[1]);
        Student one =new Student("迪丽热巴",22);
        Student two =new Student("马儿扎哈",22);
        Student three =new Student("伊戈达拉",22);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[1].getName());
        System.out.println(array[1]);
    }
} 
