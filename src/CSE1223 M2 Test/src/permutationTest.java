import java.util.Arrays;

public class permutationTest {
    public static boolean noDuplicates(int[] arr) {
        int l = arr.length;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            // Not optimized but worked
            for (int j = 0; j < l; j++) {
                if ((i!=j) && (arr[i] == arr[j])) {
                    count ++;
                }
            }
        }

        if (count != 0) {
            flag = false;
        }
        else {
            flag = true;
        }
        return flag;
    }

    public static boolean inRange(int[] arr, int min, int max) {
        Arrays.sort(arr); // Professor said it is allowed to use .sort()
        boolean flag = false;
        int begin = arr[0];
        int end = arr[arr.length -1];
        if ((begin >= min) && (end <= max)) {
            flag = true;
        }
        else {
            flag = false;
        }
        return flag;
    }


    public static boolean isPermutation(int[] arr) {
        int n = arr.length; // I didn't know what n is, so set it as the length of array
        boolean flag = false;
        Arrays.sort(arr);
        flag = (noDuplicates(arr) && (inRange(arr, 1, n)));
        return flag;
    }

    public static void main(String[] args) {
        int[] notPerm2 = {1,2,2,2,3};
        System.out.println(isPermutation(notPerm2));
    }
}
