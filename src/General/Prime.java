package General;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            System.out.println("false it is not prime");
            return;
        }
        if(num ==2){
            System.out.println("true it is prime");
            return;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                   break;
                }
            }
            if(isPrime){
                System.out.println("True it is prime");
            }else{
                System.out.println("False it is not prime");
            }
        }


    }
}
