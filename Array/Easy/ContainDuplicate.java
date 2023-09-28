package Array.Easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(optimise(arr,n));
    }
    public static boolean bruteForce(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean optimise(int arr[],int n){
        Set<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        return set.size()!=arr.length;
    }
}
