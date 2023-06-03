import java.util.*;
import java.lang.*;

public class codeforces835_favProb
{
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int n = ssc.nextInt();
        for (int i =0;i<n;i++){
            int len = ssc.nextInt();
            String s = ssc.next();
            char big = 'a';
            for(int k =0;k<len;k++)
                if (s.charAt(k) > big)
                    big = s.charAt(k);
            System.out.println(big - 96);
        }
    }
}
