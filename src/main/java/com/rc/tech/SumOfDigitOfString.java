package com.rc.tech;

public class SumOfDigitOfString {

    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;
        // Convert s to integer by replacing each letter with its position in the alphabet
        int num = Integer.parseInt(
                s.chars()
                        .map(c -> c - 'a' + 1)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .toString());

        // Transform the integer by replacing it with the sum of its digits k times
        for (int i = 0; i < k; i++) {
            num = Integer.toString(num)
                    .chars()
                    .map(c -> c - '0')
                    .sum();
        }
        System.out.println(num);
    }

   /* public static int getSumOfDigits(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            sb.append(ch - 'a' + 1);
        }
        int num = Integer.valueOf(sb.toString());
        for(int i = 1; i <= k; i++) {
            int sod = transform(num);
            num = sod;
        }
        return num;
    }

    private static int transform(int num) {
        int sum = 0;
        while(num != 0) {
            int r = num%10;
            sum += r;
            num = num/10;
        }
        return sum;
    }*/
}
