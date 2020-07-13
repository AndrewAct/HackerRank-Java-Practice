import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int k = 0; k < n; k++ ){
            arr[k] = input.nextInt();
        }

        for (int i = 0; i < n; i ++){
            int sum = 0;
            for (int j = i; j < n; j ++){
                sum += arr[j];
                if (sum < 0) {
                    count ++;
                }
            }

        }
        System.out.println(count);
        input.close();
    }
}