import java.util.*;
import java.lang.*;

public class codeforces835_advantage
{
    public static void main(String[] args) {
        Scanner sssc=new Scanner(System.in);
        int m=sssc.nextInt();
        for (int i = 0; i < m; i++) {
            int len=sssc.nextInt();
            int advan[]=new int[len];
            for(int j=0;j<advan.length;j++){
                advan[j]=sssc.nextInt();
            }
            int min=-1;
            int tmp=0;
            for(int k=0;k<advan.length;k++){
                if(advan[k]>advan[tmp]){
                    min=tmp;
                    tmp=k;
                }else if(advan[k]!=advan[tmp]){
                    if(min==-1 || advan[k]>advan[min]){
                        min=k;
                    }
                }
            }
            if(min==-1){
                min=0;
            }
            int small=advan[min];
            int big=advan[tmp];
            int count=0;
            for(int l=0;l<advan.length;l++){
                if(advan[l]==big){
                    count=advan[l]-small;
                    System.out.print(count+" ");
                    count=0;
                }else{
                    count=advan[l]-big;
                    System.out.print(count+" ");
                    count=0;
                }
            }
            System.out.println();

        }
    }
}
