package com.rc.tech;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(checkValidity("[(}})]"));
    }

    private static boolean checkValidity(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() != '[') {
                        return false;
                    } else if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() != '{') {
                        return false;
                    } else if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
    /*public static boolean checkValidity(String s) {
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
}*/
