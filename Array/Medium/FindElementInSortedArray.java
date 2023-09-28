package Array.Medium;

import java.util.Scanner;

public class FindElementInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(search(arr,n,x));
    }
    public static int search(int arr[],int n,int x){
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid= low + (high-low)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=low+1;
            }
            else{
                high=high-1;
            }

        }
        return -1;
    }
}
