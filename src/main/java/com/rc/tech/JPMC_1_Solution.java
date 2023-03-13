package com.rc.tech;

/*
A String is provided as input from consol which consist of integer values, Insert '*' if subsequent no are EVEN
and insert '-' if subsequent no are ODD
INPUT: 21462675756 => OUTPUT: 214*6*2*67-5-7-56
INPUT: 986765555533 => OUTPUT: 98*6765-5-5-5-3-3
*/

import java.util.Scanner;

public class JPMC_1_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String");
        String input = sc.nextLine();
        System.out.println("Input number is : " + input);

        StringBuilder sb = new StringBuilder();
        int len = input.length();

        for (int i = 0; i < len - 1; i++) {
            int i1 = input.charAt(i) - '0';
            int i2 = input.charAt(i + 1) - '0';
            if (i1 % 2 == 0 && i2 % 2 == 0) {
                sb.append(i1).append('*');
            } else if (i1 % 2 == 1 && i2 % 2 == 1) {
                sb.append(i1).append('-');
            } else {
                sb.append(i1);
            }
        }
        sb.append(input.charAt(len - 1));
        System.out.println("OUTPUT: " + sb.toString());
    }
}
