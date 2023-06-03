import java.util.Scanner;

public class codeforces858_A
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long example = input.nextLong();
        for(long i =0;i<example ; i++){
            long Aa = input.nextLong();
            long Bb = input.nextLong();
            long Cc = input.nextLong();
            long Dd = input.nextLong();
            if(Dd < Bb) {
                System.out.println("-1");
//                return;
            }
            long abcd =0;
            long res = 0;
            res = Aa + Dd - Bb;
            if(res< Cc){
                System.out.println("-1");

            }
            abcd = (Dd - Bb) + Math.abs(res-Cc);
            System.out.println(abcd);

        }

    }
}
