package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(optimise1(arr1,arr2,n1,n2)));
    }
    public static int[] bruteForce(int arr1[],int arr2[],int n1,int n2){
        int ans[]=new int[n1+n2];
        int p=0;

        for(int i=0;i<n1;i++){
            ans[p++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            ans[p++]=arr2[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    public static int[] optimise1(int arr1[],int arr2[],int n1,int n2){
        int p1=0;
        int p2=0;
        int p=0;
        int ans[]=new int[n1+n2];
        while(p1<n1 && p2<n2){
            if(arr1[p1]>arr2[p2]){
                ans[p++]=arr2[p2++];
            }
            else{
                ans[p++]=arr1[p1++];
            }
        }
        while(p1<n1){
            ans[p++]=arr1[p1++];
        }
        while(p2<n2){
            ans[p++]=arr2[p2++];
        }
        return ans;
    }
}
