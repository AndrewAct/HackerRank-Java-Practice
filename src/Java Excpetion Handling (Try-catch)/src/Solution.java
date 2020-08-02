import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x / y);
        }
        catch (ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            else {
                System.out.println("java.util.InputMismatchException");
            }
        }
    }
}