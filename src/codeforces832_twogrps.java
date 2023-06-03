import java.util.*;
public class codeforces832_twogrps
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
       int testcases = sc.nextInt();
        two_grp(testcases);
    }
    public static void two_grp(int n)
    {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;

        for(long i = 0;i<n;i++)
        {
            int size = sc.nextInt();
            long[] arr = new long[size];
            long maxsum = 0;
            for(int j = 0; j<size;j++) {
                arr[j] = sc.nextLong();
                maxsum = maxsum + arr[j];
            }
            if(maxsum<0)
                System.out.println(maxsum*-1);
            else
                System.out.println(maxsum);
        }
    }
}
