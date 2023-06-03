import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class AtcoderABC288_A
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int example = input.nextInt();
        int target = input.nextInt();
        String [] list = new String[example];
        for (int i = 0; i < example; i++) {
            String str = input.next();
            list[i] = str;
        }
        Arrays.sort(list);
        for (int i = 0; i < target; i++) {
            System.out.println(list[i]);
        }
    }
}
