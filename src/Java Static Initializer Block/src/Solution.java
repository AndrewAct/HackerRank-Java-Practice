import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag = true;
    // I refered to this doc: 
    // http://onlinejudgesolution.blogspot.com/2017/12/hackerrank-java-solution-java-static.html
    // I don;t know why "static" is necessary
    // But it worked
    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else {
            flag = true;
        }
    }




    public static void main(String[] args){