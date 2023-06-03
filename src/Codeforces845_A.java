import java.util.*;
import java.lang.*;

public class Codeforces845_A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        for(int i=0;i<TestCases;i++){
            int no = sc.nextInt();
            int [] num = new int[no];
            int ans =0;
            for (int j = 0; j < no-1; j++) {
                if((num[j]%2==0 && num[j+1]%2==0))
                    ans++;
            }
            System.out.println(ans/2);

        }
    }
}
