import java.util.Scanner;
import java.util.*;

public class noDuplicates {
    public static boolean noDuplicates(int[] arr) {
        int l = arr.length;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if ((i!=j) && (arr[i] == arr[j])) {
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,2,3,3};
        int[] arr1 = new int[]{1,2,3,4,5,};
        boolean check = noDuplicates(arr);
        boolean check1 = noDuplicates(arr1);
        System.out.println(check);
        System.out.println(check1);
    }
}
