package Arrays;

public class PrintBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 31 ;
        System.out.println(BinarySearch(arr, target));
    }

    public static int BinarySearch(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j)  / 2; // Corrected midpoint calculation
            if (arr[mid] == target) {
                return mid; // Return index of the target
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1; // Return -1 if target is not found
    }
}
