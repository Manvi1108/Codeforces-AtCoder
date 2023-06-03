import java.util.Scanner;
import java.util.Arrays;

public class codeforces_standupcomedian
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int TestCases = sc.nextInt();
            while (TestCases-- > 0) {
                int T1 = sc.nextInt();
                int T2 = sc.nextInt();
                int T3 = sc.nextInt();
                int T4 = sc.nextInt();
                int alice,bob,res,temp;
                bob = alice = res = T1;
                while(T2>0 || T3>0 || T4>0){
                    if(bob>0 && T2>0){
                        temp = Math.min(T2,bob);
                        bob -= temp;
                        alice += temp;
                        res += temp;
                        T2 -= temp;
                    }
                    else if(alice > 0 && T3 >0){
                        temp = Math.min(T3,alice);
                        alice -= temp;
                        bob += temp;
                        res += temp;
                        T3 -= temp;
                    }
                    else if (alice >0 && bob>0 && T4>0) {
                        temp = Math.min(T4,Math.min(alice,bob));
                        res += temp;
                        alice -= temp;
                        bob -= bob;
                        T4 -= temp;
                    }
                    else{
                        if(T2!=0||T3!=0||T4!=0)
                            res++;
                        break;
                    }
                }
                System.out.println(res);
            }
        }
}
