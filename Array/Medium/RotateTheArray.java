package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        optimise(arr,n,d);
    }
    public static void usingTemp(int arr[],int n,int d){
        int temp[]=new int[n];
        int j=0;
        for(int i=d;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void optimise(int arr[],int n,int d){
         d= d%n;


         // rotate first part
         rotateArray(arr,0,d-1);
         //rotate second part
         rotateArray(arr,d,n-1);
         //rotate whole array
         rotateArray(arr,0,n-1);


        System.out.println(Arrays.toString(arr));
    }
    private static int[] rotateArray(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return arr;
    }
}
