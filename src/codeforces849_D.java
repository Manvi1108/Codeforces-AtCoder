import java.util.Scanner;
import java.util.HashMap;
public class codeforces849_D
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int manvinumber = input.nextInt();
        while (manvinumber-->0) {
            int manvilen = input.nextInt();
            String manvistr = input.next();
            int manures=0;
            HashMap<String, Integer> manu = new HashMap<>();
            manu.clear();
            for(int i =0;i<manvilen;i++){
//                manu.put(manvistr.charAt(i),);
            }
            for(int i =0;i<manu.size();i++){
                manures=Math.max(manures, i);
            }
            System.out.println(Math.min(manvilen-manures+1,manures));
        }
    }
}
