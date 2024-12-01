package BinarySearch;

public class Leetcode34 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
            int [] arr ={-1,-1};
        arr[0] = search(nums, target, true);
        if(arr[0] != -1) {
            arr[1] = search(nums, target, false);
        }
            return arr;
    }
    //this method just return the index value of target
     int search(int[] arr, int target, boolean findStartIndex ){

        int ans =-1;
        int start =0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(target <arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                //potential ans found
              ans = mid;
              if(findStartIndex == true){
                  end = mid-1;
              }else {
                  start = mid+1;
              }
            }
        }
        return ans;
    }

}
