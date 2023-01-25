package com.rc.tech;

import java.util.Stack;

/*
*
*    Problem Link - https://practice.geeksforgeeks.org/problems/466faca80c3e86f13880710491c634d26abd44a7/1
*/

public class RemovePair {
    public static void main(String[] args) {

        String s = new String("qhmaaallldddd");
        System.out.println(removePair(s));
    }

    public static String removePair(String s) {

        // code here
        Stack<Character> charStk = new Stack<>();
        int i = 0;
        int len = s.length();
        while (i < len) {
            if (charStk.isEmpty() || charStk.peek() != s.charAt(i)) {
                charStk.push(s.charAt(i));
            } else {
                charStk.pop();
            }
            i++;
        }
        String str = new String ();

        StringBuilder result = new StringBuilder();

        if (charStk.isEmpty())
            return "-1";
        else {
            while (!charStk.isEmpty()) {
                result.append(charStk.pop());
            }
        }
        return result.reverse().toString();
    }
}
