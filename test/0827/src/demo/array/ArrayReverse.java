package demo.array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(array);
        System.out.println("================");
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        printArray(array);
        System.out.println("================");
        printArray(muti(10, 20, 30));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] muti(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        return array;
    }
}
