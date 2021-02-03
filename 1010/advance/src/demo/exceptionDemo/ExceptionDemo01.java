package demo.exceptionDemo;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int e = getElement(arr, 0);
        System.out.println(e);
    }

    private static int getElement(int[] arr, int index) {
        int i = arr[index];
        return i;
    }
}
