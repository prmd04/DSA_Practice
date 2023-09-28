package Array.Easy;

import java.util.Scanner;

public class CountPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(prime(arr,n));
    }
    public static int prime(int arr[],int n){
      int count=0;
      for(int number:arr){
          if(isPrime(number)){
              count++;
          }
      }
      return count;
    }

    private static boolean isPrime(int number) {
        if(number<=1){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
