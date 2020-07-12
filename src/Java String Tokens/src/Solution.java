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

        // if length is 0
        if (s.length() == 0 || s == null) {
            System.out.println(0);
            return;
        }


        String[] words = s.split("[^A-Za-z]+");
        System.out.println(words.length);


        for (String word: words){
            System.out.println(word);
        }


    }
}

