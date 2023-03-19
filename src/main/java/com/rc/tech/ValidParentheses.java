package com.rc.tech;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(checkValidity("()"));
    }

    public static boolean checkValidity(String s) {
        Stack<Character> chrStack = new Stack<>();
        if (s.length() % 2 != 0)
            return false;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    chrStack.push(c);
                    break;
                case ')':
                    if (chrStack.isEmpty() || chrStack.peek() != '(') return false;
                    break;
                case ']':
                    if (chrStack.isEmpty() || chrStack.peek() != '[') return false;
                    break;
                case '}':
                    if (chrStack.isEmpty() || chrStack.peek() != '{') return false;
                    break;
            }
        }
        return chrStack.isEmpty();
    }
}
