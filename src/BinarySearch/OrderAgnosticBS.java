package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] ={90,87,67,56,45,4,3,2};
        int target =3;
        System.out.println(orderAgnosticBs(arr, target));
    }
    //Order Agnostic BinarySearch means array is sorted but we don't know sorted in Asc or Desc order
    static int orderAgnosticBs(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[start]< arr[end];
        while(start< end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            } else { // Descending order
                if (arr[mid] < target) { // Descending means target < arr[mid] reduces `start`
                    end = mid - 1;
                } else { // Descending means target > arr[mid] increases `start`
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
