import javax.swing.*;
import java.util.Scanner;

public class codeforces859_C
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int example = input.nextInt();
        for(int i =0;i<example;i++){
            int llml = input.nextInt();
            String str = input.next();
            if(isthere(str,llml))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    public static boolean isthere(String str,int kya){

        String lnm = "";
        str.replaceAll(""+str.charAt(0),"0");
        for(int i = 1 ;i<kya;i++){
            if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                if(str.charAt(i-1)=='1')
                    lnm = "0";
                else
                    lnm = "1";
                str = str.replaceAll(""+str.charAt(i),lnm);
            }
        }
        for(int j =0; j<kya-1;j++){
            if (str.charAt(j) == str.charAt(j+1)) {
                return true;
            }
        }
        return false;
    }
}
