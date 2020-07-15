import java.util.Arrays;

public class stringTriangleTest {
    public static String[] stringTriangle(String word) {
        int l = word.length();
        String[] arr = new String[l];
        // Obviously, the length of output is the same as length of the word
        for (int i = 1; i <= l; i++) {
            arr[i-1] = word.substring(0, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] output1;
        output1 = stringTriangle("1223");
        System.out.println(Arrays.toString(output1));
    }
}
