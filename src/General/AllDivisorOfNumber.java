package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
public class AllDivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    printAllDivisors(n);
    }
    public static void printAllDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n%i ==0){
               list.add(i);
               if(i!= n/i){
                   list.add(n/i);
               }
            }
        }
        list.sort(null);
        for(int res : list){
            System.out.print( res + " ");
        }
    }
}

