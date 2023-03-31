package com.rc.tech;

public class GroupPhotoProblem {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 1, 9, 8, 7};
        int len = arr.length;
        int mx = Integer.MIN_VALUE;

        for (int i = 1; i < len - 1; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int maxTotal = Math.max(arr[0] + arr[len - 1], Math.max(arr[0] + mx, arr[len - 1] + mx));
        System.out.println("Maximum total of first and last value " + maxTotal);
    }
}
