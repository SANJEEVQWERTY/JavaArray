/*
 Find the second largest element in the given array
 */

import java.util.Scanner;
public class FindSecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Search Maximum element of an array");
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Find Second Maximum element is ");
        int secondMaximum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                secondMaximum = Math.max(secondMaximum,arr[i]);
            }
        }
        System.out.println("Second maximum is "+secondMaximum);
    }
}
