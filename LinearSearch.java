/*
 Find the element 'x' in the array. Take array and x as input
 */

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target of an element : ");
        int target = sc.nextInt();
        boolean flag = false;    // false means not found
        for(int i=0;i<n;i++){
            if(arr[i]==target) {
                flag = true;
                break;
            }
        }
        if(flag==true)
            System.out.println("Element is found ");
        else
            System.out.println("Not found");
    }
}