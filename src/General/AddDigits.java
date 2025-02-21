package General;

//https://leetcode.com/problems/add-digits/

public class AddDigits {
    public static void main(String[] args) {
        int n =79;
        if (n==0) {
            System.out.println(0);
        }
        else {
            int res = n%9==0 ? 9: n%9;
            System.out.println(res);
        }
    }
}
