package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(thirdLargest(arr,n));
    }
    public static int bruteForce(int arr[],int n){
        Arrays.sort(arr);
        return arr[n-3];
    }
    public static int thirdLargest(int arr[], int n)
    {
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        return third;
    }
}
