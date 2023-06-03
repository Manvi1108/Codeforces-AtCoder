import java.util.Scanner;

public class codeforces851_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int example = input.nextInt();
        for(int i =0;i<example;i++) {
            int manulen = input.nextInt();
            int manu[] = new int[manulen];
            int fool =0;
            for(int j =0;j<manulen;j++){
                manu[j] = input.nextInt();
                if(manu[j]==2)
                    fool++;
            }
            if((fool & 1) == 1)
                System.out.println("-1");
            else{
                int curr = 0;
                int k =-1;
                for(int j =0;j<manulen;j++){
                    if(manu[j]==2)
                        curr++;
                    if(curr==fool/2)
                    {
                        k=j;
                        break;
                    }
                }
                System.out.println(k+1);
            }
        }
    }
}
