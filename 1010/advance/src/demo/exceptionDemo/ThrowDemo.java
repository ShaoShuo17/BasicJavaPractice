package demo.exceptionDemo;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int e = getElement(arr, 4);
        System.out.println(e);
    }

    private static int getElement(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("传递数组为空");
        }
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        int i = arr[index];
        return i;
    }
}
