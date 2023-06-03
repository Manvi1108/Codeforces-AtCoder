import java.util.Scanner;

public class codeforces849_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exapmle = input.nextInt();
        while (exapmle-- > 0) {
            int kitna = input.nextInt();
            String kaise = input.next();
            int manupeeche = 0, manuneeche = 0;
            boolean count = false;
            for (int i = 0; i < kitna; i++) {
                char c = kaise.charAt(i);
                switch (c) {
                    case 'L':
                        manupeeche--;
                        break;
                    case 'R':
                        manupeeche++;
                        break;
                    case 'U':
                        manuneeche++;
                        break;
                    case 'D':
                        manuneeche--;
                        break;
                }
                if(kyahua(manuneeche,manupeeche))
                    count = true;
            }
            System.out.println(count ? "YES" : "NO");
        }
    }
    public static boolean kyahua(int x , int y){
        return x == 1 && y == 1;
    }
}