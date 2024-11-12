/*
   Given an array of marks of students,if the marks of any student is less than 35 print its roll number.
   roll number here refers to the index of the array
 */

import java.util.Scanner;
public class BasicArrayQuestion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(arr[i]<35){
                System.out.println("index number is : "+i);
            }
        }
    }
}
