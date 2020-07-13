import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, d, q, x, y;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        List<List<Integer>> sets = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++){
            ArrayList<Integer> set = new ArrayList<Integer>();
            d = input.nextInt();

            for (int j = 0; j < d; j++){
                set.add(input.nextInt());
            }
            sets.add(set);
        }

        q = input.nextInt();
        for (int i = 0; i < q; i ++){
            x = input.nextInt();
            y = input.nextInt();
            if (y > sets.get(x-1).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(sets.get(x-1).get(y-1));
            }
        }

        input.close();

    }
}