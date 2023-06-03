import java.util.*;
import java.lang.*;

public class codeforces832_permutation
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int a = sc.nextInt();
            int b = a / 2 + 1;
            int c = 1;
            for (int i = 1; i <= a / 2; i++) {
                System.out.print(b + " " + c + " ");
                b++;
                c++;
            }
            if (a % 2 != 0) {
                System.out.print(b);
                System.out.println();
            }
        }
    }
}
