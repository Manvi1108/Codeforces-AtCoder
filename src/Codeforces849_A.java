import java.util.Scanner;

public class Codeforces849_A
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int manvinumber = input.nextInt();
        for(int i =0;i<manvinumber;i++){
            char kya = input.next().charAt(0);
            if(kya=='c'||kya=='o'||kya=='d'||kya=='e'||kya=='f'||kya=='r'||kya=='s')
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
