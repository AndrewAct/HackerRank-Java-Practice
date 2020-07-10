import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int aLen = a.length();
        int bLen = b.length();

        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean flag = false;

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int[] count = new int[26];
        if (aLen != bLen) {
            flag = false;
        }
        /*
        I assume the existence of count (char array) would help to evaluate the result of
        a and b after operating with a
         */
        for (int i = 0; i < aLen; i++) {
            count[aChar[i] - 97]++;
            count[bChar[i] - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}