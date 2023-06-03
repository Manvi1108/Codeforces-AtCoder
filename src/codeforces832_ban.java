import java.util.*;
public class codeforces832_ban
{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args)
    {
        int cases = sc.nextInt();
            ban(cases);
    }
    public static void ban(int x){
        for (int a = 0;a<x;a++){
            int  n = sc.nextInt();
            int B = 1;
            int A = 3*n-1;
            System.out.println((n+1)/2);
            while(A>B){
                System.out.println(B+" "+A);
                B += 3;
                A -= 3;
            }
        }
    }
}
