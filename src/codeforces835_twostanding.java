import java.util.*;
import java.lang.*;
public class codeforces835_twostanding
{
    public static void main(String[] args)
    {
        Scanner ssc = new Scanner(System.in);
        int n = ssc.nextInt();
        for (int i =0;i<n;i++){
            int p = ssc.nextInt();
            int q = ssc.nextInt();
            int r = ssc.nextInt();
            if ((p < q && q < r) || (r < q && q < p))
                System.out.println(q);
            else if ((q < p && p < r) || (r < p && p < q))
                System.out.println(p);
            else
                System.out.println(r);
        }

    }
}
