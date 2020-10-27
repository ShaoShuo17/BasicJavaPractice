package demo.String;

public class StringTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        String string = getString(a);
        System.out.println(string);
    }

    public static String getString(int[] a) {
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                str += "word" + a[i] + "]";
            } else {
                str += "word" + a[i] + "#";
            }
        }
        return str;
    }
}
