import java.util.*;
import java.lang.*;


public class codeforcesEducationalRound_A
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int TESTcases = sc.nextInt();
        int temp;
        for(int i =0;i<TESTcases;i++){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for(int j=0;j<num;j++){
                arr[i] = sc.nextInt();
            }
            boolean isit = true;
            for(int j = 2;j<=num;j++){
                if(arr[j] == arr[j-1]+arr[j-2]) {
                    isit = false;
                    break;
                }
            }
            if(isit){
                System.out.println("YES");
                for(int j =0; j<num;j++){
                    System.out.print(arr[j]+" ");
                }
                continue;
            }
            for(int j = 1;j<=num;j++){
                for(int k = 1;k<=num;k++){
                    if(j==k)
                        continue;
                    swapping(arr[j],arr[k]);
                    isit = true;
                    for(int l= 2;l<=num;l++){
                        if(arr[l] == arr[l-1]+arr[l-2]){
                            isit = false;
                            break;
                        }
                    }
                    if(isit){
                        System.out.println("Yes");
                        for(int l = 1;l<= num;l++)
                            System.out.print(arr[l]+" ");
                        break;
                    }
                    swapping(arr[j],arr[k]);
                }
                if(isit)
                    break;
            }
            if(!isit)
                System.out.println("NO");
        }
    }
    static void swapping(int m, int n)
    {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
    }
}
