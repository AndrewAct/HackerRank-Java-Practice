import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aLen = A.length();
        boolean flag = false;
        for (int i = 0; i < aLen; i++) {
            if (A.charAt(i) == A.charAt(aLen - i - 1)){
                flag = true;
            }
            else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        sc.close();

    }
}



