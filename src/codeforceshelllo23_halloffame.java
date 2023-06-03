import java.util.*;
import java.lang.*;

public class codeforceshelllo23_halloffame
{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args)
    {
        int TESTcases = sc.nextInt();
        answer(TESTcases);
    }
    public static void answer(int n) {
        while (n-->0){
            int num = sc.nextInt();
            String que = sc.next();
            int p = 0;
            int q = 0;
            int r = 0;
            for (int k = 0; k < num-1; k++) {
                if (que.charAt(k)=='L' && que.charAt(k + 1)=='R') {
                    p++;
                    r = k + 1;
                }
                if (que.charAt(k)=='R' && que.charAt(k + 1)=='L') {
                    q++;
                }
            }
            if(q>0){
                System.out.println(0);
            }
            else{
                if(p>0){
                    System.out.println(r);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
