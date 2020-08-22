//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Solution {
//
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//
//        Boolean flag = false;
//        if(a != null && b != null) {
//            char tempArr1[] = a.toLowerCase().toCharArray();
//            char tempArr2[] = b.toLowerCase().toCharArray();
//            Arrays.sort(tempArr1);
//            Arrays.sort(tempArr2);
//
//
//            String newA = tempArr1.toString();
//            String newB = tempArr2.toString();
//            flag = newA.equals(newB);
//        }
//
//        return flag;
//    }
//
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//}
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int aLen = a.length();
        int bLen = b.length();
        if (a != null && b != null && aLen == bLen) {
            int[] charFreq = new int[26];
            //int[] charFreq2 = new int[26];

            for (int i = 0; i < a.length(); i++) {
                int index = a.toLowerCase().charAt(i) - 'a';
                charFreq[index]++;

            }

            for (int i = 0; i < b.length(); i++) {
                int index = b.toLowerCase().charAt(i) - 'a';
                charFreq[index]--;
            }

            for (int i = 0; i < 26; i++) {
                if (charFreq[i] != 0) return false;
            }
        }
        return true;
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
