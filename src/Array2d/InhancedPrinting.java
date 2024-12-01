package Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class InhancedPrinting {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        //taking input
        for (int i =0; i<arr.length; i++){  //row part
            for(int j =0; j<arr[i].length; j++){  //column part
                arr[i][j] = sc.nextInt();
            }
        }

        //printing output
//        for(int i=0; i< arr.length; i++){
//            for(int j=0;j<arr[i].length; j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        //printing with toString
//        for(int i =0; i< arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        //with enhanced for loop
        for(int[] a: arr){  // every single is itself an array that is why there is an int [] a
            System.out.println(Arrays.toString(a));
        }
    }
}
