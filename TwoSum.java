/*
    Find the doublet in the array whose sum is equal to the given value x
 */
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Element is "+arr[i]+" and element is "+arr[j]);
                }
            }
        }

    }
}
