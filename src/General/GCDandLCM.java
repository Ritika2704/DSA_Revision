package General;

// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

import java.util.Arrays;
import java.util.Scanner;

//solution- explanation
public class GCDandLCM {
    public static void main(String[] args) {
        System.out.println("Enter a and b ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Arrays.toString(lcmAndGcd(a,b)));

    }
    public static int[] lcmAndGcd(int a, int b){
       int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        int arr[]= { lcm, gcd};
                return arr;
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
