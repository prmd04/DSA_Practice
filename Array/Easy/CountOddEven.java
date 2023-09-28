package Array.Easy;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        oddEven(arr,n);
    }
    public static void oddEven(int arr[],int n){
        int Oddnum=0;
        int Evennum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                Evennum++;
            }else{
                Oddnum++;
            }
        }
        System.out.printf("Even number is %d and Odd number is %d%n",Evennum,Oddnum);
    }
}
