import java.util.*;
public class codeforces829_TechnicalSupport
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cases = sc.nextInt();
        ques(cases);
    }
    public static void ques(int n){
        for(int j =0;j<n;j++){
            int a = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int aa = 0;
            int qq = 0;
            for(int i =0;i<a;i++) {
                if (arr[i] == 'Q')
                    qq++;
                else
                    qq = Math.max(0, qq-1);
            }
            if(qq==0)
                System.out.println("yes");
            else{
                System.out.println("No");
            }
        }

    }
}
