package com.rc.tech;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Nth Fibonacci number is - " + fibN(N));
    }

    public static int fibN(int N) {

        if (N <= 1) return N;

        int fibNMinus_1 = 0;
        int fibNMinus_2 = 1;
        int fibN = 1;
        for (int i = 2; i < N; i++) {

            fibN = fibNMinus_2 + fibNMinus_1;
            fibNMinus_1 = fibNMinus_2;
            fibNMinus_2 = fibN;
        }

        return fibN;

    }
}
