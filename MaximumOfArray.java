/*
 Find the maximum value out of all the element in the array
 */

import java.util.Scanner;
public class MaximumOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is "+max);
    }
}