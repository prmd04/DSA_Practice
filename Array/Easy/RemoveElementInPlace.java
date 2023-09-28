package Array.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementInPlace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        System.out.println(removeElement(arr,val));
    }
    public static int removeElement(int[] arr, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        return list.size();
    }
}
