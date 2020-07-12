//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    static boolean primality(int n){
//        if (n <= 1) return false;
//
//        for (int i = 2; i < n; i ++)
//            if (n % i == 0)
//                return false;
//
//        return true;
//    }
//
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String n = scanner.nextLine();
//        int num = Integer.parseInt(n);
//
//        if (! primality(num)){
//            System.out.println("not prime");
//        }
//        else {
//            System.out.println("prime");
//        }
//        scanner.close();
//    }
//}
// The code above worked for small numbers
// But failed for on large numbers

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static boolean primality(int n){
         if (n <= 1) return false;
         if (n == 2 || n == 3) return true;

         for (int i = 5; i * i < n; i+= 6)
             if (n % i == 0 || n % ( i + 2) == 0)
                 return false;

         return true;
     }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = scanner.nextLine();
        BigInteger num = new BigInteger(scanner.next());
        System.out.println(num.isProbablePrime(10)? "prime": "not prime");
    }
}

