package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class plusOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(addOne(arr,n)));
    }
    public static int[] addOne(int arr[],int n){
        //for storing result we need one arrayList
        ArrayList<Integer>list = new ArrayList<>();

        // what if the length of arr is 0 so there is nothing in array
        if(arr.length==0){
            return new int[]{1};
        }

        // we going to add from the last digit so we have to iterate from the last
        //we have to take carry with us.
        int carry = 0;
        for(int i=n-1;i>=0;i--){

            if(i==n-1){ //for last element
                carry = carry+arr[i]+1;
            }
            else{
                carry+=arr[i];
            }
            //carry % 10 gives us last digit
            list.add(0,carry%10); // we take index here
            // carry/10 gives us reminder
            carry=carry/10;
        }
        // if carry is not zero
        if(carry > 0 ){
            list.add(0,carry);
        }

        // we have to send ans in arrays form
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
