//you are given an array of integers and an inteder k, your task is to calculate the maximum sum of 'k'
//consecutive elements in that array. if the size of array is less than k then print -1.



import java.io.*;
import java.util.*;
public class solution1 {
    public static void main (String[] args){
        Scanner  sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        if (n<k){
            System.out.println("-1");
            
        }
        else{
            int[] arr= new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxsum=0;
            for(int i=0;i<n-k+1;i++){
                int currentsum=0;
                for(int j=0;j<k;j++){
                    
                currentsum=currentsum+ arr[i+j];
            }
            maxsum = Math.max(currentsum,maxsum);
            
            
        }
        System.out.println(maxsum);
    }
    
      
    
}}
