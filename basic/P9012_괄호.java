package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012_괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            boolean result = check(arr);
            System.out.println(result ? "YES" : "NO");
        }
    }

    private static boolean check(char[] arr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : arr) {
            if (ch == '(') {
                stack.add(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
