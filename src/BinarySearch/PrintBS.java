package BinarySearch;

public class PrintBS {
    public static void main(String[] args) {
        int arr[] ={2,4,6,7,8,10,14,16};
        int target = 4;
        System.out.println(binarySearch(arr, target));
    }
    //return the index if target element found
    //return -1 if target element not found
    static int binarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        while(start<= end){
//            int mid = (start+end)/2; --> might be possible that (Start+end) exceed the range of int so we prefer
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                end= mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }
}
