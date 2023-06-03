import java.util.Scanner;

public class coddeforces849_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int manvinumber = input.nextInt();

        while(manvinumber --> 0) {
            int manvilen = input.nextInt();
            String manvistr = input.next();
            int ml =0;
            int mr = manvilen-1;
            int manvires = manvilen;
            boolean count = true;
            while(mr>=ml){
                if((manvistr.charAt(ml)=='1' && manvistr.charAt(mr)=='0') || (manvistr.charAt(ml)=='0' && manvistr.charAt(mr)=='1')){
                    manvires-=2;
                    ml++;
                    mr--;
                }
                else{
                    count = false;
                    break;
                }
            }
            if(count==false)
                System.out.println(manvires);
            else
                System.out.println(manvires);
        }
    }
}
