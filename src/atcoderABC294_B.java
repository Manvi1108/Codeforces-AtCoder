import java.util.Scanner;

public class atcoderABC294_B
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MM = input.nextInt();
        int HH = input.nextInt();
        int[][] ele = new int[MM][HH];

        for(int i =0;i<MM;i++){
            for(int j =0;j<HH;j++){
                ele[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < MM; i++) {
            StringBuilder S = new StringBuilder();
            for (int j = 0; j < HH; j++) {
                if (ele[i][j] == 0) {
                    S.append('.');
                } else {
                    S.append((char) (ele[i][j] + 'A' - 1));
                }
            }
            System.out.println(S);
        }
    }
}
