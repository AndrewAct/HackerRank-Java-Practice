import java.util.*;
import java.io.*;

/*
Note
If you are doing the problem
Do not rename the class in the console like me
It won't work
 */
class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int total = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++ ){
                if(j==0){
                    total += (a + (int)Math.pow(2,j) * b);
                }
                else{
                    total += ((int)Math.pow(2,j) * b);
                }
                System.out.print(total +" ");
            }
            System.out.println();
        }
        in.close();
    }
}