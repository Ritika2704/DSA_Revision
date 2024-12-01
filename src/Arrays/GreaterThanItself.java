package Arrays;

// given n array elements count total no. of elements having atleast 1 element greater than itself
// arr[7]=  {-4,3,7,8,9,5,9} ans =6
public class GreaterThanItself {
    public static void main(String[] args) {
        int arr[] = {-4,3,7,8,10,10,9};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == max){
                count++;
            }
        }
         int res = arr.length - count;
        System.out.println(res);
    }
}
