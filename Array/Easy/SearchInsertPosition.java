package Array.Easy;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        System.out.println(optimise1(arr,val));
    }
    public static int bruteForce(int arr[],int k){
        for(int i=0;i<arr.length;i++){
             if(arr[i]==k || arr[i]>k) return i;
        }
        return arr.length;
    }
    public static int optimise1(int arr[],int k){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid= low + (high-low)/2;

            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                low=low+1;
            }
            else{
                high=high-1;
            }
        }
        return high+1;
    }
}
