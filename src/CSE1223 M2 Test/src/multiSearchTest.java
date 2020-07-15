import java.util.ArrayList;
import java.util.Arrays;

public class multiSearchTest {
    public static int[] multiIndexOf(String[] text, String[] queries) {
        int textL = text.length;
        int queryL = queries.length;
        int[] arr = new int[queryL];
        for (int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for (int i = 0; i < queryL; i++) {
            for (int j = 0; j < textL; j++) {
                if (queries[i].equals(text[j])) {
                    arr[i] = j;
                    break;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        String[] text1 = new String[]{"Hello", "Goodbye"};
        String[] queries1 = new String[]{"Goodbye", "Go Bucks!", "Hello"};
        String[] text2 = new String[]{"Knock", "Knock", "Hello", "Goodbye"};
        String[] queries2 = new  String[]{"Goodbye", "Knock", "Knock"};
        int[] arr = multiIndexOf(text1, queries1);
        int[] arr2 = multiIndexOf(text2, queries2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
