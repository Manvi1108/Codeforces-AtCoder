import java.util.Scanner;

public class atcoderABC294_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ele = input.nextInt();
        int[] arrrr = new int[ele];
        for(int i =0;i<ele;i++){
            arrrr[i] = input.nextInt();
        }
        for(int i =0;i<ele;i++){
            if(arrrr[i]%2==0)
                System.out.print(arrrr[i] + " ");
        }
    }
}
