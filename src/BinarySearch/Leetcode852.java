package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Leetcode852 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6,7,3,2};
        System.out.println(peakIndexInArray(arr));
    }
    static int peakIndexInArray(int arr[]){
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid = start+ (end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are at dec part of array
                //this may be ans, but look at left
                //this is why end != mid-1
                end = mid;
            }else {
                //you are in asc part of array
                start = mid+1;// because we know the arr[mid+1] > arr[mid]
            }
        }
        //in the end, start==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when theyare pointing to just one element, that is the maximum one because that is the checks say
        // at every point of time for start and end, they have the best possible answer till that time
        return start; // return anything as start ==end
    }
}
