import java.util.*;
import java.lang.*;

public class codeforces832_swapgame {
    //if smallest element of a array is between i = 2 and i = arr.lengtbh & alice move first she will win for sure
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = sc.nextInt();
        game(cases);
    }

    public static void game(int n) {
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < len; j++) {
                min = Math.min(arr[j],min);
            }
            if (arr[0] == min)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
        }
    }
}
