import java.util.*;
import java.lang.*;

public class codeforces835_valley
{
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int n = ssc.nextInt();
        for (int i =0;i<n;i++){
            int len = ssc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = ssc.nextInt();
            }
            int min = 1;
            for (int j = 0; j < len; j++) {
                min = 0;
                while((arr[j+1] >= arr[j]) && j<len-1 )
                    j++;
                if(j==len-1){
                    System.out.println("Yes");
                    break;
                }
                else{
                    System.out.println("NO");
                }
            }
            if(min==1)
                System.out.println("YES");
        }
    }
}
