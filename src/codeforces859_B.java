import java.util.Scanner;

public class codeforces859_B
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int example = input.nextInt();
        for(int i =0;i<example;i++){
            int mln = input.nextInt();
            int[] mle = new int[mln];
            for(int j = 0;j<mln;j++){
                mle[j] = input.nextInt();
            }
            int MMmm = 0;
            int MBbb = 0;
            for(int j = 0;j<mln;j++){
                if(mle[j]%2==0)
                    MMmm += mle[j];
                else
                    MBbb += mle[j];
            }
            System.out.println((MMmm>MBbb)?"YES":"NO");
        }
    }
}
