import java.util.Arrays;
import java.util.Scanner;

public class codeforces_gamingforce
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        while(TestCases --> 0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
            }
            int ones = 0;
            for(int i = 0; i < len; i++){
                if(arr[i]==1)
                    ones++;
            }
            int shared = 0;
            if(ones%2==0)
                shared = ones/2;
            else
                shared = ones/2 +1;
            int kill = len - ones;
            int total = shared + kill;
            System.out.println(total);
        }
    }
}
