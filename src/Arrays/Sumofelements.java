package Arrays;

import java.util.Scanner;

// Q read the element of n length and print the sum of all element
public class Sumofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter elements");
        int sum =0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if (arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("sum: "+sum);
        System.out.printf("max: "+max);
    }
}
