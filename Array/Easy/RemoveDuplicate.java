package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        removeduplicate1(arr,n);
    }
    public static void removeduplicate(int arr[],int n){
        Arrays.sort(arr);
        int p1=0;
        int p2=1;
        System.out.println("Before remove Duplicate");
        System.out.println(Arrays.toString(arr));
        while(p2<n){
            if(arr[p1]==arr[p2]){
                arr[p2]=0;
                p2++;
            }
            else{
                p1=p2;
                p2++;
            }
        }
        System.out.println("after remove duplicate");
        System.out.println(Arrays.toString(arr));
    }
    public static void removeduplicate1(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(i+1 < n && arr[i]==arr[i+1]){
                count++;
            }
        }
        int ans[]=new int[n-count];
        int p=0;
        for(int i=0;i<n;i++){
            if(i+1 < n && arr[i]==arr[i+1]){
                continue;
            }
            else{
                ans[p++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
