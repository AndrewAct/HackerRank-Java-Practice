import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int op = input.nextInt();

        BitSet bs1 = new BitSet(size);
        BitSet bs2 = new BitSet(size);

        while (op -- > 0) {
            String s = input.next();
            int i = input.nextInt();
            int j = input.nextInt();

            switch (s) {
                case("AND"):
                    if (i == 1) {
                        bs1.and(bs2);
                    } else {
                        bs2.and(bs1);
                    }
                    break;
                case("OR"):
                    if (i == 1) {
                        bs1.or(bs2);
                    }
                    else {
                        bs2.or(bs1);
                    }
                    break;
                case("XOR"):
                    if (i == 1) {
                        bs1.xor(bs2);
                    }
                    else{
                        bs2.xor(bs1);
                    }
                    break;
                case("FLIP"):
                    if (i == 1) {
                        bs1.flip(j);
                    }
                    else {
                        bs2.flip(j);
                    }
                    break;
                case("SET"):
                    if (i == 1){
                        bs1.set(j);
                    }
                    else {
                        bs2.set(j);
                    }
                    break;

            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }
        input.close();

    }
}