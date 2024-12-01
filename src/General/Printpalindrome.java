package General;

public class Printpalindrome {
    public static void main(String[] args) {
        int n = 141;
        int copy =n;
        int newNum = 0;
        while(n>0){
            int lastDig = n%10;
            newNum = newNum *10+lastDig;
            n = n/10;
        }
        if( copy == newNum){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }

}
