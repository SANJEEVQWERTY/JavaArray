/*
    Sort the array of 0's and 1's
 */
import java.util.Arrays;
import java.util.Scanner;
public class Sort0and1InArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0};
        int n = arr.length;

        // Method 1
//        int countOne = 0;
//        int countZero = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                countZero++;
//            }
//            else{
//                countOne++;
//            }
//        }
//        for(int i=0;i<countZero;i++){
//            arr[i]=0;
//        }
//        for(int i=countZero;i<n;i++){
//            arr[i]=1;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        // Method -2
        int i = 0;
        int j = n-1;
        while (i < j) {
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}