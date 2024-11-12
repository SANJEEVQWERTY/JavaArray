/*
    Sort the array of 0's,1's and 2's. (Dutch flag Algorithm)
 */
public class Sort0and1and2 {
    public static void main(String[] args){
        int[] arr ={0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;

        // Method - 1
//          int countZero=0;
//        int countOne = 0;
//        int countTwo = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                countZero++;
//            }
//            else if(arr[i]==1){
//                countOne++;
//            }
//            else{
//                countTwo++;
//            }
//        }
//        for(int i=0;i<countZero;i++){
//            arr[i]=0;
//        }
//        for(int i=countZero;i<countZero+countOne;i++){
//            arr[i]=1;
//        }
//        for(int i=countZero+countOne;i<n;i++){
//            arr[i]=2;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        // Method - 2

        // Method - 2  Dutch Flag Algorithm
        int mid = 0;
        int low = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {  // arr[mid] = 2
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
