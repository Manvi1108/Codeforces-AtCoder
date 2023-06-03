import java.util.*;
import java.lang.*;

public class Codeforces843_A1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int TESTcases = sc.nextInt();
        for(int i =0;i<TESTcases;i++) {
            String str = sc.nextLine();
            ground(str);
        }
    }
    public static void ground(String str){
        int num = str.length();
        if(str.charAt(0) == str.charAt(num-1)){
            System.out.print(str.substring(0,1)+" "+str.substring(1,num-2)+" "+str.substring(num-1,1));
            return;
        }
        else if(str.charAt(0) != str.charAt(num - 1)){
            for(int j =1;j<num-1;j++){
                if(str.charAt(j)=='a'){
                    System.out.print(str.substring(0,j)+" "+str.substring(j,1)+" "+str.substring(j+1,num-j-1));
                    return;
                }
                else if(str.charAt(j) == 'b'){
                    System.out.print(str.substring(0,1)+" "+str.substring(j,num-j-1)+" "+str.substring(num-1,1));
                    return;
                }
            }
        }
    }
}
