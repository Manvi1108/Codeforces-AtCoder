import java.util.Scanner;

public class AtcoderABC293_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ss = input.nextLine();
        int size = ss.length();
        char ch[] = ss.toCharArray();
        int len = 0;
        if(size%2==0){
            len = size;
        }
        else{
            len = size-1;
        }
        for(int i = 0;i<len;i=i+2){
            int j = i+1;
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        System.out.println(ch);
    }
}
