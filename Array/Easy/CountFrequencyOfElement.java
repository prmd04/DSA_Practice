package Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        optimise1(arr,n);
    }
    public static void bruteForce(int arr[],int n){
        boolean visit[]=new boolean[n];
        Arrays.fill(visit,false);

        for(int i=0;i<n;i++){
            if(visit[i]){
                continue;
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visit[j]=true;
                }
            }
            System.out.printf("The frequency of %d is %d%n",arr[i],count);
        }
    }
    public static void optimise1(int arr[],int n){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.printf("the frequency of %d is %d%n",entry.getKey(),entry.getValue());
        }
    }
}
