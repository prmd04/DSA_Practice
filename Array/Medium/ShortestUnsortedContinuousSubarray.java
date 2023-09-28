package Array.Medium;

//Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray
// arr[s..e] such that sorting this subarray makes the whole array sorted.
//Examples:

//If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program
// should be able to find that the subarray lies between indexes 3 and 8.
//If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], your program should be
// able to find that the subarray lies between indexes 2 and 5.


import java.util.Arrays;
import java.util.Scanner;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(unsortedArr(arr,n)));
    }
    public static int[] unsortedArr(int arr[],int n){
        int temp[]=Arrays.copyOf(arr,n);

        Arrays.sort(temp);
        int s=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=temp[i]) {
                s = i;
                break;
            }
        }
        int e=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=temp[i]){
                e=i;
                break;
            }
        }
        return new int[]{s,e};
    }
}
