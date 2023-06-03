import java.util.Scanner;
public class codeforces857_A
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ttestCs = input.nextInt();
        for (int i = 0; i < ttestCs; i++) {
            int size = input.nextInt();
            int[] ele = new int[size];
            for(int k =0;k<size;k++){
                ele[k] = input.nextInt();
            }
            int pos = 0;
            int neg = 0;
            for(int k =0;k<size;k++){
                if(ele[k] > 0)
                    pos++;
                else
                    neg++;
            }
        }
    }
}
