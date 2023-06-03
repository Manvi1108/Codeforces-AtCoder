import java.util.ArrayList;
import java.util.Scanner;

public class AtcoderABC293_B
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        Boolean[] visited = new Boolean[len];
        ArrayList<Integer> res = new ArrayList<>();
        int[] ele = new int[len];
        for(int i =0;i<len;i++){
            ele[i] = input.nextInt();
            visited[i] = false;
        }

        for(int i =0;i<len;i++){
            if(visited[i] != true){
                visited[ele[i]-1] = true;
            }
        }

        for (int i = 0; i < len; i++) {
            if(visited[i]!=true)
                res.add(i+1);
        }
        System.out.println(res.size());
        for (int i =0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
