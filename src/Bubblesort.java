import java.util.*;
import java.lang.*;

//BubbleSort (DAA_Lab1)
//compare two consecutive number in an array if they are not equal swap them
public class Bubblesort{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        PrintArr(arr);
        bubble(arr);
        PrintArr(arr);

    }
    static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j] is they are not at their place
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
