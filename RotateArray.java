/*
    Rotate the given array 'a' by k steps,where k is non-negative.
    Note - k can be greater than n as well where n is the size of array 'a'
    rotate means last element appends forward the first element
 */
import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void reverse(int[] arr,int i,int j){
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k%n;
        reverse(arr,0,n-k-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverse(arr,n-k,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
