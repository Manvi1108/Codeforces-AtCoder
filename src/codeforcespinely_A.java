import java.util.*;
import java.lang.*;
public class codeforcespinely_A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(y==z && z==x && x==y)
                System.out.println("YES");
            else if(x-1 > y+z)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
