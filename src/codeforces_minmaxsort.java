import java.util.Scanner;
import java.util.Arrays;

public class codeforces_minmaxsort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        while (TestCases --> 0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < len-2; i++){
                if(arr[i] == i)
                    continue;
                else{
                    if(arr[i]!=i) {
                        arr[i] = Math.min(arr[i + 1], arr[i + 2]);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
