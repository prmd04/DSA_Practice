package Array.Easy;

import java.util.Scanner;

public class MinandMaxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minandMax(arr,n);
    }
    public static void minandMax(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.printf("Max value is %d and the Min value is %d",max,min);
    }
}
