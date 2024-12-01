package BinarySearch;

/**
 ceiling of a number -- smallest element in array greater or equal to target
 arr ={3,4,5,6,7,8,12,16,17,18}, target = 15 --> ans =16
 arr ={3,4,5,6,7,8,12,16,17,18}, target = 12 --> ans =12
 take out the number that is equal or greater than target
 so here to get the ans when target is not present and we have smallest greatest number
 --> when the while condition fails it becomes (e< s) here we get the ans we will return s(start)
 * **/

public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,8,12,16,17,18};
        int target = 12;
        System.out.println(ceillingNumber(arr, target));
    }

    //return the index of smaller no. >= target
    static int ceillingNumber(int[] arr, int target ){
// but if the target number is the largest than largest number in the array
        if(target == arr.length-1){
            return -1;
        }
        int start =0; int end =arr.length-1;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target> arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start;
    }
}
