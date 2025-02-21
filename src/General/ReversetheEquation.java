package General;

// https://www.geeksforgeeks.org/problems/reversing-the-equation2205/1

import java.util.Arrays;
import java.util.Stack;

public class ReversetheEquation {
    public static void main(String[] args) {
        String S = "20+3-5+67";
        char[] s = S.toCharArray();
        StringBuilder res = new StringBuilder();
        int n = S.length();
        int i = n - 1;
        Stack<Character> temp = new Stack<>();

        while (i >= 0) {
            if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/') {
                while (!temp.isEmpty()) {
                    res.append(temp.pop());
                }
                res.append(s[i]);

            } else {
                temp.push(s[i]);
            }
            i--;
        }

        // Append any remaining characters in the stack
        while (!temp.isEmpty()) {
            res.append(temp.pop());
        }

        System.out.println(res);
    }
}