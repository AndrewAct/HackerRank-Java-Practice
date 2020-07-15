import  java.util.Arrays;

public class inRangeTest {
    public static boolean inRange(int[] arr, int min, int max) {
        Arrays.sort(arr);
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

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 5};
        int[] arr1 = new int[]{1,2,3,4,5};
        boolean check1 = inRange(arr, 1, 5);
        boolean check2 = inRange(arr1, 1, 5);
        System.out.println(check1);
        System.out.println(check2);
    }


}
