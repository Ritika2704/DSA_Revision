package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, -5, 6, 7, 8, 9, -3, 4};
        int k = 3;
        k = k % arr.length;
        change(arr, 0, arr.length - 1);
        change(arr, 0, k - 1);
        change(arr, k, arr.length - 1);

        // Print the rotated array
        for (int newarr : arr) {
            System.out.print(newarr + " ");
        }

    }

    public static void change(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}

