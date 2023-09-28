package Array.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateFromsortedarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        remove(arr,n);
    }
    public static void remove(int arr[],int n){
        ArrayList<Integer>list = new ArrayList<>();

        int p1=0;
        int p2=1;
        while(p2<n){
            if(arr[p1]==arr[p2]){
                p2++;
            }
            else{
                list.add(arr[p1]);
                p1=p2;
                p2++;
            }
        }
        list.add(arr[p1]);
        System.out.println(list);
    }
}
