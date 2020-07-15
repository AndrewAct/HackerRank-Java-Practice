public class containTest {
    public static boolean contains(String[] arr, String str) {
        int l = arr.length;
        boolean flag = false;
        for (int i = 0; i < l; i++){
            if (arr[i].equals(str)){
                flag = true;
                break; // I think it is not necessary to keep checking
                // break is risky but convenient
            }
            else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] arr = new  String[]{"Hello", "Goodbye"};
        String str = "Goodbye";
        boolean check = contains(arr, str);
        System.out.println(check);
    }
}
