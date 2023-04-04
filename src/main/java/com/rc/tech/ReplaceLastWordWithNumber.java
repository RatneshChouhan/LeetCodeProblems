package com.rc.tech;

import java.util.Scanner;

public class ReplaceLastWordWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        char[] chars = str.toCharArray();
        int wordEnd = chars.length - 1;
        while (wordEnd >= 0 && !Character.isWhitespace(chars[wordEnd])) {
            wordEnd--;
        }
        if (wordEnd >= 0) {
            int wordStart = wordEnd;
            while (wordStart >= 0 && Character.isWhitespace(chars[wordStart])) {
                wordStart--;
            }
            wordStart++;

            StringBuilder sb = new StringBuilder(str);
            sb.replace(wordStart, wordEnd + 1, Integer.toString(num));
            str = sb.toString();
            System.out.println("New string: " + str);
        } else {
            System.out.println("Invalid input string!");
        }
    }
}
