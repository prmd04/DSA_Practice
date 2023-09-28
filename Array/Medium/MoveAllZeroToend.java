package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroToend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZero(arr,n)));
    }
    public static int[] moveZero(int arr[],int n){
        int i=0;
        for(int x:arr){
            if(x!=0){
                arr[i]=x;
                i++;
            }
        }
        while(i<n){
            arr[i]=0;
            i++;
        }
        return arr;
    }
}
