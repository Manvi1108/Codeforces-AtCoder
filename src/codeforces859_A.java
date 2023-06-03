import java.util.Scanner;

public class codeforces859_A
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int example = input.nextInt();
        for(int i = 0 ; i < example ; i++){
            int Maa = input.nextInt();
            int Mbb = input.nextInt();
            int Mcc = input.nextInt();
            if(Maa + Mbb == Mcc)
                System.out.println("+");
            else
                System.out.println("-");
        }
    }
}
