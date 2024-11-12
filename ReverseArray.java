/*
    Write a program to reverse the array without using any extra array
 */

public class ReverseArray{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Method - 1

//        for(int i=0;i<n/2;i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        // Method - 2

        int i = 0;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
