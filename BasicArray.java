import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args){
        Scanner college = new Scanner(System.in);
        System.out.println("Enter size of an Array ");
        int n = college.nextInt();
        // arr declaration
          int[] arr = new int[n];
        // input
        for(int i=0;i<n;i++){
            arr[i] = college.nextInt();
        }
        // output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
