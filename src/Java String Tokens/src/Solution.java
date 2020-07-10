import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        // It seems we need to remove some spaces
        s = s.trim();


        String[] words = s.split("[^a-zA-Z]");
        System.out.println(words.length);

        for (String word: words){
            System.out.println(word);
        }

        // if length is 0
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
    }
}

