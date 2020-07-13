//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner input = new Scanner(System.in);
//
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        int n, q;
//        String command;
//        n = input.nextInt();
//        for (int i = 0; i < n; i++){
//            int val = input.nextInt();
//            list.add(val);
//        }
//
//        q = input.nextInt();
//        for (int i = 0; i < q; i++){
//            command = input.next();
//            int index = input.nextInt();
//            int element = input.nextInt();
//            if (command.equals("INSERT")){
//                list.add(index, element);
//            }
//            else {
//                list.remove(index);
//            }
//
//        }
//        input.close();
//
//        for (Integer number: list){
//            System.out.println(number + " ");
//        }
//    }
//}

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner input = new Scanner(System.in);
//
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        int n, q;
//        String command;
//        n = input.nextInt();
//        for (int i = 0; i < n; i++){
//            int val = input.nextInt();
//            list.add(val);
//        }
//
//        q = input.nextInt();
//        for (int i = 0; i < q; i++){
//            command = input.next();
//            //int index = input.nextInt();
//            //int element = input.nextInt();
//            if (command == "Insert"){
//                int index = input.nextInt();
//                int element = input.nextInt();
//                list.add(index, element);
//            }
//            else {
//                int index = input.nextInt();
//                list.remove(index);
//            }
//
//        }
//        input.close();
//
//        for (Integer number: list){
//            System.out.print(number + " ");
//        }
//    }
//}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<Integer>();
        int n, q;
        String command;
        n = input.nextInt();
        for (int i = 0; i < n; i++){
            int val = input.nextInt();
            list.add(val);
        }

        q = input.nextInt();
        for (int i = 0; i < q; i++){
            command = input.next();
            //int index = input.nextInt();
            //int element = input.nextInt();
            if (command.equals("Insert")){
                int index = input.nextInt();
                int element = input.nextInt();
                list.add(index, element);
            }
            else {
                int index = input.nextInt();
                list.remove(index);
            }

        }
        input.close();

        for (Integer number: list){
            System.out.print(number + " ");
        }
    }
}