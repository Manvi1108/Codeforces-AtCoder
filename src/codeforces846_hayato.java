import java.util.Arrays;
import java.util.Scanner;

public class codeforces846_hayato
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        while (TestCases-- > 0) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            int one = 0;
            int zero = 0;
            for (int i = 0; i < len; i++) {
                if(arr[i]%2==0)
                    zero++;
                else
                    one++;
            }
            int odd1,even1;
            if(one >= 1 && zero >=2){
                odd1 = 1;
                even1 = 2;
                System.out.println("YES");
                for (int i = 0; i < len; i++) {
                    if(arr[i]%2==0 && even1 != 2) {
                        int j = i+1;
                        System.out.print(j+" ");
                        even1--;
                    }
                    if(arr[i]%2!=0 && odd1 !=0) {
                        int j = i+1;
                        System.out.print(j+" ");
                        odd1--;
                    }
                }
            }
            else if (one >= 3) {
                System.out.println("YES");
                int count = 3;
                for (int i = 0; i < len; i++){
                    if(arr[i]%2 != 0 && count!=0) {
                        int j = i+1;
                        System.out.print(j+" ");
                        count--;
                    }
                }
            }
            else
                System.out.println("NO");
        }
    }
}
