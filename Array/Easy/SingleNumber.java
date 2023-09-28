package Array.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(optimise1(arr,n));
    }
    public static int bruteForce(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=false;
                }
            }
            if(flag){
                return arr[i];

            }
        }
        return -1;
    }
    public static int optimise1(int arr[],int n){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(HashMap.Entry<Integer,Integer>mm:map.entrySet()){
            if(mm.getValue()==1){
                return mm.getKey();
            }
        }
        return -1;
    }
}
