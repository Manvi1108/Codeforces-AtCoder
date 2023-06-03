import java.util.Scanner;
public class codefocres143_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ttestCs = input.nextInt();
        for (int i = 0; i < ttestCs; i++) {
            int q = input.nextInt();
            int p = input.nextInt();
            String sstr1 = input.next();
            String sstr2 = input.next();
            char[] arr1 = sstr1.toCharArray();
            char[] arr2 = sstr2.toCharArray();
            long count_1 = 0,count_2 = 0;
            for (int j = 1; j < q; j++) {
                if (sstr1.charAt(j) == sstr1.charAt(j-1))
                    count_1++;
            }
            for (int j = 1; j < p; j++) {
                if (sstr2.charAt(j) == sstr2.charAt(j-1))
                    count_2++;
            }
            if((count_1 > 1 || count_2 > 1 )||(count_1 == 1 && count_2 ==1))
                System.out.println("NO");
            else if ((count_2 == 1 || count_1 == 1) &&(arr1[q-1]== arr2[p-1])) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
