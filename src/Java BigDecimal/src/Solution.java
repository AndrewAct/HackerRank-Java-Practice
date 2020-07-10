import java.math.BigDecimal;
import java.util.*;
class Solution{
    /*
    A BigDecimal consists of an arbitrary precision integer unscaled value and a 32-bit integer scale.
     */

    /*
    I referred to this video for this problem
    https://www.youtube.com/watch?v=WCXh8vtLpXI
     */

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);
            }
        };

        /*
        Refer to https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
        Sorts the specified range of the specified array of objects to the order
        Included by the specified comparator
         */

        Arrays.sort(s, 0, n, comparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}