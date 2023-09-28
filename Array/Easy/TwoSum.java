package Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(bruteForce(arr,n,target)));
    }
    public static int[] optimise1(int arr[],int n,int target){

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }
    public static int[] bruteForce(int arr[],int n,int target){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
