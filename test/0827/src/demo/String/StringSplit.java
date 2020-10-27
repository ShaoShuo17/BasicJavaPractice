package demo.String;

public class StringSplit {
    public static void main(String[] args) {
        String str ="asd,sadf,ghg,rf,bvc,jgl";
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String str1 ="asd.sadf.ghg.rf.bvc";
        String[] arr1 = str1.split("\\.");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
