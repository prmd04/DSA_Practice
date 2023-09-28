package Array.Easy;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxsum(arr,n));
    }
    public static int maxsum(int arr[],int n){
        int maxsum=arr[0];
        int currsum=arr[0];
        for(int i=1;i<n;i++){
            if(currsum>0){
                currsum+=arr[i];
            }
            else{
                currsum=arr[i];
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }

}
