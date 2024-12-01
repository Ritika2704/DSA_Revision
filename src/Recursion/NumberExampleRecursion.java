package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that take number and print it
        // print first 5 numbers: 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        //if you are calling a function again and again you can treat it as separate function call in the stack
        //This is tail recursion
        //because this is last function call
        print(n+1);
    }

}
