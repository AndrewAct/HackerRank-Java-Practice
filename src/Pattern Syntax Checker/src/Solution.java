import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases-- >0){
            String pattern = in.nextLine();
            //Write your code
            // Please refer to https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29
            // It will compile your regex to a pattern
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}



